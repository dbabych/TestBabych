package com.dbabych.lemon.java.finalproject;

import java.util.*;

public class VigeneraCipher extends Сryptography {

    public String Encrypt() {
        int N = arrayUpper.length;
        String key = "EFG";
        Scanner scan = new Scanner(System.in);
        System.out.print("Type text: ");
        String text = scan.nextLine();
        char [] keyArray = key.toCharArray();
        char[] textArray = text.toCharArray();
            for (int k = 0 ; k < textArray.length; k++){
                    if(k == keyArray.length ){
                        k = 0;
                    }
                    for (int t = 0; t < textArray.length; t++) {
                        for (int a = 0; a < arrayUpper.length; a++){


                if (textArray[t] == arrayUpper[a]) {
                            textArray[t] =(char) (((textArray[t]+ keyArray[k])%N ) + 65);
                    System.out.println("Посчитали");
                        break;

                    }
                }
                }
                }



        String str = String.valueOf(textArray);
        return  str;

    }
}




