package student_svetlana_daugele.lesson_14.level_3_4_5_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TransactionAnalysisServiceTest {

    @Test
    void testFindTransactionsIn2011() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        TransactionAnalysisService analysisService = new TransactionAnalysisService();

        List<Transaction> transactionsIn2011 = analysisService.findTransactionsIn2011(transactions);

        Assertions.assertEquals(2, transactionsIn2011.size());
        for (Transaction transaction : transactionsIn2011) {
            Assertions.assertEquals(2011, transaction.getYear());
        }
    }

    @Test
    void testFindTransactionsByYear() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        TransactionAnalysisService analysisService = new TransactionAnalysisService();

        List<Transaction> transactionsIn2012 = analysisService.findTransactionsByYear(transactions, 2012);

        Assertions.assertEquals(4, transactionsIn2012.size());
        for (Transaction transaction : transactionsIn2012) {
            Assertions.assertEquals(2012, transaction.getYear());
        }
    }
}