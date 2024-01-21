package models;


public class Student  extends Person {
    private double gpa;
    private static final double STIPEND_AMOUNT = 36660.00;

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public String toString() {
        return "Student: " + super.toString();
    }

    public double getGpa() {
        return gpa;
    }

    public double getPaymentAmount() {
        return (gpa > 2.67) ? STIPEND_AMOUNT : 0;
    }
}