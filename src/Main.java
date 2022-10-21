public class Main {
    public static void main(String[] args) {
        // Main driver code
        Facade facade = new Facade();
        facade.login(); //Invoking login of buyer and seller through facade pattern
        Login login = new Login();
    }
}