package c.middle;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary calculator = new CalculateSalary();
        calculator.calculateSalaries();
    }

    public void calculateSalaries() {
        Employee[] employees = {
                new Employee("LeeDaeRi", 1, 1_000_000_000),
                new Employee("KimManager", 2, 100_000_000),
                new Employee("WhangDesign", 3, 70_000_000),
                new Employee("ParkArchi", 4, 80_000_000),
                new Employee("LeeDevelop", 5, 60_000_000)
        };

        for (Employee employee : employees) {
            long salaryIncrease = getSalaryIncrease(employee);
            System.out.println(employee.getName() + "=" + salaryIncrease);
        }
    }

    public long getSalaryIncrease(Employee employee) {
        int type = employee.getType();
        long salary = employee.getSalary();

        double increaseRate = switch (type) {
            case 1 -> -0.95;
            case 2 -> 0.1;
            case 3 -> 0.2;
            case 4 -> 0.3;
            case 5 -> 1.0;
            default -> 0;
        };

        return salary + (long) (salary * increaseRate);
    }
}
