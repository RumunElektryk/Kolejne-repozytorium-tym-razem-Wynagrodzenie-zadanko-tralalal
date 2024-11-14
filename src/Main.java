abstract class Employee {
    protected String position;
    protected double baseSalary;
    protected int overtimeHours;
    protected double hourlyRate;
    protected double bonus;

    public Employee(String position, double baseSalary, int overtimeHours, double hourlyRate, double bonus) {
        this.position = position;
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
        this.bonus = bonus;
    }
    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {

    public Manager(double baseSalary, int overtimeHours, double hourlyRate, double bonus) {
        super("Manager", baseSalary, overtimeHours, hourlyRate, bonus);
    }

    @Override
    double calculateSalary() {
        return baseSalary + (overtimeHours * hourlyRate) + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Stanowisko: " + position);
        System.out.println("Podstawowa płaca: " + baseSalary);
        System.out.println("Nadgodziny: " + overtimeHours);
        System.out.println("Stawka godzinowa: " + hourlyRate);
        System.out.println("Premia: " + bonus);
        System.out.println("Wynagrodzenie: " + calculateSalary());
    }
}

class Programmer extends Employee {

    public Programmer(double baseSalary, int overtimeHours, double hourlyRate, double bonus) {
        super("Programmer", baseSalary, overtimeHours, hourlyRate, bonus);
    }

    @Override
    double calculateSalary() {
        return baseSalary + (overtimeHours * hourlyRate) + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Stanowisko: " + position);
        System.out.println("Podstawowa płaca: " + baseSalary);
        System.out.println("Nadgodziny: " + overtimeHours);
        System.out.println("Stawka godzinowa: " + hourlyRate);
        System.out.println("Premia: " + bonus);
        System.out.println("Wynagrodzenie: " + calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager(5000, 10, 100, 2000);
        manager.displayInfo();

        Employee programmer = new Programmer(4000, 15, 80, 1500);
        programmer.displayInfo();
    }
}