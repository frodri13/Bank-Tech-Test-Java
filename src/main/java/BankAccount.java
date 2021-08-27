import java.time.LocalDate;

public class BankAccount {
    private float balance;
    Statement statement = new Statement();

    public void deposit(float i, LocalDate of) {
        balance += i;
       processTransactions(i, of, "DEPOSIT");
    }

    public void withdraw(float i, LocalDate of){
        balance -= i;
        processTransactions(i, of, "WITHDRAW");
    }

    public void processTransactions(float i, LocalDate of, String status) {
        Transaction transaction = new Transaction(i, of, balance, status);
        statement.record(transaction);
    }

    public String generateStatement() {
       return statement.print();
    }
}
