package encapsulation.test;

import encapsulation.domain.*;

public class TestPerson {

    public static void main(String[] args) {
        Person person1 = new Person("Gustanevio Mangue", 1000, false);
//        System.out.println("Print person 1 before change name: " + person1.getName());
//        person1.setName("Mr. Mangue");
//        System.out.println("Print person 1 after change name: " + person1.getName());
//        System.out.println("Print person 1 Salary: " + person1.getSalary());
//        System.out.println("Print person 1 Removed status: " + person1.isRemoved());

        System.out.println("Person = " + person1.toString()); //ou simple call "person1" - when toString method is defined
    }
}
