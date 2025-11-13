public abstract class Product implements Comparable<Product> {
    private int productID;
    private String name;
    private double price;

    public Product(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public abstract String getDescription();

    public String getProductInfo() {
        return "ID: " + productID + ", naziv: " + name + ", cijena: " + price + "€";
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(price, other.price);
    }
}
