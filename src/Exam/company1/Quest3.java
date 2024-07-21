package Exam.company1;

import java.util.Arrays;
public class Quest3 {

        public int solution(int [][] arr)
        {
            int answer = 0;
            int end = 0;
            Arrays.sort(arr, (o1,o2)->{
                // 종료시간이 같을 경우 시작시간이 빠른순으로 정렬
                //if(o1[1] == o2[1])  return o1[0]- o2[0];
                //return Integer.compare(o1[1], o2[1]); //종료시간이 빠른순
                return o1[1] == o2[1] ? o1[0]- o2[0] : o1[1] - o2[1];
            });

            for(int i=0; i< arr.length; i++){
                if(end <= arr[i][0]){ //겹치지 않는 다음회의 시작시간
                    answer++;
                    end = arr[i][1]; //종료시간업데이트
                }
            }
            return answer;

        }

}
