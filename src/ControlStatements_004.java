
import java.util.Scanner;

public class ControlStatements_004 {

    public static void main(String args[]) {
        /*====================================
                        IF - ELSE
        =====================================*/

        var condition = true;

        if (condition) {
            System.out.println("condition is true");
        } else {
            System.out.println("condition is false");
        }
        System.out.println("----------------------------------");
        /*====================================
                        SWIRCH CASE
        =====================================*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre the option:");
        int number = Integer.parseInt(scanner.nextLine());

        String text;

        switch (number) {
            case 1:
                text = "number one";
                break;
            case 2:
                text = "number two";
                break;
            case 3:
                text = "number three";
                break;
            default:
                text = "Number do not found";
        }
        System.out.println("text = " + text);

    }

}
