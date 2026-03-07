package codeup.basic.array.twodimension;

import java.util.Scanner;

public class P1096 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] board = new int[19][19];
        int whiteStoneCount = scanner.nextInt();

        for (int i = 0; i < whiteStoneCount; i++) {
            int row = scanner.nextInt();
            int column = scanner.nextInt();
            board[row - 1][column - 1] = 1;
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
