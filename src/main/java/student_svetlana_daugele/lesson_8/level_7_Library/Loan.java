package student_svetlana_daugele.lesson_8.level_7_Library;

import java.time.LocalDate;
class Loan {
        private int loanId;
        private Book borrowedBook;
        private LibraryMember borrower;
        private LocalDate loanDate;
        private LocalDate dueDate;
        private boolean returned;
        private double penaltyPerDay;
        Loan relatedLoan;

    public double getPenaltyPerDay() {
        return penaltyPerDay;
    }

    public void setPenaltyPerDay(double penaltyPerDay) {
        this.penaltyPerDay = penaltyPerDay;
    }

    public double getMaxPenalty() {
        return maxPenalty;
    }

    public void setMaxPenalty(double maxPenalty) {
        this.maxPenalty = maxPenalty;
    }

    private double maxPenalty;

    public Loan(int loanId, Book borrowedBook, LibraryMember borrower, LocalDate loanDate, LocalDate dueDate, boolean returned) {
        this.loanId = loanId;
        this.borrowedBook = borrowedBook;
        this.borrower = borrower;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.returned = returned;
        this.penaltyPerDay = penaltyPerDay;
        this.maxPenalty = maxPenalty;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public LibraryMember getBorrower() {
        return borrower;
    }

    public void setBorrower(LibraryMember borrower) {
        this.borrower = borrower;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
            this.returned = returned;
        }
}
/*   необходимо добавить метод
public void checkAndIssuePenalty() {
        if (!returned && LocalDate.now().isAfter(dueDate)) {
            long daysOverdue = ChronoUnit.DAYS.between(dueDate, LocalDate.now());
            double calculatedPenalty = daysOverdue * penaltyPerDay;
            double actualPenalty = Math.min(calculatedPenalty, maxPenalty);

        }
 */