package codeup.basic.array.twodimension;

import java.util.Scanner;

public class P1098 {

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

            if (direction == 0) {
                for (int offset = 0; offset < stickLength; offset++) {
                    board[startRow][startColumn + offset] = 1;
                }
            } else {
                for (int offset = 0; offset < stickLength; offset++) {
                    board[startRow + offset][startColumn] = 1;
                }
            }
        }

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column]);
                if (column != board[row].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
