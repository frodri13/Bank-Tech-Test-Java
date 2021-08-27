import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {
    @Test
    void returnsTheTransactionMadeOfADeposit() {
        Transaction transaction = new Transaction(1000, LocalDate.of(2021, 1, 10), 1000, "DEPOSIT");
        assertEquals("10/01/2021 || 1000.00 || - || 1000.00", transaction.getTransaction());
    }
    @Test
    void returnsTheTransactionMadeOfAWithdraw() {
        Transaction transaction = new Transaction(500, LocalDate.of(2021, 1, 14), 2500, "WITHDRAW");
        assertEquals("14/01/2021 || - || 500.00 || 2500.00", transaction.getTransaction());
    }
}
