public class Product {

    private String name;

    private String type;

    private ClassProductList classProductList;

    private Trading trading;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Product(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Trading getTrading(){
        return this.trading;
    }
}
