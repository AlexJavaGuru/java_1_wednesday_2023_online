package student_svetlana_daugele.lesson_8.level_7_Library;

class Penalty {
    private int penaltyId;
    private Loan relatedLoan;
    private double amount;
    private boolean paid;

    public int getPenaltyId() {
        return penaltyId;
    }

    public void setPenaltyId(int penaltyId) {
        this.penaltyId = penaltyId;
    }

    public Loan getRelatedLoan() {
        return relatedLoan;
    }

    public void setRelatedLoan(Loan relatedLoan) {
        this.relatedLoan = relatedLoan;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Penalty(int penaltyId, Loan relatedLoan) {
        this.penaltyId = penaltyId;
        this.relatedLoan = relatedLoan;
    }

    public void payPenalty() {
        this.paid = true;
    }
}
