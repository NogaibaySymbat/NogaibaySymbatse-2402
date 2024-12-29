package models;
import java.util.ArrayList;

public class School {
    ArrayList<Person> characters = new ArrayList();

    public void addCharacters (Person people) {
        characters.add(people);
    }

    @Override
    public String toString() {
        String mem = " ";
        for (Person people : characters) {
           mem += people.toString() + "\n";
        }
        return mem;
    }
}
