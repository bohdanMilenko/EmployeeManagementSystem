package Entities;

import java.time.LocalTime;
import java.util.List;

public class VacationPackage {

    private int durationDays;
    private List<LocalTime> datesUsedDaysList;
    private int vacationDaysLeft;

    public VacationPackage(int durationDays) {
        this.durationDays = durationDays;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public List<LocalTime> getDatesUsedDaysList() {
        return datesUsedDaysList;
    }

    public void setDatesUsedDaysList(List<LocalTime> datesUsedDaysList) {
        this.datesUsedDaysList = datesUsedDaysList;
    }

    public int getVacationDaysLeft() {
        return vacationDaysLeft;
    }

    public void setVacationDaysLeft(int vacationDaysLeft) {
        this.vacationDaysLeft = vacationDaysLeft;
    }
}
