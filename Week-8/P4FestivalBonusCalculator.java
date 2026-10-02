import java.util.Scanner;

interface EmployeeBonus {
    double calculateBonus(double salary);
}

class FullTimeEmployee implements EmployeeBonus {
    public double calculateBonus(double salary) {
        return salary * 0.10;
    }
}

class PartTimeEmployee implements EmployeeBonus {
    public double calculateBonus(double salary) {
        return salary * 0.05;
    }
}

class InternEmployee implements EmployeeBonus {
    public double calculateBonus(double salary) {
        return 2000;
    }
}

public class P4FestivalBonusCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double totalBonus = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            EmployeeBonus employee;

            if (type.equals("FULLTIME")) {
                employee = new FullTimeEmployee();

            } else if (type.equals("PARTTIME")) {
                employee = new PartTimeEmployee();

            } else {
                employee = new InternEmployee();
            }

            double bonus = employee.calculateBonus(salary);

            System.out.printf("%s: %.2f%n", name, bonus);
            totalBonus += bonus;
        }

        System.out.printf("Total Bonus: %.2f%n", totalBonus);

        sc.close();
    }
}