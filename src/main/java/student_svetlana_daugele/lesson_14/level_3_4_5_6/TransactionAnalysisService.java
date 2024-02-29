package student_svetlana_daugele.lesson_14.level_3_4_5_6;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class TransactionAnalysisService {
    public List<Transaction> findTransactionsIn2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .collect(toList());
    }

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(toList());
    }

    public List<String> findTraderNamesFromCambridge(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .map(trader -> trader.getCity())
                .filter(city -> city.equals("Cambridge"))
                .unordered()
                .collect(toList());
    }
    public List<String> findTraderNamesFromCity(List<Transaction> transactions, String cityToFind) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .map(trader -> trader.getCity())
                .filter(city -> city.equals(cityToFind))
                .unordered()
                .collect(toList());
    }
    public boolean isAnyTraderBasedOnMilan(List<Transaction> transactions) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
    }
    public boolean isAnyTraderBasedOnCity(List<Transaction> transactions, String cityToCheck) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(cityToCheck));
    }

}

