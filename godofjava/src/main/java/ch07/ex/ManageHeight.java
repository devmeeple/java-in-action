package ch07.ex;

public class ManageHeight {
    int[][] gradeHeights;

    public static void main(String[] args) {
        ManageHeight manager = new ManageHeight();

        manager.setData();
//        for (int classNo = 1; classNo <= 5; classNo++) {
//            manager.printHeight(classNo);
//        }

        int classNo = 1;
        while (true) {
            if (classNo > 5) {
                break;
            }
            manager.printAverage(classNo);

            classNo++;
        }
    }

    public void setData() {
        gradeHeights = new int[][]{
                {170, 180, 173, 175, 177},
                {160, 165, 167, 186},
                {158, 177, 187, 176},
                {173, 182, 181},
                {170, 180, 165, 177, 172}
        };
    }

    public void printHeight(int classNo) {
        System.out.println("Class No.: " + classNo);
        for (int height : gradeHeights[classNo - 1]) {
            System.out.println(height);
        }
    }

    public void printAverage(int classNo) {
        double sum = 0;
        double average = 0;

        System.out.println("Class No.: " + classNo);
        for (int height : gradeHeights[classNo - 1]) {
            sum += height;
        }
        average = sum / gradeHeights[classNo - 1].length;
        System.out.println("Height Average: " + average);
    }
}
