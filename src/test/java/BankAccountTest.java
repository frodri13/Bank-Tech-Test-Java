import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    void canMakeDeposits() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);

        assertEquals(1000, bankAccount.getBalance());
    }
}
