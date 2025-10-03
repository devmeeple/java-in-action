package ch06;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager manager = new InterestManager();

        for (int day = 10; day <= 370; day += 10) {
            double amount = manager.calculateAmount(day, 1000000);
            System.out.println(day + "일 : " + amount);
        }
    }

    public double getInterestRate(int day) {
        double interest;

        if (day >= 365) {
            interest = 5.6;
        } else if (day >= 181) {
            interest = 2;
        } else if (day >= 91) {
            interest = 1;
        } else {
            interest = 0.5;
        }
        return interest;
    }

    public double calculateAmount(int day, long amount) {
        double totalAmount;
        double interest = getInterestRate(day);
        double interestAmount = amount * interest / 100.0;
        totalAmount = amount + interestAmount;
        return totalAmount;
    }
}
