package Test;

import domain.Person;

public class TestJavaBeans {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Gustanevio");
        person.setSurname("Mangue");
        System.out.println("Name: "+ person.getName());
        System.out.println("Surname: "+person.getSurname());
    }
}
