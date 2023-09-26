public class Product {
    String products = "";
    float allPrice;

    public void addProduct(String product, float price) {
        products += product + "\n";
        allPrice += price;
    }

    public String getProducts() {
        return products;
    }

    public float getPrice() {
        return allPrice;
    }
}