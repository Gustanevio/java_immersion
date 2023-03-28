package mx.com.gm.selles;

public class Product {
    private final int idProduct;
    private String name;
    private double price;
    private static int productCounter;
    
    private Product(){
        this.idProduct= ++Product.productCounter;
    }

    public Product(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }
    public int getIdProduct(){
        return idProduct;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{");
        sb.append("idProduct=").append(idProduct);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
