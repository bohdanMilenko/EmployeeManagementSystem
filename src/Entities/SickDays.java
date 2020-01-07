package Entities;

import java.time.LocalDate;
import java.util.List;

public class SickDays {

    private int initialNumberOfSickDays;
    private List<LocalDate>  datesUsedDays;
    private int sickDaysLeft;

    public SickDays(int initialNumberOfSickDays) {
        this.initialNumberOfSickDays = initialNumberOfSickDays;
    }

    public int getInitialNumberOfSickDays() {
        return initialNumberOfSickDays;
    }

    public void setInitialNumberOfSickDays(int initialNumberOfSickDays) {
        this.initialNumberOfSickDays = initialNumberOfSickDays;
    }

    public List<LocalDate> getDatesUsedDays() {
        return datesUsedDays;
    }

    public void setDatesUsedDays(List<LocalDate> datesUsedDays) {
        this.datesUsedDays = datesUsedDays;
    }

    public int getSickDaysLeft() {
        return sickDaysLeft;
    }

    public void setSickDaysLeft(int sickDaysLeft) {
        this.sickDaysLeft = sickDaysLeft;
    }
}
