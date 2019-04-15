package com.dbabych.lemon.java.finalproject;

import java.util.Scanner;

public class CaesarСipher extends Сryptography  {

        public String EncryptCaesar (){
            int key = 1;
            Scanner scan = new Scanner(System.in);
            System.out.print("Type text: ");
            String text = scan.nextLine();
            char[] textArray = text.toCharArray();
            for (int j = 0; j < textArray.length; j++) {
                for (int i = 0; i < arrayUpper.length; i++){
                    if (textArray[j] == arrayUpper[i]) {
                        if ((i + key) < arrayUpper.length) {
                            textArray[j] += key;
                            break;
                        } else {
                            textArray[j] += key - 26;
                        }
                    } else if (textArray[j] == arrayLowwer[i]) {
                        if ((i + key) < arrayLowwer.length) {
                            textArray[j] += key;
                            break;
                        } else {
                            textArray[j] += key - 26;
                        }
                    }
                }
            }
            String str = String.valueOf(textArray);
            return  str;
    }

    public String DecryptionCaesar (){
        int key = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Type text: ");
        String text = scan.nextLine();
        char[] textArray = text.toCharArray();
        for (int j = 0; j < textArray.length; j++) {
            for (int i = 0; i < arrayUpper.length; i++){
                if (textArray[j] == arrayUpper[i]) {
                    if ((i - key) < arrayUpper.length) {
                        textArray[j] -= key;
                        break;
                    } else {
                        textArray[j] -= key + 26;
                    }
                } else if (textArray[j] == arrayLowwer[i]) {
                    if ((i - key) < arrayLowwer.length) {
                        textArray[j] -= key;
                        break;
                    } else {
                        textArray[j] -= key + 26;
                    }
                }
            }
        }

        String str = String.valueOf(textArray);
        return  str;
    }
}


