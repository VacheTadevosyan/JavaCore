package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    private static final String EXIT = "0";
    private static final String ADD_EMPLOYEE = "1";
    private static final String PRINT_ALL_EMPLOYEES = "2";
    private static final String SEARCH_EMPLOYEE_BY_ID = "3";
    private static final String SEARCH_EMPLOYEE_BY_COMPANY = "4";

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_EMPLOYEE + " for add Employee");
        System.out.println("Please input " + PRINT_ALL_EMPLOYEES + " for print all Employees");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_ID + " for search Employee by id");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_COMPANY + " for search Employee by Company");
    }

    private static void searchEmployeeByCompany() {
        System.out.println("Please input Company");
        String course = scanner.nextLine();
        employeeStorage.searchByCompany(course);
    }

    private static void searchEmployeeBYID() {
        System.out.println("Please input ID");
        String keyword = scanner.nextLine();
        employeeStorage.searchByID(keyword);
    }

    private static void addEmployee() {
        System.out.println("Please input name,surname,employeeID,salary,company,position");
        String employeeDataStr = scanner.nextLine();
        String[] employeeDataArr = employeeDataStr.split(",");

        Employee employee = new Employee(
                employeeDataArr[0],
                employeeDataArr[1],
                employeeDataArr[2],
                employeeDataArr[3],
                employeeDataArr[4],
                employeeDataArr[5]
        );

        employeeStorage.addEmployee(employee);
        System.out.println("Employee added!!!" + "\n");

    }


    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            printCommands();

            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    searchEmployeeBYID();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY:
                    searchEmployeeByCompany();
                    break;
                default:
                    System.out.println("command not found!");

            }
        }
    }

}
