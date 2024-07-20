package DataStructure.ArraysAndLists;

import java.util.Scanner;
//#11720
public class Day1_01SumString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] str = sc.next().toCharArray();
        int sum = 0;
        for(int i=0; i<str.length; i++){
            sum+=str[i]-'0';
        }
        System.out.println(sum);
    }
}
