import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class addOrder {
    private static int orderID;
    private LocalDate orderDate;
    private double totalBillingAmount;
    private String orderStatus;
    private List<Integer> orderDetails;

    // Getter and setter methods 
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalBillingAmount() {
        return totalBillingAmount;
    }

    public void setTotalBillingAmount(double totalBillingAmount) {
        this.totalBillingAmount = totalBillingAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Integer> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<Integer> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public static double main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display the menu listed in menuDetails.csv file
        System.out.println("Select from the below Menu -");
        try {
            BufferedReader br = new BufferedReader(new FileReader("menuDetails.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                System.out.println(values[0] + "," + values[1] + "," + values[2]);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Prompt the user to enter total item counts and menu IDs
        System.out.print("Please enter total menu count - ");
        int totalCount = input.nextInt();
        int[] menuIDs = new int[totalCount];
        int[] itemQuantities = new int[totalCount];
        for (int i = 0; i < totalCount; i++) {
            System.out.print("Item no - " + (i + 1) + ": Enter menuID - ");
            menuIDs[i] = input.nextInt();
            System.out.print("Enter Quantity - ");
            itemQuantities[i] = input.nextInt();
        }

        // Calculate the new order ID
        int newOrderID = 1;
        try {
            BufferedReader br = new BufferedReader(new FileReader("orderDetails.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int orderID = Integer.parseInt(values[0]);
                if (orderID >= newOrderID) {
                    newOrderID = orderID + 1;
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Calculate the total billing amount by fetching item cost details from
        // menuDetails.csv file
        double totalBillingAmount = 0.0;
        List<Integer> orderDetails = new ArrayList<Integer>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("menuDetails.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int menuID = Integer.parseInt(values[0]);
                double itemCost = Double.parseDouble(values[1]);
                for (int i = 0; i < orderDetails.length; i += 2) {
                    if (menuItemID == orderDetails[i]) {
                        totalBillingAmount += menuItemCost * orderDetails[i + 1];
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return totalBillingAmount;
    }