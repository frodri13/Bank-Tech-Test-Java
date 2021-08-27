import java.util.ArrayList;
import java.util.Collections;

import static java.lang.String.valueOf;

public class Statement {
    ArrayList<String> transactions = new ArrayList<>();
    String title = "date || credit || debit || balance";
    String results;
    String resultsFinal;

    public void record(String transactionResult) {
        transactions.add(transactionResult);
    }

    public void arrayToString(){
        StringBuilder sb = new StringBuilder();
        sortList(transactions);

        for (String s : transactions) {
            sb.append(s);
            sb.append("\n");
        }
        results = valueOf(sb);
    }

    public void sortList(ArrayList<String> transactions){
        Collections.sort(transactions, Collections.reverseOrder());
    }

    public void formatResult(){
        resultsFinal = String.format("%s\n%s", title, results.substring(0, (results.length() -1)));
    }

    public String print() {
        arrayToString();
        formatResult();
        return resultsFinal;
    }
}
