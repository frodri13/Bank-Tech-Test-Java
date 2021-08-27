import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {
    @Test
    void returnsTheTransactionMade() {
        Transaction transaction = new Transaction(1000, LocalDate.of(2021, 1, 10), 1000, "DEPOSIT");
        assertEquals("10/01/2021 || 1000.00 || - || 1000.00", transaction.getTransaction());
    }
}
