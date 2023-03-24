package passPerReferences;

import classes.Person;

public class PassPerReference {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Mr Mangue";
        System.out.println("person1 = " + person1.name);

        person1 = changeValue(person1);

        System.out.println("person1 = " + person1.name);
    }

    public static Person changeValue(Person person) {
        if (person == null) {
            return null;
        }
        person.name = "Gusta!";
        return person;
    }
}
