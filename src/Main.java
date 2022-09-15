import java.net.ProxySelector;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Ольга", " Олеговна", " Спицына", 1, 200);
        employee[1] = new Employee("Виктори", " Игоревна", " Матыш", 1, 100);
        employee[2] = new Employee("Елена", " Ботсовна", " Бабич", 1, 300);
        employee[3] = new Employee("Светлана", " Васильевна", " Берестнева", 1, 400);
        employee[4] = new Employee("Алексадр", " Юрьевич", " Попов", 1, 500);
        employee[5] = new Employee("Аллексей", " Иванович", " Иванов", 1, 600);
        employee[6] = new Employee("Леонид", " Ботсович", " Евглевский", 1, 700);
        employee[7] = new Employee("Ольга", " Ивановна", " Воз", 1, 800);
        employee[8] = new Employee("Таитьяна", " Леонидовна", " Петрова", 1, 900);
        employee[9] = new Employee("Дмитрий", " Александрович", " Решетников", 1, 50);


        for (Employee e : employee) {
            System.out.println(e);

            System.out.println("Ф.И.О  - " + e.getName() + e.getLastname() + e.getSurname());
        }
        IntSummaryStatistics result = Arrays.stream(employee).collect(Collectors.summarizingInt(Employee::getSalary));
        System.out.println(result.getSum());
        System.out.println(result.getMin());
        System.out.println(result.getMax());
        System.out.println(result.getAverage());

    }

}






