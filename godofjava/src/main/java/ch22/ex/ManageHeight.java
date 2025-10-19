package ch22.ex;

import java.util.ArrayList;
import java.util.Arrays;

public class ManageHeight {
    private ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<>();

    public static void main(String[] args) {
        ManageHeight manager = new ManageHeight();

        manager.setData();
        for (int classNo = 1; classNo <= 5; classNo++) {
//            manager.printHeight(classNo);
            manager.printAverage(classNo);
        }
    }

    public void setData() {
        gradeHeights = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(170, 180, 173, 175, 177)),
                        new ArrayList<>(Arrays.asList(160, 165, 167, 186)),
                        new ArrayList<>(Arrays.asList(158, 177, 187, 176)),
                        new ArrayList<>(Arrays.asList(173, 182, 181)),
                        new ArrayList<>(Arrays.asList(170, 180, 165, 177, 172))
                )
        );
    }

    public void printHeight(int classNo) {
        ArrayList<Integer> classHeight = gradeHeights.get(classNo - 1);

        System.out.println("Class No.: " + classNo);
        for (int height : classHeight) {
            System.out.println(height);
        }
    }

    public void printAverage(int classNo) {
        ArrayList<Integer> classHeight = gradeHeights.get(classNo - 1);
        double sum = 0;

        System.out.println("Class No.: " + classNo);
        for (int height : classHeight) {
            sum += height;
        }
        int studentCount = classHeight.size();
        double average = sum / studentCount;

        System.out.println("Height Average: " + average);
    }
}
