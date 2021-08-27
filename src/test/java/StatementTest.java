import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementTest {

    @Test
    void itCanPrintOutASimpleTransaction(){
        Statement statement = new Statement();
        Transaction transaction = new Transaction(1000, LocalDate.of(2021, 1, 10), 1000, "DEPOSIT");
        String result = transaction.getTransaction();
        statement.record(result);

        assertEquals("date || credit || debit || balance\n10/01/2021 || 1000.00 || - || 1000.00", statement.print());
    }
    @Test
    void itCanPrintOutTwoTransactions(){
        Statement statement = new Statement();

        Transaction transaction1 = new Transaction(1000, LocalDate.of(2021, 1, 10), 1000, "DEPOSIT");
        String result1 = transaction1.getTransaction();

        Transaction transaction2 = new Transaction(2000, LocalDate.of(2021, 1, 13), 3000, "DEPOSIT");
        String result2 = transaction2.getTransaction();

        statement.record(result1);
        statement.record(result2);

        assertEquals("date || credit || debit || balance\n13/01/2021 || 2000.00 || - || 3000.00\n10/01/2021 || 1000.00 || - || 1000.00", statement.print());
    }
}
