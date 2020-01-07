package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String surname;
    private LocalDate yearOfBirth;
    private String position;
    private VacationPackage vacationPackage;
    private SickDays sickDays;
    private List<TimeCard> timeCards = new ArrayList<>();
    private List<Employee> employeeList;

    private Employee(String name, String surname, LocalDate yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public Employee() {
    }

    public static Employee createEmployeeInstance(){
        return new Employee();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(LocalDate yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public VacationPackage getVacationPackage() {
        return vacationPackage;
    }

    public void setVacationPackage(VacationPackage vacationPackage) {
        this.vacationPackage = vacationPackage;
    }

    public SickDays getSickDays() {
        return sickDays;
    }

    public void setSickDays(SickDays sickDays) {
        this.sickDays = sickDays;
    }

    public List<TimeCard> getTimeCards() {
        return timeCards;
    }

    public void setTimeCards(List<TimeCard> timeCards) {
        this.timeCards = timeCards;
    }
}
