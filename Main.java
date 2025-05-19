// Базовый класс для всех организаций
class Organization {
    protected String name;

    public Organization(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Название: " + name);
    }
}

// Класс для школы
class School extends Organization {
    private int numberOfStudents;

    public School(String name, int numberOfStudents) {
        super(name);
        this.numberOfStudents = numberOfStudents;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество студентов: " + numberOfStudents);
    }
}

// Класс для компании
class Company extends Organization {
    private int numberOfEmployees;

    public Company(String name, int numberOfEmployees) {
        super(name);
        this.numberOfEmployees = numberOfEmployees;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество сотрудников: " + numberOfEmployees);
    }
}

// Класс для государства
class State {
    private String name;
    private School school;
    private Company company;

    public State(String name, School school, Company company) {
        this.name = name;
        this.school = school;
        this.company = company;
    }

    public void displayInfo() {
        System.out.println("Название государства: " + name);
        school.displayInfo();
        company.displayInfo();
    }
}

// Основной класс для тестирования
public class Main {
    public static void main(String[] args) {
        School school = new School("Гимназия №1", 500);
        Company company = new Company("ТехноСтартап", 150);
        State state = new State("Россия", school, company);

        state.displayInfo();
    }
}
