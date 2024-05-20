package Homework6;

import com.sun.tools.javac.Main;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Store {
    private static Logger logger = Logger.getLogger(Main.class.getName());
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

    public void showPayOperations(List<PayOperation> payOps) {
        for (PayOperation op: payOps) {
            System.out.println(op.getTransactionId() + " - $" + op.getAmount());
            logger.log(Level.INFO, op.getTransactionId() + " -$" + op.getAmount());
        }
    }

    public HashMap<String, List<Product>> getProductLists() {
        return productLists;
    }

    public void showProductListsByCategory(String category) {
        if (category.isEmpty()) {
            logger.log(Level.SEVERE, "Category should not be empty");
        } else {
            List<Product> coursesProducts = this.getProductListByCategory(category);
            for (Product product: coursesProducts) {
                logger.log(Level.INFO, product.getName() + " - $"+product.getPrice());
            }
        }
    }

    public void showAllProductsList() {
        HashMap<String, List<Product>> products = this.getProductLists();

        for (Map.Entry<String, List<Product>> entry : products.entrySet()) {
            String category = entry.getKey();
            List<Product> product = entry.getValue();

            for (Product prod: product) {
                logger.log(Level.INFO, "Category: " + category + " and products: " + prod.getName() + " -$" + prod.getPrice());
            }
        }
    }
}
