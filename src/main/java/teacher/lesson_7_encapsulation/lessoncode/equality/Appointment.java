package teacher.lesson_7_encapsulation.lessoncode.equality;

import java.util.Date;
import java.util.SimpleTimeZone;

public class Appointment {

    private String appointmentName;
    private Date startDate;
    private Date endDate;

    public boolean isIntersects(Appointment a) {
        return startDate == a.startDate; //TO DO Logic here...
    }
}
