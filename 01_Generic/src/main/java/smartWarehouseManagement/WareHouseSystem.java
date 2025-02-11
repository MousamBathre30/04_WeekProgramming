package smartWarehouseManagement;

public class WareHouseSystem {
    public static void main(String[] args) {
        // Creating Storage for different items
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Creating objects separately
        Electronics laptop = new Electronics("E01", "Laptop", "A", 1200.00);
        Electronics phone = new Electronics("E02", "Phone", "B", 800.00);

        Groceries rice = new Groceries("G01", "Rice", "C", 2.50);
        Groceries flavor = new Groceries("G02", "Flavor", "D", 3.00);

        Furniture chair = new Furniture("F01", "Chair", "F", 150.00);
        Furniture table = new Furniture("F02", "Table", "G", 200.00);

        // Adding objects to storage
        electronicsStorage.addItem(laptop);
        electronicsStorage.addItem(phone);

        groceriesStorage.addItem(rice);
        groceriesStorage.addItem(flavor);

        furnitureStorage.addItem(chair);
        furnitureStorage.addItem(table);

        // Displaying the Details
        System.out.println("-----------------------------");
        WarehouseUtility.displayItems(electronicsStorage.getItems());
        WarehouseUtility.displayItems(groceriesStorage.getItems());
        WarehouseUtility.displayItems(furnitureStorage.getItems());
        System.out.println("-----------------------------");
    }
}
