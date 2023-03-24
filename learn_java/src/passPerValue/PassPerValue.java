package passPerValue;

public class PassPerValue {

    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);

        passValue(x);

        System.out.println("x new value = " + x);
    }

    public static void passValue(int args) {
        System.out.println("args = " + args);
        args = 15;
    }
}
