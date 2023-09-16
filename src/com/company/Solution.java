package com.company;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String str = "string";
        int n = 5;
        int len = str.length();
        if( 1<=len && len<=10 && 1<=n && n<=5){
            for(int i=0;i<n; i++){
                System.out.print(str);
            }
        }

    }
}
