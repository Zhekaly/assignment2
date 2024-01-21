import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Student("Clare", "Tompson", 2.5));
        people.add(new Student("Johny", "Bork", 3.0));
        people.add(new Employee("George", "Harrison", "Developer", 50000.00));
        Collections.sort(people);
        printData(people);
    }
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}


