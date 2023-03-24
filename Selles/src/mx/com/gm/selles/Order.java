package mx.com.gm.selles;

public class Order {

    private final int idOrder;
    private Product products[];
    private static int orderCounter;
    private static final int MAX_PRODUCTS = 10;

    private Order() {
        this.idOrder = ++Order.orderCounter;
        this.products = new Product[Order.MAX_PRODUCTS];
    }

    public void addProduct(Product product) {
        if (this.orderCounter < Order.MAX_PRODUCTS) {
            products[orderCounter++] = product;
        } else {
            System.out.println("The order can only allow " + Order.MAX_PRODUCTS + " products");
        }
    }
    public double getTotal(){
        double total =0;
        for (int i = 0; i < 10; i++) {
            
        }
    }
}
