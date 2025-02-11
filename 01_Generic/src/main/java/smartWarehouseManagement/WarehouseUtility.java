package smartWarehouseManagement;

import java.util.List;

public class WarehouseUtility {
    public static <T> void displayItems(List<T> items) {
        for (T item : items) {
            if (item instanceof Electronics) {
                ((Electronics) item).displayItemInfo();
            } else if (item instanceof Groceries) {
                ((Groceries) item).displayItemInfo();
            } else if (item instanceof Furniture) {
                ((Furniture) item).displayItemInfo();
            }
        }
    }
}
