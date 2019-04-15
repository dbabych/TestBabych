package ua.kh.dbabych.training.tictactoedemo;

import java.util.*;

public class TicTacToeDemo {

    static int numberOfmoves = 0;
    static boolean finishGame = false;
    static char[][] arr = new char[3][3];

    public static void main(String[] args) {
        GameTicTacToe();
    }

    static void GameTicTacToe() { // Начало игры ;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) { // Заполняем двумерный массив чаров значением '-' ;
            for (int j = 0; j < 3; j++) {
                arr[i][j] = '-';
            }
        }
        while (finishGame == false) { // Пока не настал конец игры - будет делать ходы;
            System.out.print("Первый игрок (X), укажите число по горизонтале от 0 ... 2 : ");
            int a = scan.nextInt();
            System.out.print("Первый игрок (X), укажите число по вертикале от 0 ... 2 : ");
            int b = scan.nextInt();
            System.out.println();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[a][b] = 'X';
                    System.out.print(arr[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.println();
            numberOfmoves++;
            if (numberOfmoves >= 9) {
                Draw();
            }
            if (numberOfmoves > 4) {
                ChekWinner();
            }
            if (finishGame == false) {
                System.out.print("Второй игрок (O), укажите число по горизонтале от 0 ... 2 : ");
                int c = scan.nextInt();
                System.out.println("Второй игрок (O), укажите число по вертикале от 0 ... 2 : ");
                int d = scan.nextInt();
                System.out.println();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        arr[c][d] = 'O';
                        System.out.print(arr[i][j] + " | ");
                    }
                    System.out.println();
                }
                System.out.println();
                numberOfmoves++;
                if (numberOfmoves > 5) {
                    ChekWinner();
                }
            }
        }
    }

    public static void ChekWinner() {
        if (arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2] && arr[0][0] != '-') {
            System.out.println("Победил игрок :" + arr[0][0]);
            finishGame = true;
            EndGame();
        } else if (arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2] && arr[1][0] != '-') {
            System.out.println("Победил игрок " + arr[1][0]);
            finishGame = true;
            EndGame();
        } else if (arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2] && arr[2][0] != '-') {
            System.out.println("Победил игрок :" + arr[2][0]);
            finishGame = true;
            EndGame();
        } else if (arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0] && arr[0][0] != '-') {
            System.out.println("Победил игрок :" + arr[0][0]);
            finishGame = true;
            EndGame();
        } else if (arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1] && arr[0][1] != '-') {
            System.out.println("Победил игрок :" + arr[0][1]);
            finishGame = true;
            EndGame();
        } else if (arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2] && arr[0][2] != '-') {
            System.out.println("Победил игрок :" + arr[0][2]);
            finishGame = true;
            EndGame();
        } else if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[0][0] != '-') {
            System.out.println("Победил игрок :" + arr[0][0]);
            finishGame = true;
            EndGame();
        } else if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[0][2] != '-') {
            System.out.println("Победил игрок :" + arr[0][2]);
            finishGame = true;
            EndGame();
        }
    }


    static void Draw() {
        finishGame = true;
        System.out.println("Конец игры ! Ничья !");
    }

    static void EndGame() {
        finishGame = true;
        System.out.println("Конец игры ! Поздравляем Вас !");
    }


}
