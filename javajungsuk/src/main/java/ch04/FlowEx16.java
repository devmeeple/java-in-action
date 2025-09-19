package ch04;

public class FlowEx16 {
    public static void main(String[] args) {
        System.out.printf("%-8s%-8s%-10s%-8s%-8s%-8s%-8s%n",
                "i", "2*i", "2*i-1", "i*i", "11-i", "i%3", "i/3");
        System.out.println("-------------------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-8d%-8d%-10d%-8d%-8d%-8d%-8d%n",
                    i, 2 * i, 2 * i - 1, i * i, 11 - i, i % 3, i / 3);
        }
    }
}
