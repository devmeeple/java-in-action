package codeup.basic.array.twodimension;

import java.util.Scanner;

public class P1098 {

    private static final int HORIZONTAL = 0;
    private static final int VERTICAL = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boardHeight = scanner.nextInt();
        int boardWidth = scanner.nextInt();
        int[][] board = new int[boardHeight][boardWidth];

        int stickCount = scanner.nextInt();

        for (int i = 0; i < stickCount; i++) {
            int stickLength = scanner.nextInt();
            int direction = scanner.nextInt();
            int startRow = scanner.nextInt() - 1;
            int startColumn = scanner.nextInt() - 1;

            placeStick(board, stickLength, direction, startRow, startColumn);
        }

        printBoard(board);
        scanner.close();
    }

    private static void placeStick(int[][] board, int stickLength, int direction, int startRow, int startColumn) {
        if (direction == HORIZONTAL) {
            placeHorizontalStick(board, stickLength, startRow, startColumn);
            return;
        }
        if (direction == VERTICAL) {
            placeVerticalStick(board, stickLength, startRow, startColumn);
        }
    }

    private static void placeHorizontalStick(int[][] board, int stickLength, int startRow, int startColumn) {
        for (int offset = 0; offset < stickLength; offset++) {
            board[startRow][startColumn + offset] = 1;
        }
    }

    private static void placeVerticalStick(int[][] board, int stickLength, int startRow, int startColumn) {
        for (int offset = 0; offset < stickLength; offset++) {
            board[startRow + offset][startColumn] = 1;
        }
    }

    private static void printBoard(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                if (column > 0) {
                    System.out.print(" ");
                }
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
    }
}
