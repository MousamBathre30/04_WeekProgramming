package dynamicOnlineMarketplace;

public class Clothing {
    private String fashionType;
    private String name;
    private int price;

    public Clothing(String fashionType, String name, int price) {
        this.fashionType = fashionType;
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Fashion Type: " + fashionType);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }

    public void discountApply(int discount) {
        System.out.println("Price after discount: " + (price - discount * 100));
    }
}
