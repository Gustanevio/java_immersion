package CustomException;

public class TestCustomException {

    public static void main(String[] args) {
        int result = 0;
        try {
            result = CustomExceptionExample_1.division(10, 0);
        } catch (Exception e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());

        } finally {

            System.out.println("Executes with and without exception ");
        }
        System.out.println("Result: " + result);
    }
}
