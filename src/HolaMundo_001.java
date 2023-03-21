
import java.util.Scanner;



public class HolaMundo_001 {
    public static void main(String args[]){
        //Variables
        int miVarableEntera = 10;
        System.out.println(miVarableEntera);
        
        miVarableEntera = 5;
        System.out.println(miVarableEntera);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Your name is: " + name );
    }
}
