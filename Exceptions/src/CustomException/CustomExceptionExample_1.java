package CustomException;

public class CustomExceptionExample_1 {

    public static int division(int numerator, int denominator) throws CustomException {
        if (denominator == 0) {
            throw new CustomException("Division between zero");
        }
        return numerator / denominator;
    }
}
