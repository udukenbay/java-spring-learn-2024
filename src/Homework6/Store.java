package Homework6;

import java.util.*;

public class Store {
    private HashSet<PayOperation> payOperations;
    private HashMap<String, List<Product>> productLists;

    public Store() {
        payOperations = new HashSet<>();
        productLists = new HashMap<>();
    }

    public void addPayOperation(PayOperation payOperation) {
        payOperations.add(payOperation);
    }

    public void addProductList(String category, List<Product> productList) {
        productLists.put(category, productList);
    }

    public List<PayOperation> getPayOperationsAsList() {
        List<PayOperation> payOperationsList = new ArrayList<>(payOperations);
        return payOperationsList;
    }

    public List<Product> getProductListByCategory(String category) {
        return productLists.getOrDefault(category, new ArrayList<>());
    }
}
