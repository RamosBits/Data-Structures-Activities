package lab8_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String code, int qty) {
        products.put(code, qty);
    }

    public void updateStock(String code, int qty) {
        if (products.containsKey(code)) {
            products.put(code, qty);
        }
    }

    public void displayProducts() {
        System.out.println("Product Inventory:");
        for (Map.Entry<String, Integer> item : products.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}
