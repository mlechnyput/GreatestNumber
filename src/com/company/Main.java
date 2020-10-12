package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str = scan.nextLine();
        meth(str);
    }

    private static void meth(String str) {
        Object[] arr;
        Vector v = new Vector(2, 1);
        String strNum = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                strNum += str.charAt(i);
                if (!Character.isDigit(str.charAt(i + 1))) {
                    v.addElement(Integer.parseInt(strNum));
                    strNum="";
                }
            }
        }
        arr = v.toArray();
        Arrays.sort(arr);
        System.out.print("The greatest number in the string is "+arr[arr.length-1]);
    }
}
