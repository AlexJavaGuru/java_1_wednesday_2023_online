package teacher.lesson_11_srp.lessoncode.traderapp.before;

//- Rule 1: трейдер по имени "Pokemon" является мошенником, все его транзакции должны быть отклонены.
//- Rule 2: все транзакции на сумму больше 1 000 000 должны быть отклонены.
//- Rule 3: все транзакции трейдеров из города "Сидней" должны быть отклонены.
//- Rule 4: все транзакции от трейдеров из страны Ямайка должны быть отклонены.
//- Rule 5: все транзакции трейдеров из Германии на сумму больше 1000 должны быть отклонены.
class FraudDetector {

    boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getFullName().equals("Pokemon") ||
                transaction.getAmount() > 1000000 ||
                transaction.getTrader().getCity().equals("Сидней") ||
                transaction.getTrader().getCountry().equals("Jamaika") ||
                (transaction.getTrader().getCountry().equals("Германии") && transaction.getAmount() > 1000)) {
            return true;
        }
        return false;
    }
}
