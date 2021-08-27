import java.time.LocalDate;

public class BankAccount {
    private float balance;

    public void deposit(int i, LocalDate of) {
        balance += i;
    }

    public void withdraw(int i, LocalDate of){
        balance -= i;
    }

    public float getBalance() {
        return balance;
    }

//    public String generateStatement(){ }
}
