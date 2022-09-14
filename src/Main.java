import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10];
    private static Employee employee;

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Employee e1 = new Employee("Ольга", "Олеговна", "Спицына", 1, 200);
        Employee e2 = new Employee("Виктори", "Игоревна", "Матыш", 1, 100);
        Employee e3 = new Employee("Елена", "Ботсовна", "Бабич", 1, 300);
        Employee e4 = new Employee("Светлана", "Васильевна", "Берестнева", 1, 400);
        Employee e5 = new Employee("Алексадр", "Юрьевич", "Попов", 1, 500);
        Employee e6 = new Employee("Аллексей", "Иванович", "Иванов", 1, 600);
        Employee e7 = new Employee("Леонид", "Ботсович", "Евглевский", 1, 700);
        Employee e8 = new Employee("Ольга", "Ивановна", "Воз", 1, 800);
        Employee e9 = new Employee("Таитьяна", "Леонидовна", "Петрова", 1, 900);
        Employee e10 = new Employee("Дмитрий", "Александрович", "Решетников", 1, 50);

        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        employees[3] = e4;
        employees[4] = e5;
        employees[5] = e6;
        employees[6] = e7;
        employees[7] = e8;
        employees[8] = e9;
        employees[9] = e10;

        ArrayList<Employee> e = new ArrayList<Employee>();

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void Employees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void fullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getSurname());
        }
    }

    public static int calculatorTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee minSalary() {
        Employee result = employees[0];
        int minimalSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minimalSalary) {
                minimalSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee maxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
            result = employee;
        }
        return result;
    }

    public static float averageSalary() {
        return calculatorTotalSalary() / (float) employees.length;
    }
}
