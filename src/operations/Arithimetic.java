package operations;

public class Arithimetic {

    //Atributes
    int a;
    int b;

    //Method without return
    public void sum() {
        int result = a + b;
        System.out.println("result = " + result);
    }

    //Method with return
    public int sumWithReturn() {
        int result = a + b;
        return result;
    }

    //Method with parameters
    public int sumWithParam(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        return sumWithReturn();
        //  return a + b;
    }
}
