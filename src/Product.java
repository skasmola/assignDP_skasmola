public class Product {

    private String productname;

    private String producttype;

    private ClassProductList classProductList;

    private Trading trading;

    public String getName() {
        return productname;
    }

    public String getType() {
        return producttype;
    }

    public Product(String productname, String producttype) {
        this.productname = productname;
        this.producttype = producttype;
    }

    public Trading getTrading(){
        return this.trading;
    }
}
