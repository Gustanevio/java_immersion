
public class Loops_005 {

    public static void main(String args[]) {
        /*====================================
                       WHILE
        =====================================*/
        var counter = 0;
        while (counter < 3) {
            System.out.println("counter = " + counter);
            counter++;
        }
        System.out.println("----------------------------------");
        /*====================================
                      DO WHILE
        =====================================*/

        var counter_2 = 0;
        do {
            System.out.println("counter 2 = " + counter_2);
            counter_2++;
        } while (counter_2 < 3);

        System.out.println("----------------------------------");
        /*====================================
                      FOR
        =====================================*/
        for (var counter_3 = 0; counter_3 < 3; counter_3++) {
            System.out.println("counter 3 = " + counter_3);
        }
        System.out.println("----------------------------------");

        //For loop with braak
        for (var counter_3 = 0; counter_3 < 3; counter_3++) {
            if (counter_3 % 2 == 0) {
                System.out.println("counter 3 = " + counter_3);
                break;
            }

        }
        //For loop with continue
        for (var counter_3 = 0; counter_3 < 3; counter_3++) {
            if (counter_3 % 2 != 0) {
                continue; //go to next iteraction
            }
            System.out.println("counter 3 = " + counter_3);

        }
        System.out.println("----------------------------------");
    }
}
