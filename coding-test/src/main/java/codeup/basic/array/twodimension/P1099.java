package codeup.basic.array.twodimension;

import java.util.Scanner;

public class P1099 {

    private static final int MAZE_SIZE = 10;
    private static final int WALL = 1;
    private static final int FOOD = 2;
    private static final int PATH = 9;
    private static final int START_ROW = 1;
    private static final int START_COLUMN = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] maze = new int[MAZE_SIZE][MAZE_SIZE];

        readMaze(scanner, maze);
        moveAnt(maze);
        printMaze(maze);

        scanner.close();
    }

    private static void readMaze(Scanner scanner, int[][] maze) {
        for (int row = 0; row < maze.length; row++) {
            for (int column = 0; column < maze[row].length; column++) {
                maze[row][column] = scanner.nextInt();
            }
        }
    }

    private static void moveAnt(int[][] maze) {
        int antRow = START_ROW;
        int antColumn = START_COLUMN;

        while (true) {
            if (isFood(maze, antRow, antColumn)) {
                markPath(maze, antRow, antColumn);
                break;
            }
            markPath(maze, antRow, antColumn);
            if (canMoveRight(maze, antRow, antColumn)) {
                antColumn++;
                continue;
            }
            if (canMoveDown(maze, antRow, antColumn)) {
                antRow++;
                continue;
            }
            break;
        }
    }

    private static boolean isFood(int[][] maze, int row, int column) {
        return maze[row][column] == FOOD;
    }

    private static void markPath(int[][] maze, int row, int column) {
        maze[row][column] = PATH;
    }

    private static boolean canMoveRight(int[][] maze, int antRow, int antColumn) {
        return maze[antRow][antColumn + 1] != WALL;
    }

    private static boolean canMoveDown(int[][] maze, int antRow, int antColumn) {
        return maze[antRow + 1][antColumn] != WALL;
    }

    private static void printMaze(int[][] maze) {
        for (int row = 0; row < maze.length; row++) {
            for (int column = 0; column < maze[row].length; column++) {
                System.out.print(maze[row][column]);
                if (column != maze[row].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
