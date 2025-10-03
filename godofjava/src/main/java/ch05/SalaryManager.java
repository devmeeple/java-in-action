package ch05;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager manager = new SalaryManager();
        int yearlySalary = 20_000_000;

        System.out.println("실수령 월급여 = " + manager.getMonthlySalary(yearlySalary));
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthlySalary = yearlySalary / 12.0;
        System.out.println("총 월급여(공제 전) = " + monthlySalary);

        double tax = calculateTax(monthlySalary);
        double nationalPension = calculateNationalPension(monthlySalary);
        double healthInsurance = calculateHealthInsurance(monthlySalary);

        double totalDeductions = tax + nationalPension + healthInsurance;

        System.out.println("근로소득세 = " + tax);
        System.out.println("국민 연금 = " + nationalPension);
        System.out.println("건강 보험료 = " + healthInsurance);

        monthlySalary -= totalDeductions;
        return monthlySalary;
    }

    public double calculateTax(double monthlySalary) {
        double tax = 12.5 / 100;
        return monthlySalary * tax;
    }

    public double calculateNationalPension(double monthlySalary) {
        double nationalPension = 8.1 / 100;
        return monthlySalary * nationalPension;
    }

    public double calculateHealthInsurance(double monthlySalary) {
        double healthInsurance = 13.5 / 100;
        return monthlySalary * healthInsurance;
    }
}
