import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.lang.String.valueOf;

public class Transaction {
    String value;
    String date;
    String balance;
    String status;

    Transaction(float value, LocalDate of, float balance, String status) {
        this.value = String.format("%.2f", value);
        date = of.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.balance = String.format("%.2f", balance);
        this.status = valueOf(status);
    }

    public String getTransaction() {
//        return "10/01/2021 || 1000.00 || - || 1000.00";
        String result = String.format("%s || %s || - || %s", date, value, balance);
        return result;
    }
}
