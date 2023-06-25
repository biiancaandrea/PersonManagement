import java.util.ArrayList;
import java.util.List;

public class PersonList {
    private List<Person> personList;

    public PersonList() {
        personList = new ArrayList<>();
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void removePerson(Person person) {
        personList.remove(person);
    }

    public Person findPersonByName(String name) {
        for (Person person : personList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null; // Person nicht gefunden
    }

    public List<Person> getAllPersons() {
        return personList;
    }
}

