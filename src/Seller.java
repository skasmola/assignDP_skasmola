public class Seller extends Person {

    private int productCategory;

    public Seller(int productCategory){
        this.productCategory = productCategory;
    }

    public void showMenu() {
        theProductMenu.showMenu();
    }

    public ProductMenu CreateProductMenu() {
        // option 1
        if(productCategory == 1){
            this.theProductMenu = new MeatProductMenu();
            return this.theProductMenu;
        }else{ // option 2
            this.theProductMenu = new ProduceProductMenu();
            return this.theProductMenu;
        }
    }
}
