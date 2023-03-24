package mx.com.gm.selles;

public class Product {
    private final int idProduct;
    private String name;
    private double precio;
    private static int productCounter;
    
    private Product(){
        this.idProduct= ++Product.productCounter;
    }

    public Product(String name, double precio) {
        this();
        this.name = name;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{");
        sb.append("idProduct=").append(idProduct);
        sb.append(", name=").append(name);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
