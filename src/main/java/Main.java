import java.time.LocalDate;

public class Main {
    public static void main(String []args){
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(1000, LocalDate.of(2021, 1, 10));

        bankAccount.deposit(2000, LocalDate.of(2021, 1, 13));

        bankAccount.withdraw(500, LocalDate.of(2021, 1, 14));

        System.out.println(bankAccount.generateStatement());
    }
}
