public class Employee {
    private static int counter = 0;
    private final String name;
    private final String lastname;
    private final String surname;
    private int department;
    private int salary;
    private final Integer id;


    // Геттеры
    public String getName() {
        return name;
    }


    public String getLastname() {
        return lastname;
    }

    public String getSurname() {
        return surname;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String lastname, String surname, int department, int salary) {
        this.name = name;
        this.lastname = lastname;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", lastname='" + lastname + '\'' + ", surname='" + surname + '\'' + ", department=" + department + ", salary=" + salary + ", id=" + id + '}';
    }


    }
