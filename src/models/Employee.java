package models;
import interfaces.Payable;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString() + ", Position: " + position + ", Salary: " + salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public double getPaymentAmount() {
        return getSalary();
    }

}

