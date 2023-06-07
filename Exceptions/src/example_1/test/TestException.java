package example_1.test;

public class TestException {

    public static void main(String[] args) {
        int result = 0;

        try {
            result = 10 / 0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.print("Error: ");
            e.printStackTrace(System.out);
        }
    } 
}
