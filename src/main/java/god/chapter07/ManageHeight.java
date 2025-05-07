package god.chapter07;

/**
 * Chapter 7. 여러 데이터를 하나에넣을 수는 없을까요?
 * 학생의 키를 관리하는 프로그램
 */
public class ManageHeight {
    int[][] gradeHeights = new int[5][];

    public static void main(String[] args) {
        ManageHeight manager = new ManageHeight();
        manager.setData();
        System.out.println("결과");
        for (int classNo = 1; classNo <= 5; classNo++) {
//            manager.printHeight(classNo);
            manager.printAverage(classNo);
        }
    }

    public void printHeight(int classNo) {
        System.out.println("Class No.:" + classNo);
        for (int height : gradeHeights[classNo - 1]) {
            System.out.println(height);
        }
    }

    public void printAverage(int classNo) {
        double sum = 0;
        int studentCount = gradeHeights[classNo - 1].length;

        System.out.println("Class No.:" + classNo);

        for (int height : gradeHeights[classNo - 1]) {
            sum += height;;
        }
        System.out.println("Height Average: " + sum / studentCount);
    }

    public void setData() {
        gradeHeights[0] = new int[]{170, 180, 173, 175, 177};
        gradeHeights[1] = new int[]{160, 165, 167, 186};
        gradeHeights[2] = new int[]{158, 177, 187, 176};
        gradeHeights[3] = new int[]{173, 182, 181};
        gradeHeights[4] = new int[]{170, 180, 165, 177, 172};
    }
}
