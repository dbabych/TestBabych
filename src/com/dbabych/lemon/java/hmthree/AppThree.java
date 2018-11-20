package com.dbabych.lemon.java.hmthree;

import java.util.Random;

public class AppThree {

    static char[][] arr = new char[10][10];

    public static void main(String args[]) {
        initialization();
        replacement();
    }

    static void initialization() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Random r = new Random();
                arr[i][j] = (char) (r.nextInt(26) + 'a');
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void replacement() {
        System.out.println("_____________" + "\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                Random rn = new Random();
                int c = rn.nextInt(10);
                Random rnd = new Random();
                arr[i][c] = (char) (rnd.nextInt(26) + 'a');
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}