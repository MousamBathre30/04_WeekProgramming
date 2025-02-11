package smartWarehouseManagement;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;

class WareHouseSystemTest {

    @Test
    @DisplayName("Test Creating Electronics Items")
    void testElectronicsCreation() {
        Electronics laptop = new Electronics("E01", "Laptop", "A", 1200.00);
        assertEquals("E01", laptop.getItemId());
        assertEquals("Laptop", laptop.getItemName());
        assertEquals("A", laptop.getLocation());
        assertEquals(1200.00, laptop.getPrice());
    }

    @Test
    @DisplayName("Test Creating Groceries Items")
    void testGroceriesCreation() {
        Groceries rice = new Groceries("G01", "Rice", "C", 2.50);
        assertEquals("G01", rice.getItemId());
        assertEquals("Rice", rice.getItemName());
        assertEquals("C", rice.getLocation());
        assertEquals(2.50, rice.getPrice());
    }

    @Test
    @DisplayName("Test Creating Furniture Items")
    void testFurnitureCreation() {
        Furniture chair = new Furniture("F01", "Chair", "F", 150.00);
        assertEquals("F01", chair.getItemId());
        assertEquals("Chair", chair.getItemName());
        assertEquals("F", chair.getLocation());
        assertEquals(150.00, chair.getPrice());
    }

    @Test
    @DisplayName("Test Adding Electronics Items to Storage")
    void testAddingElectronicsToStorage() {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Electronics phone = new Electronics("E02", "Phone", "B", 800.00);

        electronicsStorage.addItem(phone);
        List<Electronics> items = electronicsStorage.getItems();

        assertEquals(1, items.size());
        assertTrue(items.contains(phone));
    }

    @Test
    @DisplayName("Test Adding Groceries Items to Storage")
    void testAddingGroceriesToStorage() {
        Storage<Groceries> groceriesStorage = new Storage<>();
        Groceries flavor = new Groceries("G02", "Flavor", "D", 3.00);

        groceriesStorage.addItem(flavor);
        List<Groceries> items = groceriesStorage.getItems();

        assertEquals(1, items.size());
        assertTrue(items.contains(flavor));
    }

    @Test
    @DisplayName("Test Adding Furniture Items to Storage")
    void testAddingFurnitureToStorage() {
        Storage<Furniture> furnitureStorage = new Storage<>();
        Furniture table = new Furniture("F02", "Table", "G", 200.00);

        furnitureStorage.addItem(table);
        List<Furniture> items = furnitureStorage.getItems();

        assertEquals(1, items.size());
        assertTrue(items.contains(table));
    }

    @Test
    @DisplayName("Test Displaying Electronics Storage Items")
    void testDisplayElectronicsItems() {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Electronics laptop = new Electronics("E01", "Laptop", "A", 1200.00);
        electronicsStorage.addItem(laptop);

        assertDoesNotThrow(() -> WarehouseUtility.displayItems(electronicsStorage.getItems()));
    }

    @Test
    @DisplayName("Test Displaying Groceries Storage Items")
    void testDisplayGroceriesItems() {
        Storage<Groceries> groceriesStorage = new Storage<>();
        Groceries rice = new Groceries("G01", "Rice", "C", 2.50);
        groceriesStorage.addItem(rice);

        assertDoesNotThrow(() -> WarehouseUtility.displayItems(groceriesStorage.getItems()));
    }

    @Test
    @DisplayName("Test Displaying Furniture Storage Items")
    void testDisplayFurnitureItems() {
        Storage<Furniture> furnitureStorage = new Storage<>();
        Furniture chair = new Furniture("F01", "Chair", "F", 150.00);
        furnitureStorage.addItem(chair);

        assertDoesNotThrow(() -> WarehouseUtility.displayItems(furnitureStorage.getItems()));
    }
}
