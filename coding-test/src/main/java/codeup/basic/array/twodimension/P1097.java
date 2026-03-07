package codeup.basic.array.twodimension;

import java.util.Scanner;

public class P1097 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[19][19];

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = scanner.nextInt();
            }
        }

        int flipCount = scanner.nextInt();
        for (int i = 0; i < flipCount; i++) {
            int rowToFlip = scanner.nextInt() - 1;
            int columnToFlip = scanner.nextInt() - 1;

            for (int column = 0; column < board.length; column++) {
                if (board[rowToFlip][column] == 0) {
                    board[rowToFlip][column] = 1;
                } else {
                    board[rowToFlip][column] = 0;
                }
            }

            for (int row = 0; row < board.length; row++) {
                if (board[row][columnToFlip] == 0) {
                    board[row][columnToFlip] = 1;
                } else {
                    board[row][columnToFlip] = 0;
                }
            }
        }

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column]);
                if (column != board[row].length -1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
