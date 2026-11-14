package homeworks.employee;

import java.util.Objects;

public class EmployeeStorage {

    private int length = 0;
    Employee[] employees = new Employee[10];

    public void addEmployee(Employee employee) {
        boolean found = false;
        if (length == employees.length) {
            extend();
        }
        for (int i = 0; i < length; i++) {
            if (Objects.equals(employee.getEmployeeID(), employees[i].getEmployeeID())) {
                System.out.println("Employee with ID " + employee.getEmployeeID() + " already exists. \n");
                found = true;
            }
        }

        if(!found) {
            employees[length++] = employee;
            System.out.println("... Employee added ... \n");
        }
    }

    private void extend() {
        Employee[] tmp = new Employee[length + 10];
        if (length >= 0) {
            System.arraycopy(employees, 0, tmp, 0, length);
        }
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.println(employees[i]);
        }
    }

    public void searchByID(String id) {
        boolean found = false;

        for (int i = 0; i < length; i++) {
            if (Objects.equals(id, employees[i].getEmployeeID())) {
                System.out.println(employees[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Employee not found! \n");
        }
    }

    public void searchBySalary(String salary) {
        boolean found = false;

        for (int i = 0; i < length; i++) {
            if (Objects.equals(salary, employees[i].getSalary())) {
                System.out.println(employees[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Employee not found! \n");
        }
    }

    public void deleteEmployeeByID(String id) {
        boolean found = false;

        for (int i = 0; i < length; i++) {
            if (Objects.equals(id, employees[i].getEmployeeID())) {

                for (int j = i; j < length - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[--length] = null;
                found = true;

                System.out.println("Employee deleted!\n");
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found!\n");
        }
    }

    public void searchByCompany(String company) {
        boolean found = false;

        for (int i = 0; i < length; i++) {
            if (Objects.equals(company, employees[i].getCompany())) {
                System.out.println(employees[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Employee not found! \n");
        }
    }

}
