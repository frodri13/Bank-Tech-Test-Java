import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    void canMakeDeposits() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000, LocalDate.of(2021, 1, 10));

        assertEquals("date || credit || debit || balance\n10/01/2021 || 1000.00 || - || 1000.00", bankAccount.getBalance());
    }
//
    @Test
    void canMakeMultipleDeposits() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000, LocalDate.of(2021, 1, 10));
        bankAccount.deposit(2000, LocalDate.of(2021, 1, 13));

        assertEquals("date || credit || debit || balance\n13/01/2021 || 2000.00 || - || 3000.00\n10/01/2021 || 1000.00 || - || 1000.00", bankAccount.getBalance());
    }

    @Test
    void canMakeDepositsAndWithdraws() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000, LocalDate.of(2021, 1, 10));
        bankAccount.deposit(2000, LocalDate.of(2021, 1, 13));
        bankAccount.withdraw(500, LocalDate.of(2021, 1, 14));

        assertEquals("date || credit || debit || balance\n14/01/2021 || - || 500.00 || 2500.00\n13/01/2021 || 2000.00 || - || 3000.00\n10/01/2021 || 1000.00 || - || 1000.00", bankAccount.getBalance());
    }
}
