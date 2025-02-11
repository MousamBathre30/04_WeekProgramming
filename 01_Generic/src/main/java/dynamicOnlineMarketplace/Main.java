package dynamicOnlineMarketplace;

public class Main {
    public static void main(String[] args) {
        // Creating Product Objects
        Gadgets g1 = new Gadgets("Laptop", "Electronics", 200);
        Clothing c1 = new Clothing("Western", "Flyer", 344);
        Books b1 = new Books("Ramesh", "Wings", 300);

        // Product Containers
        Product<Gadgets> gadgetsProduct = new Product<>();
        gadgetsProduct.addProduct(g1);

        Product<Clothing> clothingProduct = new Product<>();
        clothingProduct.addProduct(c1);

        Product<Books> booksProduct = new Product<>();
        booksProduct.addProduct(b1);

        // Displaying Gadgets Products
        System.out.println("Gadget Products: " + gadgetsProduct.getProducts());  // Changed from getProduct()
        g1.displayInfo();  // Assuming `displayInfo()` exists in `Gadgets`

        // Displaying Clothing Products
        System.out.println("Clothing Products: " + clothingProduct.getProducts());
        c1.displayInfo();

        // Displaying Books Products
        System.out.println("Books Products: " + booksProduct.getProducts());
        b1.displayInfo();

        // Market Utility
        MarketUtility market = new MarketUtility();
        // Ensure you are calling an existing method on `market`

    }
}
