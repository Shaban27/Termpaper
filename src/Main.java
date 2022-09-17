public class Main {


    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        Employee employee1 = new Employee("Виктори Игоревна Матыш", 1, 200);
        Employee employee2 = new Employee("Елена Борисовна Бабич", 1, 3000);
        Employee employee3 = new Employee("Светлана Васильевна Берестнева", 1, 1000);
        Employee employee4 = new Employee("Алексадр Юрьевич Попов", 1, 4000);
        Employee employee5 = new Employee("Аллексей Иванович Иванов", 1, 500);
        Employee employee6 = new Employee("Леонид Ботсович Евглевский", 1, 700);
        Employee employee7 = new Employee("Ольга Ивановна Воз", 1, 800);
        Employee employee8 = new Employee("Таитьяна Леонидовна Петрова", 1, 600);
        Employee employee9 = new Employee("Дмитрий Александрович Решетников", 1, 700);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;

        printStatikMetod(employees);
        printMinSalary(employees);
        printMaxSalary(employees);
        printListEmployees(employees);
    }

    private static void printStatikMetod(Employee[] employees) {
        double summ = 0;
        int countOfEmployees = 0;
        int employeeNumber = 1;
        if (employees == null) {
            System.out.println("Если пусто");
            return;
        }
            for (int i = 0; i < employees.length; i++) {if (employees[i] != null) {
                System.out.println("Сотрудник" + employeeNumber + " - " + employees[i].toString());
                summ += employees[i].getSalary();
                countOfEmployees++;
                employeeNumber++;
            }
            }
            System.out.println("----------------");
            System.out.print("Cумма затрат на зарплаты в месяц: ");
            System.out.printf(" %.2f\n", summ);
            System.out.println("----------------");
            System.out.print("Среднее значение зарплат : ");
            System.out.printf(" %.2f\n", (summ / countOfEmployees));
            System.out.println("");
        }



        private static void printMinSalary (Employee[]employees){
            float minSalary = employees[0].getSalary();
            int indexEmployee = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                    indexEmployee = i;
                }
            }
            System.out.println("Минимальная зарплата составляет: " + minSalary);

        }

        private static void printMaxSalary (Employee[]employees){
            float maxSalary = employees[0].getSalary();
            int indexEmployee = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                    indexEmployee = i;
                }
            }
            System.out.println("________________");
            System.out.println("Максимальная зарплата составляет: " + maxSalary);
        }

        private static void printListEmployees (Employee[]employees){
            System.out.println("Ф.И.О. сотрудников:");
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    System.out.println(employees[i].getFIO());

                }
            }
        }
    }
