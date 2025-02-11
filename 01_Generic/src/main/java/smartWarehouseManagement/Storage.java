package smartWarehouseManagement;


import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    // Ensure this method exists
    public List<T> getItems() {
        return new ArrayList<>(items); // Returns a copy to avoid modification outside
    }
}


