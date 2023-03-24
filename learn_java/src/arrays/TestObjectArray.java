package arrays;

public class TestObjectArray {
    public static void main(String[] args) {
        Person persons[] = new Person[2];
        
        persons[0] = new Person("Mr Mangue");
        persons[1] = new Person("Maria JJ");
        
        for(int i=0; i< persons.length; i++){
            System.out.println("Person "+ i + ": "+ persons[i].toString());
        }
    }
}
