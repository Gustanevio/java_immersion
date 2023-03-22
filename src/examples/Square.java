package examples;

public class Square {

    int broad;
    int high;
    int deep;

    public Square() {

    }
    public Square(int board, int high, int deep) {
        this.broad = board;
        this.high = high;
        this.deep = deep;
    }
    
    public void volume(){
        int result = this.broad * this.high * this.deep;
        System.out.println("Square's volume = " + result);
    }
}
