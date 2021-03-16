package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Student extends Account{
private String course;
private int startYear;

    public Student(String login, String password, String firstName, String lastName, String course, int startYear) {
        super(login, password, firstName, lastName);
        this.course = course;
        this.startYear = startYear;
    }
    public int semester(){
        LocalDate now=LocalDate.now();
        Month m=now.getMonth();
        int r=now.getYear();
       int semestr;

        if(m.compareTo(Month.OCTOBER)<0) r--;
        semestr=(r-startYear)*2+1;
        if(m.compareTo(Month.FEBRUARY)>=0 && m.compareTo(Month.OCTOBER)<0)
            semestr+=1;
        return semestr;
    }
}
