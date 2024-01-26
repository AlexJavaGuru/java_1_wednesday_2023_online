package student_svetlana_daugele.lesson_11.level_4;

class FraudDetector {
    boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon") || t.getAmount() > 1000000 || t.getTrader().getCity().equals("Sidney") || t.getTrader().getCountry().equals("Jamaica") || (t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000)) {
            return true;
        }
        return false;
    }
}
