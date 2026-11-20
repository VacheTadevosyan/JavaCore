package homeworks.employee2;

import java.util.Objects;

public class CompanyStorage {

    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company company) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (Objects.equals(company.getCompanyId(), companies[i].getCompanyId())) {
                System.out.println("Company with ID " + company.getCompanyId() + " already exists.\n");
                found = true;
                break;
            }
        }

        if (!found) {
            if (size == companies.length) {
                extend();
            }

            companies[size++] = company;
            System.out.println("Company successfully added!\n");
        }
    }

    private void extend() {
        Company[] tmp = new Company[size + 10];
        System.arraycopy(companies, 0, tmp, 0, size);
        companies = tmp;
    }

    public boolean deleteById(String companyId) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(companyId, companies[i].getCompanyId())) {
                for (int j = i + 1; j < size; j++) {
                    companies[j - 1] = companies[j];
                }
                companies[--size] = null;
                return true;
            }
        }
        return false;
    }

    public void printAll() {
        if (size == 0) {
            System.out.println("Company list is empty!\n");
            return;
        }

        System.out.println("Companies:\n");
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i].getCompanyId() + " - " + companies[i].getName() + " - " + companies[i].getCountry());
        }
        System.out.println();
    }

    public Company getById(String id) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(id, companies[i].getCompanyId())) {
                return companies[i];
            }
        }

        return null;
    }
}
