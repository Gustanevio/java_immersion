package inheritance;

import java.util.Date;

public class TestInheritance {

    public static void main(String[] args) {
        Employee employee = new Employee("Mr Mangue", 250000);
        System.out.println("employee = " + employee);
        System.out.println("________________________________");
        
        //Test Client
        
        Client client = new Client(new Date(), true, "Mr Mangue", 'M', 25, "Maputo");
        System.out.println("client = " + client);
    }
}
