package student_svetlana_daugele.lesson_11.level_5_and_6;


class Transaction {
    private Trader trader;
    private int amount;

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", amount=" + amount +
                '}';
    }
}