package Exam.company1;

import java.util.Arrays;
public class Quest2 {

        static final int INF = Integer.MAX_VALUE;
        public int solution(int N, int[][] road, int K) {
            int[][] d = new int[N+1][N+1];
            //초기화
            //무한대로 초기화한다
            for(int i = 0 ; i <= N ; i++)
                Arrays.fill(d[i], INF);
            //나 자신은 0으로 초기화 한다
            for(int i = 1 ; i <= N ; i++)
                d[i][i] = 0;

            // 입력값 중 더 작은 값으로 갱신
            for(int[] r : road) {
                d[r[0]][r[1]] = Math.min(d[r[0]][r[1]], r[2]);
                d[r[1]][r[0]] = Math.min(d[r[0]][r[1]], r[2]);;
            }
            //플로이드-워셜
            for(int k = 1 ; k <= N ; k++) { // 경유 지점 (1~N)
                for(int i = 1 ; i <= N ; i++) { // 출발지 i (1~N)
                    for(int j = 1 ; j <= N ; j++) { // 도착지 j (1~N)
                        if(i == j || j == k || k == i)  continue;

                        if(d[i][k] != INF && d[k][j] != INF) {    // (i,k)와 (k,j)를 연결 가능한 경우
                            d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                        }
                    }
                }
            }

            int answer = 0;
            for(int i = 1 ; i <= N ; i++) {
                if(d[1][i] <= K)
                    answer++;
            }

            return answer;

        }

}
