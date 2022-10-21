import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ProduceProductMenu extends ProductMenu{
    public void showMenu() {
        File f = new File("src/UserProduct.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            Scanner sc = new Scanner(f);
            String str;

            while (sc.hasNextLine()){
                str = sc.nextLine();
                String[] my_dict = str.split(":");
                if(my_dict[0].equals("Produce"))
                    System.out.println(my_dict[1]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void showAddButton() {

    }


    public void showRadioButton() {

    }


    public void showLabels() {

    }


    public void showViewButton() {

    }

    public void showComboxes() {

    }
}
