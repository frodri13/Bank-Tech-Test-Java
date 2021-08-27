import java.util.ArrayList;
import java.util.Collections;

import static java.lang.String.valueOf;

public class Statement {
    String transactionResult;
    ArrayList<String> transactions = new ArrayList<>();
    String title = "date || credit || debit || balance";
    String results;

    public void record(String transactionResult) {
        transactions.add(transactionResult);
    }

    public void arrayToString(){
        StringBuilder sb = new StringBuilder();
        Collections.sort(transactions, Collections.reverseOrder());

        for (String s : transactions) {
            sb.append(s);
            sb.append("\n");
        }
        results = valueOf(sb);
    }


    public String print() {
        return title + "\n" + results.substring(0, (results.length() -1));
    }


}
