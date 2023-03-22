package wordThis;

public class WordThis {

    public static void main(String[] args) {
        Person person = new Person("Gusta", "Mangue");
        System.out.println("person = " + person);
        System.out.println("person name = " + person.name);
        System.out.println("person last name = " + person.lastName);
    }
}

class Person {
    String name;
    String lastName;

    Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        System.out.println("Print Person object using this: " + this);
        
        new Print().print(this); // or Print print = new Print();
    }
}

class Print{
    public void print(Person person) {
        System.out.println("Print person: " + person );
        System.out.println("Print atual Object using (this): " + this ); //is printing object Print
    }
}