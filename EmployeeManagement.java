class EmployeeManagement {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    EmployeeManagement(String n, double s) {
        empName = n;
        salary = s;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        EmployeeManagement e1 = new EmployeeManagement("Aisha", 50000);
        EmployeeManagement e2 = new EmployeeManagement("Rohan", 55000);
        EmployeeManagement e3 = new EmployeeManagement("Meena", 60000);

        EmployeeManagement.printCompanyInfo();
    }
}