public class RemainderVisitor extends NodeVisitor{
    private Remainder m_Reminder;

    public void visitProduct(Product product) {
        System.out.println("Product Name is  " + product.getName() + "and trading is "+ product.getTrading());
    }

    public void visitTrading(Trading trading) {

        System.out.println("Printing the trading object " + trading);
    }

    public void visitFacade(Facade facade) {

        System.out.println("Printing the Facade Product " + facade.getProduct());
    }

}
