import java.util.ArrayList;
import java.util.Collections;

import static java.lang.String.valueOf;

public class Statement {
    ArrayList<String> transactions = new ArrayList<>();
    String title = "date || credit || debit || balance";
    String stringOfTransactions;
    String statement;

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
        stringOfTransactions = valueOf(sb);
    }

    public void sortList(ArrayList<String> transactions){
        Collections.sort(transactions, Collections.reverseOrder());
    }

    public void formatResult(){
        statement = String.format("%s\n%s", title, stringOfTransactions.substring(0, (stringOfTransactions.length() -1)));
    }

    public String print() {
        arrayToString();
        formatResult();
        return statement;
    }
}
