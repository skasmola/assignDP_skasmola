public class RemainderVisitor extends NodeVisitor{
    private Remainder m_Reminder;

    //Visit each product
    public void visitProduct(Product product) {
        System.out.println("Product Name is  " + product.getName() + "and trading is "+ product.getTrading());
    }

    //Compares current date and due date of trading
    public void visitTrading(Trading trading) {

        System.out.println("Printing the trading object " + trading);
    }

    //Visit each Product in Facade List
    public void visitFacade(Facade facade) {

        System.out.println("Printing each product in facade list" + facade.getProduct());
    }

}
