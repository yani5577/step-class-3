class CompanyEmployee {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    CompanyEmployee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class M5EmployeeCompany {
    public static void main(String[] args) {

        CompanyEmployee e1 = new CompanyEmployee("Arun", 40000);
        CompanyEmployee e2 = new CompanyEmployee("Priya", 45000);
        CompanyEmployee e3 = new CompanyEmployee("Rahul", 50000);

        System.out.println("3 Employee objects created");

        CompanyEmployee.printCompanyInfo();
    }
}