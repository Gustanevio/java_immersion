package wordFinal;

public class TestFinal {

    public static void main(String[] args) {
        final int myVariable = 10;
        System.out.println("myVariable = " + myVariable);

        System.out.println("myVariable = " + Person.MY_CONSTANT);

        final Person person = new Person();
        person.setName("Mr Mangue");
        System.out.println("Person: " + person.getName());
        person.setName("Gusta!!");
        System.out.println("Person: " + person.getName());
    }
}
