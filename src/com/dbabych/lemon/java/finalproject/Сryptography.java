package com.dbabych.lemon.java.finalproject;

import java.util.*;

 class Сryptography {

     public char[] arrayUpper = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
             'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
     public char[] arrayLowwer = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
             'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


    public static void main(String[] args) {
        CaesarСipher caesar = new CaesarСipher();
        VigeneraCipher vigenera = new VigeneraCipher();
        //System.out.println(caesar.EncryptCaesar());
        //System.out.println(caesar.DecryptionCaesar());
        System.out.println(vigenera.Encrypt());
        }
    }

