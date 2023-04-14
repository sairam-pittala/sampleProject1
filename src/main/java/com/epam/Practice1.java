package com.epam;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        String temp = "";
        for(int i=0; i<s.length(); i++) {
            if((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57) {
                temp += s.charAt(i);
            }
            else{
                if(temp.length() != 0) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        sum += Integer.parseInt(temp);
        System.out.println(sum);
    }
}
