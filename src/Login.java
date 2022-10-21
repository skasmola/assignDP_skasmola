import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Login {
    private String username="";
    private String password="";

    public int getUserType() {
        return userType;
    }

    private int userType=0;
    HashMap<String, String> buyers = new HashMap<>();
    HashMap<String, String> sellers = new HashMap<>();

    public void getCredentials(){
        File buyer_file = new File(
                "src/BuyerInfo.txt");
        File seller_file = new File(
                "src/SellerInfo.txt");

        try {
            Scanner sc_1 = new Scanner(buyer_file);
            Scanner sc_2 = new Scanner(seller_file);
            String str;

            while (sc_1.hasNextLine()){
                str = sc_1.nextLine();
                String[] my_dict = str.split(":");
                buyers.put(my_dict[0], my_dict[1]);

            }
            while(sc_2.hasNextLine()){
                str = sc_2.nextLine();
                String[] my_dict = str.split(":");
                sellers.put(my_dict[0], my_dict[1]);
            }

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public boolean login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Username: ");
        username = sc.nextLine();
        System.out.println("Enter the Password: ");
        password = sc.nextLine();
        //get credentials for
        getCredentials();

        //login for buyer
        if(buyers.containsKey(username)){
            if(password.equals(buyers.get(username))){
                System.out.println("Welcome Buyer"+ username);
                userType = 0; //set userType for buyer
                return true;
            }else{
                System.out.println("Buyer Invalid Credentials");
                return false;
            }
        } else if (sellers.containsKey(username)){ // login for seller
            if(password.equals(sellers.get(username))){
                System.out.println("Welcome! Seller"+ username);
                userType = 1; // set UserType for seller

                return true;
            }else{
                System.out.println("Seller Invalid Credentials");
                return false;

            }
        }else{
            System.out.println("No Such User exists in the Database.");
            return false;
        }
    }
}
