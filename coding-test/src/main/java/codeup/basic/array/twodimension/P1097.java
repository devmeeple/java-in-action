package codeup.basic.array.twodimension;

import java.util.Scanner;

public class P1097 {

    private static final int BOARD_SIZE = 19;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[BOARD_SIZE][BOARD_SIZE];

        readBoard(board, scanner);

        int flipCount = scanner.nextInt();
        for (int i = 0; i < flipCount; i++) {
            int rowToFlip = scanner.nextInt() - 1;
            int columnToFlip = scanner.nextInt() - 1;
            flipCross(board, rowToFlip, columnToFlip);
        }

        printBoard(board);
        scanner.close();
    }

    private static void readBoard(int[][] board, Scanner scanner) {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = scanner.nextInt();
            }
        }
    }

    private static void flipCross(int[][] board, int rowToFlip, int columnToFlip) {
        flipRow(board, rowToFlip);
        flipColumn(board, columnToFlip);
    }

    private static void flipRow(int[][] board, int rowToFlip) {
        for (int column = 0; column < board.length; column++) {
            if (board[rowToFlip][column] == 0) {
                board[rowToFlip][column] = 1;
            } else {
                board[rowToFlip][column] = 0;
            }
        }
    }

    private static void flipColumn(int[][] board, int columnToFlip) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][columnToFlip] == 0) {
                board[row][columnToFlip] = 1;
            } else {
                board[row][columnToFlip] = 0;
            }
        }
    }

    private static void printBoard(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column]);
                if (column != board[row].length -1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
