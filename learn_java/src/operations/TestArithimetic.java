package operations;

public class TestArithimetic {

    public static void main(String[] args) {
        Arithimetic a1 = new Arithimetic();
        a1.a = 3;
        a1.b = 2;
        a1.sum();

        Arithimetic a2 = new Arithimetic();
        a2.a = 5;
        a2.b = 10;
        int result = a2.sumWithReturn();
        System.out.println("Result with return = " + result);

        Arithimetic a3 = new Arithimetic();
        int result2 = a3.sumWithParam(15, 35);
        System.out.println("Result method with parammeter = " + result2);
        
        //Teste Constructor
        Arithimetic a4 = new Arithimetic(5, 8);
        a4.sum();
    }
}