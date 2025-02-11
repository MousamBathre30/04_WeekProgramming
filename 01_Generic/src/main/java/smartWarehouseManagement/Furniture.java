package smartWarehouseManagement;

public class Furniture {
    private String itemId;
    private String itemName;
    private String location;
    private double price;

    public Furniture(String itemId, String itemName, String location, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.location = location;
        this.price = price;
    }

    public String getItemId() { return itemId; }
    public String getItemName() { return itemName; }
    public String getLocation() { return location; }
    public double getPrice() { return price; }

    public void displayItemInfo() {
        System.out.println("Furniture -> ID: " + itemId + ", Name: " + itemName + ", Location: " + location + ", Price: $" + price);
    }
}
