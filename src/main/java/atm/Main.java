package atm;

public class Main {
    public static void main(String[] args) {
        DataSourceDB dataSourceDB = new DataSourceDB();
        Bank bank = new Bank("My Bank", dataSourceDB);
        ATM atm = new ATM(bank);
        AtmUI atmUI = new AtmUI(atm);
        atmUI.run();
    }
}
