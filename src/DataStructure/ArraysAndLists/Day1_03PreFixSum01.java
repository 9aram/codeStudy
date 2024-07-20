package DataStructure.ArraysAndLists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//#11659
public class Day1_03PreFixSum01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long[] s = new long[suNo+1];//배열은 인덱스를 0부터 세는데 우리는 합배열을 구하기 위해서 0부터 세지 않기 때문에
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=1; i<=suNo; i++){
            s[i]=s[i-1]+Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int q=0; q<quizNo; q++ ){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(s[j]-s[i-1]);
        }
    }
}

