package homeworks.employee2;

import java.util.Objects;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (Objects.equals(employee.getEmployeeID(), employees[i].getEmployeeID())) {
                System.out.println("Employee with ID " + employee.getEmployeeID() + " already exists.\n");
                found = true;
                break;
            }
        }

        if (!found) {
            if (size == employees.length) {
                extend();
            }

            employees[size++] = employee;
            System.out.println("Employee successfully added!\n");
        }
    }

    private void extend() {
        Employee[] tmp = new Employee[size + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void printAll() {
        if (size == 0) {
            System.out.println("Employee list is empty!\n");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public Employee getById(String id) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(id, employees[i].getEmployeeID())) {
                return employees[i];
            }
        }

        return null;
    }

    public void printByCompanyName(String companyName) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (Objects.equals(companyName, employees[i].getCompany().getName())) {
                if (!found) {
                    System.out.println("Employees:\n");
                }
                printShort(employees[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found for company " + companyName + ".\n");
        } else {
            System.out.println();
        }
    }

    public void printByCompanyId(String companyId) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (Objects.equals(companyId, employees[i].getCompany().getCompanyId())) {
                if (!found) {
                    System.out.println("Employees:");
                }
                printShort(employees[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found for company ID " + companyId + ".\n");
        } else {
            System.out.println();
        }
    }

    public int countByCompanyId(String companyId) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(companyId, employees[i].getCompany().getCompanyId())) {
                count++;
            }
        }
        return count;
    }

    public double getTotalSalaryByCompanyId(String companyId) {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(companyId, employees[i].getCompany().getCompanyId())) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public Employee getHighestSalaryEmployee() {
        if (size == 0) {
            return null;
        }

        Employee max = employees[0];
        for (int i = 1; i < size; i++) {
            if (employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }

    public boolean deleteById(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(employeeId, employees[i].getEmployeeID())) {
                for (int j = i + 1; j < size; j++) {
                    employees[j - 1] = employees[j];
                }
                employees[--size] = null;
                return true;
            }
        }
        return false;
    }

    private void printShort(Employee employee) {
        System.out.println(employee.getEmployeeID() + " - " + employee.getName() + " " + employee.getSurname());
    }
}
