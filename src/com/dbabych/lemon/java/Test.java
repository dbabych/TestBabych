package com.dbabych.lemon.java;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        char[] arrayLowwer = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int n = arrayLowwer.length;
        Scanner scan = new Scanner(System.in);
        System.out.print("Type text: ");
        String text = scan.nextLine();
        char[] textArray = text.toCharArray();

        System.out.print("Type key: ");
        String key = scan.nextLine();
        char[] keyArray = key.toCharArray();
        String rez = "";
        char[] newKey = new char[textArray.length];
        char[] encryptedMsg = new char[textArray.length];
        for (int f = 0; f < textArray.length; f++) {
            for (int k = 0, i = 0; i < textArray.length; k++, i++) {
                if (k == keyArray.length) {
                    k = 0;
                }
                newKey[i] = keyArray[k];
                encryptedMsg[f] = (char) (((encryptedMsg[f] + newKey[f]) % n )+'a');

            }


        }
        String str = String.valueOf(encryptedMsg);
        System.out.println(str);
    }
}




