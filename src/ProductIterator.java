import java.util.List;

public class ProductIterator implements ListIterator{
    private ClassProductList classProductList;

    private List<Product> productList;

    private int pos = 0;

    public ProductIterator(List<Product> productList){
        this.productList = productList;
    }

    public boolean hasNext() {
        if(pos < productList.size() && productList.get(pos) != null)
            return true;
        return false;
    }


    public Product Next() {
        Product product = productList.get(pos);
        pos += 1;
        return productList.get(pos);
    }


    public void MoveToHead() {
        pos = 0;
    }


    public void Remove() {

    }
}
