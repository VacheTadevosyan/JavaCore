package homeworks.employee2;

import java.util.Scanner;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

    private static final String EXIT = "0";
    private static final String ADD_EMPLOYEE = "1";
    private static final String PRINT_ALL_EMPLOYEES = "2";
    private static final String SEARCH_EMPLOYEE_BY_ID = "3";
    private static final String SEARCH_EMPLOYEE_BY_COMPANY_NAME = "4";
    private static final String ADD_COMPANY = "5";
    private static final String PRINT_ALL_COMPANIES = "6";
    private static final String SEARCH_COMPANY_BY_ID = "7";
    private static final String SEARCH_EMPLOYEE_BY_COMPANY_ID = "8";
    private static final String CHANGE_EMPLOYEE_COMPANY = "9";
    private static final String PRINT_EMPLOYEE_COMPANY = "10";

    private static final String COUNT_EMPLOYEES_BY_COMPANY = "11";
    private static final String TOTAL_SALARY_BY_COMPANY = "12";
    private static final String HIGHEST_SALARY_EMPLOYEE = "13";
    private static final String DELETE_EMPLOYEE = "14";
    private static final String DELETE_COMPANY = "15";

    private static void printCommands() {
        System.out.println("========== EMPLOYEE MANAGEMENT ==========");
        System.out.println(EXIT + " - EXIT");
        System.out.println(ADD_EMPLOYEE + " - ADD EMPLOYEE");
        System.out.println(PRINT_ALL_EMPLOYEES + " - PRINT ALL EMPLOYEES");
        System.out.println(SEARCH_EMPLOYEE_BY_ID + " - SEARCH EMPLOYEE BY ID");
        System.out.println(SEARCH_EMPLOYEE_BY_COMPANY_NAME + " - SEARCH EMPLOYEES BY COMPANY NAME");
        System.out.println(ADD_COMPANY + " - ADD COMPANY");
        System.out.println(PRINT_ALL_COMPANIES + " - PRINT ALL COMPANIES");
        System.out.println(SEARCH_COMPANY_BY_ID + " - SEARCH COMPANY BY ID");
        System.out.println(SEARCH_EMPLOYEE_BY_COMPANY_ID + " - PRINT EMPLOYEES BY COMPANY ID");
        System.out.println(CHANGE_EMPLOYEE_COMPANY + " - CHANGE EMPLOYEE COMPANY");
        System.out.println(PRINT_EMPLOYEE_COMPANY + " - PRINT EMPLOYEE COMPANY");
        System.out.println(COUNT_EMPLOYEES_BY_COMPANY + " - COUNT EMPLOYEES BY COMPANY");
        System.out.println(TOTAL_SALARY_BY_COMPANY + " - CALCULATE TOTAL SALARY BY COMPANY");
        System.out.println(HIGHEST_SALARY_EMPLOYEE + " - FIND EMPLOYEE WITH HIGHEST SALARY");
        System.out.println(DELETE_EMPLOYEE + " - DELETE EMPLOYEE");
        System.out.println(DELETE_COMPANY + " - DELETE COMPANY");
        System.out.println("=========================================");
    }

    private static void searchEmployeeByCompanyName() {
        System.out.println("Enter company name:");
        String name = scanner.nextLine();
        employeeStorage.printByCompanyName(name);
    }

    private static void countEmployeeByCompany() {
        System.out.println("Enter company ID:");
        String id = scanner.nextLine();

        Company company = companyStorage.getById(id);
        if (company == null) {
            System.out.println("Company not found.\n");
            return;
        }

        int count = employeeStorage.countByCompanyId(id);
        if (count == 0) {
            System.out.println("No employees found.\n");
            return;
        }

        System.out.println("Company: " + company.getName());
        System.out.println("Employees count: " + count + "\n");
    }

    private static void calculateTotalSalaryByCompany() {
        System.out.println("Enter company ID:");
        String id = scanner.nextLine();

        Company company = companyStorage.getById(id);
        if (company == null) {
            System.out.println("Company not found.\n");
            return;
        }

        System.out.println("Company: " + company.getName());
        System.out.println("Total salary: " + employeeStorage.getTotalSalaryByCompanyId(id) + "\n");
    }

    private static void findHighestSalaryEmployee() {
        Employee employee = employeeStorage.getHighestSalaryEmployee();
        if (employee == null) {
            System.out.println("Employee list is empty!\n");
            return;
        }

        System.out.println("Employee with highest salary:");
        System.out.println(employee);
    }

    private static void deleteEmployee() {
        System.out.println("Enter employee ID:");
        String id = scanner.nextLine();

        if (employeeStorage.deleteById(id)) {
            System.out.println("Employee successfully deleted!\n");
        } else {
            System.out.println("Employee not found!\n");
        }
    }

    private static void deleteCompany() {
        System.out.println("Enter company ID:");
        String id = scanner.nextLine();

        if (companyStorage.getById(id) == null) {
            System.out.println("Company not found.\n");
            return;
        }

        int count = employeeStorage.countByCompanyId(id);
        if (count > 0) {
            System.out.println("Cannot delete company.");
            System.out.println("Company has " + count + " employees.\n");
            return;
        }

        companyStorage.deleteById(id);
        System.out.println("Company successfully deleted!\n");
    }

    private static void searchEmployeeByCompanyId() {
        System.out.println("Enter company ID:");
        String id = scanner.nextLine();

        Company company = companyStorage.getById(id);
        if (company == null) {
            System.out.println("Company not found.\n");
            return;
        }

        System.out.println("Company: " + company.getName() + "\n");
        employeeStorage.printByCompanyId(id);
    }

    private static void searchCompanyById() {
        System.out.println("Enter company ID:");
        String id = scanner.nextLine();

        Company company = companyStorage.getById(id);
        if (company == null) {
            System.out.println("Company not found.\n");
            return;
        }

        System.out.println("Company found:\n");
        System.out.println(company);
    }

    private static void searchEmployeeByID() {
        System.out.println("Enter employee ID:");
        String id = scanner.nextLine();

        Employee employee = employeeStorage.getById(id);
        if (employee == null) {
            System.out.println("Employee not found!\n");
            return;
        }

        System.out.println("Employee found:");
        System.out.println(employee.getName() + " " + employee.getSurname());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Company: " + employee.getCompany().getName() + "\n");
    }

    private static void changeEmployeeCompany() {
        System.out.println("Enter employee ID:");
        String employeeId = scanner.nextLine();

        Employee employee = employeeStorage.getById(employeeId);

        if (employee == null) {
            System.out.println("Employee not found!\n");
            return;
        }

        System.out.println("Current company: " + employee.getCompany().getName());

        System.out.println("Enter new company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company with ID " + companyId + " not found.\n");
            return;
        }

        employee.setCompany(company);

        System.out.println("Employee company successfully changed!");
        System.out.println("New company: " + employee.getCompany().getName() + "\n");
    }

    private static void printEmployeeCompany() {
        System.out.println("Enter employee ID:");
        String employeeId = scanner.nextLine();

        Employee employee = employeeStorage.getById(employeeId);

        if (employee == null) {
            System.out.println("Employee not found!\n");
            return;
        }

        System.out.println("Employee: " + employee.getName() + " " + employee.getSurname() + "\n");
        System.out.println("Company information:");
        System.out.println(employee.getCompany());
    }

    private static void addCompany() {
        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        System.out.println("Enter company name:");
        String name = scanner.nextLine();

        System.out.println("Enter industry:");
        String industry = scanner.nextLine();

        System.out.println("Enter country:");
        String country = scanner.nextLine();

        Company company = new Company(companyId, name, industry, country);

        companyStorage.add(company);
    }

    private static void addEmployee() {
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();

        System.out.println("Enter employee surname:");
        String surname = scanner.nextLine();

        System.out.println("Enter employee ID:");
        String employeeId = scanner.nextLine();

        System.out.println("Enter employee salary:");
        double salary;
        salary = Double.parseDouble(scanner.nextLine());


        System.out.println("Enter employee position:");
        String position = scanner.nextLine();

        System.out.println("Enter company ID:");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company with ID " + companyId + " not found.");
            System.out.println("Please add the company first.\n");
            return;
        }

        Employee employee = new Employee(
                name,
                surname,
                employeeId,
                salary,
                company,
                position
        );

        employeeStorage.add(employee);
    }


    public static void main(String[] args) {
        initData();
        boolean isRun = true;

        while (isRun) {
            printCommands();

            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    System.out.println("Program finished.");
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEES:
                    employeeStorage.printAll();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    searchEmployeeByID();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_NAME:
                    searchEmployeeByCompanyName();
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case PRINT_ALL_COMPANIES:
                    companyStorage.printAll();
                    break;
                case SEARCH_COMPANY_BY_ID:
                    searchCompanyById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_ID:
                    searchEmployeeByCompanyId();
                    break;
                case CHANGE_EMPLOYEE_COMPANY:
                    changeEmployeeCompany();
                    break;
                case PRINT_EMPLOYEE_COMPANY:
                    printEmployeeCompany();
                    break;
                case COUNT_EMPLOYEES_BY_COMPANY:
                    countEmployeeByCompany();
                    break;
                case TOTAL_SALARY_BY_COMPANY:
                    calculateTotalSalaryByCompany();
                    break;
                case HIGHEST_SALARY_EMPLOYEE:
                    findHighestSalaryEmployee();
                    break;
                case DELETE_EMPLOYEE:
                    deleteEmployee();
                    break;
                case DELETE_COMPANY:
                    deleteCompany();
                    break;
                default:
                    System.out.println("Invalid command. Please try again.\n");
            }
        }
    }

    private static void initData() {
        companyStorage.add(new Company("C001", "ITSpace", "Information Technology", "Armenia"));
        companyStorage.add(new Company("C002", "Google", "Information Technology", "USA"));
    }

}
