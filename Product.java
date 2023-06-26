import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private String specification;
    private double cost;
    private int count;

    public Product(String name, String specification, double cost, int count) {
        this.name = name;
        this.specification = specification;
        this.cost = cost;
        this.count = count;
    }

    // Getter and setter methods for Product class
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

public class InventoryManagementSystem {
    private static ArrayList<Product> products = new ArrayList<Product>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample data
        products.add(new Product("Laptop", "Intel Core i5, 8GB RAM, 512GB SSD", 749.99, 10));
        products.add(new Product("Desktop", "AMD Ryzen 5, 16GB RAM, 1TB HDD", 999.99, 5));
        products.add(new Product("Tablet", "Apple A12, 64GB Storage, 10.5 inch Retina Display", 399.99, 20));
        products.add(new Product("Smartphone", "Qualcomm Snapdragon 888, 8GB RAM, 128GB Storage", 799.99, 30));

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Product List");
            System.out.println("2. Product Count");
            System.out.println("3. View Product Details");
            System.out.println("4. Edit Product");
            System.out.println("5. Update Inventory");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewProductList();
                    break;
                case 2:
                    viewProductCount(scanner);
                    break;
                case 3:
                    viewProductDetails(scanner);
                    break;
                case 4:
                    editProduct(scanner);
                    break;
                case 5:
                    updateInventory(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // View list of all Products
    private static void viewProductList() {
        System.out.println("Product List:");
        for (Product p : products) {
            System.out.println(p.getName());
        }
        System.out.println();
    }

    // View number of quantities available for a specific Product
    private static void viewProductCount(Scanner scanner) {
        System.out.print("Enter product name: ");
        String productName = scanner.next();
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(productName)) {
                System.out.println("Product count: " + p.getCount());
                return;
            }
        }
        System.out.println("Product not found.");
    }

    
