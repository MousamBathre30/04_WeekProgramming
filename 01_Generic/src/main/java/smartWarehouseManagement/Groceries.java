package smartWarehouseManagement;

public class Groceries {
    private String itemId;
    private String itemName;
    private String location;
    private double price;

    public Groceries(String itemId, String itemName, String location, double price) {
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
        System.out.println("Groceries -> ID: " + itemId + ", Name: " + itemName + ", Location: " + location + ", Price: $" + price);
    }
}
