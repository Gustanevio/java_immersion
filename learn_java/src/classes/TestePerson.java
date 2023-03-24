package classes;

public class TestePerson {

    public static void main(String args[]) {
        Person person1 = new Person();
        person1.name = "Gustanevio";
        person1.lastName = "Mangue";
        person1.showAtributes();
        
        Person person2 = new Person();
        System.out.println("person2 = " + person2);
        person2.name = "Jose";
        person2.lastName="Ndambi";
        person2.showAtributes();
    }

}
