import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 25));
        people.add(new Person("Jane", 30));

        for (Person person : people) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println();
        }

        PersonList personList = new PersonList();

        Person person1 = new Person("John", 25);
        Person person2 = new Person("Emily", 30);

        personList.addPerson(person1);
        personList.addPerson(person2);

        Person foundPerson = personList.findPersonByName("John");
        if (foundPerson != null) {
            System.out.println("Person gefunden: " + foundPerson.getName() + ", Alter: " + foundPerson.getAge());
        } else {
            System.out.println("Person nicht gefunden.");
        }

        List<Person> allPersons = personList.getAllPersons();
        System.out.println("Alle Personen:");
        for (Person person : allPersons) {
            System.out.println("Name: " + person.getName() + ", Alter: " + person.getAge());
        }
    }
}
