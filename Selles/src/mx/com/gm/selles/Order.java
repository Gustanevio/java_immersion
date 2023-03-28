package mx.com.gm.selles;

public class Order {

    private final int idOrder;
    private Product products[];
    private static int orderCounter;
    private static final int MAX_PRODUCTS = 10;
    private int productCounter;

    public Order() {
        this.idOrder = ++Order.orderCounter;
        this.products = new Product[Order.MAX_PRODUCTS];
    }

    public void addProduct(Product product) {
        if (this.productCounter < Order.MAX_PRODUCTS) {
            this.products[this.productCounter++] = product;
        } else {
            System.out.println("The order can only allow " + Order.MAX_PRODUCTS + " products");
        }
    }

    public double sumTotal() {
        double total = 0;
        for (int i = 0; i < this.productCounter; i++) {
            total += this.products[i].getPrice();
        }
        return total;
    }

    public void showOrder() {
        System.out.println("Order ID: " + this.idOrder);
        double totalOrder = this.sumTotal();
        System.out.println("Total: " + totalOrder);
        for (int i = 0; i < this.productCounter; i++) {
            System.out.println(this.products[i].toString());

        }
    }
}
