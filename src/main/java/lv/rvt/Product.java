package lv.rvt;

public class Product {
    String name;
    double price;
    int quan;
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quan = initialQuantity;
    }

    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quan + " pcs");
    }
}
