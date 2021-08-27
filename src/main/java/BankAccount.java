import java.time.LocalDate;

public class BankAccount {
    private float balance;
    Statement statement = new Statement();

    public void deposit(int i, LocalDate of) {
        balance += i;
       processTransactions(i, of, "DEPOSIT");
    }

    public void withdraw(int i, LocalDate of){
        balance -= i;
        processTransactions(i, of, "WITHDRAW");
    }

    public void processTransactions(int i, LocalDate of, String status) {
        Transaction transaction = new Transaction(i, of, balance, status);
        statement.record(transaction);
    }

    public String generateStatement() {
       return statement.print();
    }
}
