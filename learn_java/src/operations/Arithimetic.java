package operations;

public class Arithimetic {

    //Atributes
    int a;
    int b;

    //Contructor - simple
    public Arithimetic() {

    }

    //Contructor with args
    public Arithimetic(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
    }

    //Method without return
    public void sum() {
        int result = this.a + this.b;
        System.out.println("result = " + result);
    }

    //Method with return
    public int sumWithReturn() {
        int result = this.a + this.b;
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
