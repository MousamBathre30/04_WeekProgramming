package dynamicOnlineMarketplace;

import java.util.ArrayList;
import java.util.List;

class Product<T> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public List<T> getProducts() {
        return products;
    }
}

