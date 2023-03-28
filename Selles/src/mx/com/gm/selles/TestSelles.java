package mx.com.gm.selles;

/**
 *
 * @author Gustanevio Mangue
 */
public class TestSelles {

    public static void main(String[] args) {
        Product product1 = new Product("T-shirt", 150.00);
        Product product2 = new Product("Shoes", 1150);

        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);
        order1.showOrder();
    }
}
