package dynamicOnlineMarketplace;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OnlineMarketplaceTest {

    @Test
    @DisplayName("Test Adding Gadgets to Product Container")
    void testAddingGadgetsToProductContainer() {
        Gadgets gadget = new Gadgets("Smartphone", "Electronics", 500);
        Product<Gadgets> gadgetsProduct = new Product<>();
        gadgetsProduct.addProduct(gadget);

        assertEquals(1, gadgetsProduct.getProducts().size());
        assertTrue(gadgetsProduct.getProducts().contains(gadget));
    }

    @Test
    @DisplayName("Test Adding Clothing to Product Container")
    void testAddingClothingToProductContainer() {
        Clothing clothing = new Clothing("T-Shirt", "Casual", 150);
        Product<Clothing> clothingProduct = new Product<>();
        clothingProduct.addProduct(clothing);

        assertEquals(1, clothingProduct.getProducts().size());
        assertTrue(clothingProduct.getProducts().contains(clothing));
    }

    @Test
    @DisplayName("Test Adding Books to Product Container")
    void testAddingBooksToProductContainer() {
        Books book = new Books("Harry Potter", "Fantasy", 450);
        Product<Books> booksProduct = new Product<>();
        booksProduct.addProduct(book);

        assertEquals(1, booksProduct.getProducts().size());
        assertTrue(booksProduct.getProducts().contains(book));
    }

    @Test
    @DisplayName("Test Displaying Info of a Gadget Product")
    void testDisplayGadgetInfo() {
        Gadgets gadget = new Gadgets("Tablet", "Electronics", 300);
        assertDoesNotThrow(gadget::displayInfo); // Ensures no exception when calling displayInfo()
    }

    @Test
    @DisplayName("Test Displaying Info of a Clothing Product")
    void testDisplayClothingInfo() {
        Clothing clothing = new Clothing("Jacket", "Winter Wear", 700);
        assertDoesNotThrow(clothing::displayInfo);
    }

    @Test
    @DisplayName("Test Displaying Info of a Book Product")
    void testDisplayBookInfo() {
        Books book = new Books("Inferno", "Thriller", 400);
        assertDoesNotThrow(book::displayInfo);
    }

    @Test
    @DisplayName("Test Market Utility Functionality")
    void testMarketUtility() {
        MarketUtility market = new MarketUtility();
        assertNotNull(market);
        // Add more tests if MarketUtility has defined methods
    }
}
