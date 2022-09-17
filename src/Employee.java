public class Employee {
       private static int counter = 0;
    private final String FIO;
    private int department;
    private float salary;
    private final Integer id;


    // Геттеры
    public String getFIO() {
        return FIO;
    }
    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }
    // Сеттеры

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee(String FIO, int department, int salary) {
        this.FIO = FIO;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }


    @Override
    public String toString() {
        return "Employee{" + "FIO='" + FIO + '\'' + ", department=" + department + ", salary=" + salary + ", id=" + id + '}';
    }}



