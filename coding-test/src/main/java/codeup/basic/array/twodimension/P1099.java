package codeup.basic.array.twodimension;

import java.util.Scanner;

public class P1099 {

    private static final int MAZE_SIZE = 10;
    private static final int WALL = 1;
    private static final int FOOD = 2;
    private static final int PATH = 9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] maze = new int[MAZE_SIZE][MAZE_SIZE];

        for (int row = 0; row < maze.length; row++) {
            for (int column = 0; column < maze[row].length; column++) {
                maze[row][column] = scanner.nextInt();
            }
        }

        int antRow = 1;
        int antColumn = 1;
        while (true) {
            if (maze[antRow][antColumn] == FOOD) {
                maze[antRow][antColumn] = PATH;
                break;
            }
            maze[antRow][antColumn] = PATH;
            if (maze[antRow][antColumn + 1] != WALL) {
                antColumn++;
                continue;
            }
            if (maze[antRow + 1][antColumn] != WALL) {
                antRow++;
                continue;
            }
            break;
        }

        for (int row = 0; row < maze.length; row++) {
            for (int column = 0; column < maze[row].length; column++) {
                System.out.print(maze[row][column]);
                if (column != maze[row].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
