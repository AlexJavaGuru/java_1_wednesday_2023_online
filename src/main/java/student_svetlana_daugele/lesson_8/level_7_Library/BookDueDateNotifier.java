package student_svetlana_daugele.lesson_8.level_7_Library;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
class BookDueDateNotifier {
    private ScheduledExecutorService scheduler;

    public BookDueDateNotifier() {
        this.scheduler = Executors.newScheduledThreadPool(1);
    }

    public void scheduleNotification(Loan loan) {
        long daysUntilDue = ChronoUnit.DAYS.between(LocalDate.now(), loan.getDueDate());

        if (daysUntilDue > 0) {
            scheduler.schedule(() -> sendNotification(loan.getBorrower(), daysUntilDue), daysUntilDue, TimeUnit.DAYS);
        }
    }

    private void sendNotification(LibraryMember member, long daysUntilDue) {
        System.out.println("Notification sent to " + member.getName() + ": Your book is due in " + daysUntilDue + " days.");
    }

    // Метод для остановки планировщика
    public void stopScheduler() {
        scheduler.shutdown();
    }


}
