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
//    @Test
//    void canMakeWithdraws() {
//        BankAccount bankAccount = new BankAccount();
//        bankAccount.deposit(1000, LocalDate.of(2021, 1, 13));
//        bankAccount.withdraw(500, LocalDate.of(2021, 1, 14));
//
//        assertEquals(500, bankAccount.getBalance());
//    }
}
