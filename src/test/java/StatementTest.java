import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementTest {

    @Test
    void itCanPrintOutASimpleTransaction(){
        Statement statement = new Statement();
        Transaction transaction = new Transaction(1000, LocalDate.of(2021, 1, 10), 1000, "DEPOSIT");

        statement.record(transaction);

        assertEquals("date || credit || debit || balance\n10/01/2021 || 1000.00 || - || 1000.00", statement.print());
    }
    @Test
    void itCanPrintOutTwoTransactions(){
        Statement statement = new Statement();

        Transaction transaction1 = new Transaction(1000, LocalDate.of(2021, 1, 10), 1000, "DEPOSIT");


        Transaction transaction2 = new Transaction(2000, LocalDate.of(2021, 1, 13), 3000, "DEPOSIT");

        statement.record(transaction1);
        statement.record(transaction2);

        assertEquals("date || credit || debit || balance\n13/01/2021 || 2000.00 || - || 3000.00\n10/01/2021 || 1000.00 || - || 1000.00", statement.print());
    }

    @Test
    void itCanPrintOutTransactionsWithWithdraws() {
        Statement statement = new Statement();

        Transaction transaction1 = new Transaction(1000, LocalDate.of(2021, 1, 10), 1000, "DEPOSIT");
        Transaction transaction2 = new Transaction(2000, LocalDate.of(2021, 1, 13), 3000, "DEPOSIT");
        Transaction transaction3 = new Transaction(500, LocalDate.of(2021, 1, 14), 2500, "WITHDRAW");

        statement.record(transaction1);
        statement.record(transaction2);
        statement.record(transaction3);

        assertEquals("date || credit || debit || balance\n14/01/2021 || - || 500.00 || 2500.00\n13/01/2021 || 2000.00 || - || 3000.00\n10/01/2021 || 1000.00 || - || 1000.00", statement.print());
    }
}
