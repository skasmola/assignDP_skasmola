import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//  Class of the list to be iterated
public class ClassProductList extends ArrayList{
    private ProductIterator productIterator;

    private RemainderVisitor reminderVisitor;

    private List<Product> products;

    public ClassProductList() {
        products = new ArrayList<>();

        File f = new File("src/UserProduct.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            Scanner sc = new Scanner(f);
            String str;

            while (sc.hasNextLine()) {
                str = sc.nextLine();
                String[] my_dict = str.split(":");
                products.add(new Product(my_dict[1], my_dict[0]));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void accept(NodeVisitor nodeVisitor) {

        for(Product product : products){
            nodeVisitor.visitProduct(product);
        }
    }

    public ListIterator createIterator(){
        return new ProductIterator(this.products);
    }
}
