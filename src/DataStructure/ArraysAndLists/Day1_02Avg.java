package DataStructure.ArraysAndLists;

import java.util.Scanner;
//#1546
public class Day1_02Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int sum = 0;
        int max = 0;
        for(int i=0; i<n ; i++){
            num[i] = sc.nextInt();
            sum += num[i];
        }
        for(int i=0; i<n ; i++){
           if(num[i]>max) max=num[i];
        }
        System.out.println(sum*100.0/max/n);
        //sum, max가 int형이기 떄문에 나누기를 하면 나머지값이 버림받아진다
        //그래서 두 변수를 나누기할때 sum/(double)max 하던지
        //100.0을 하면 자동으로 더블형계산이 된다.
        //말씀하신 부분은 sum과 max가 long형으로 선언이 되어있기 때문에 소수점 부분이 버림이 되기 때문입니다.
        //예를들어 sum = 32, max = 17이면 sum / max = 1 이라는 값이 나옵니다.
        // 때문에 값이 다르게 나오게 됩니다. 만약 순서를 해당 방식으로 하고 싶다면
        // sum / (double)max 이런식으로 형변환을 하여 주시면됩니다. 감사합니다. :)
    }
}
