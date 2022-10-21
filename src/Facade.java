import java.util.Scanner;

//Facade Pattern
public class Facade {
    private int UserType; // Buyer and Seller


    private Product theSelectProduct; //Currently Selected Product


    private int nProductCategory; //Selected Product Category


    private ClassProductList theProductList;


    private Person thePerson;

    Scanner sc = new Scanner(System.in);


    public boolean login() {
        Login l = new Login();
        l.login();
        this.UserType = l.getUserType();
        createUser(new UserInfoItem()); // create new user for given credentials
        return false;
    }

    public Product getProduct(){
        return theSelectProduct;
    }

    public void addTrading() {

    }


    public void viewTrading() {

    }


    public void decideBidding() {

    }


    public void discussBidding() {

    }


    public void submitBidding() {

    }

    public void remind() {
        RemainderVisitor reminderVisitor = new RemainderVisitor();
        ClassProductList classProductList = new ClassProductList();
        classProductList.accept(reminderVisitor);
    }


    public void createUser(UserInfoItem userinfoitem) {
        if(UserType == 0){
            System.out.println("Please select the product you want to buy? \n 1. Meat \n 2. Produce");
            int option = Integer.parseInt(sc.nextLine());
            nProductCategory = option;
            Buyer buyer = new Buyer(nProductCategory);
            buyer.CreateProductMenu(); // create the menu after selecting buyer
            buyer.showMenu();  // show the menu

        }else{
            System.out.println("Please select the product you want to sell? \n 1. Meat \n 2. Produce");
            int option = Integer.parseInt(sc.nextLine());
            nProductCategory = option;
            Seller seller = new Seller(nProductCategory);
            seller.CreateProductMenu();   // create the menu after selecting seller
            seller.showMenu();  // show the menu
        }

        System.out.println("Visitor Pattern");
        remind();
    }


    public void createProductList() {

    }


    public void attachProductToUser() {

    }


    public Product SelectProduct() {
        return null;
    }


    public void productOperation() {

    }
}
