// concrete implementation of Buyer class
public class Buyer extends Person{

    private int productCategory;

    public Buyer(int productCategory) {
        this.productCategory = productCategory;
    }

    public void showMenu() {
        theProductMenu.showMenu();
    }

    public ProductMenu CreateProductMenu() {

        if(productCategory == 1){
            this.theProductMenu = new MeatProductMenu();
            return this.theProductMenu;
        }else {
            this.theProductMenu = new ProduceProductMenu();
            return this.theProductMenu;
        }
    }
}

