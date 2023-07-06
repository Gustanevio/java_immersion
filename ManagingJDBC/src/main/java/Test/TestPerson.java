package Test;

import data.PersonDAO;
import domain.Person;
import java.util.List;

public class TestPerson {

    public static void main(String[] args) {

        PersonDAO personDAO = new PersonDAO();

        List<Person> persons = personDAO.getAll();

        for (Person person : persons) {
            System.out.println("Person = " + person);
        }
        
        //Foreach
        persons.forEach(person ->{
            System.out.println("Person = " + person);
        });
    }
}
