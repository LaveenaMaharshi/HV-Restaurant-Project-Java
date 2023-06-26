package Restaurant;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// import java.util.function.DoubleToIntFunction;

public class ViewSelfProfileDetails {

    // profile details file path
    // private static final String PROFILE_DETAIL = "ProfileDetails.csv";
    

    // displays profile from the ProfileDetails.csv file
    private static void displayProfile(String userName) {
        try (BufferedReader reader = new BufferedReader(new FileReader("csvCustomer.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                // System.out.printf("%s,%s,%s\n", values[0], values[1], values[2]);
                if(values[2].equals(userName)){
                    System.out.println("Your username is: "+values[2]);
                    System.out.println("Your user ID is: "+ values[0]);
                    System.out.println("Your name is: "+ values[1]);
                    System.out.println("Your password is: "+ values[3]);
                    System.out.println("Are you a Premium Member: "+ values[4]);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        displayProfile("Cus101");
    }

}
