package atm;

public class Main {
    public static void main(String[] args) {

        DataSourceFile dataSource = new DataSourceFile("customers.txt");
        Bank bank = new Bank("My Bank", dataSource);
        ATM atm = new ATM(bank);
        AtmUI atmUI = new AtmUI(atm);
        atmUI.run();
    }
}
