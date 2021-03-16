package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SubjectInstance {
    private Subject subject;
    private int year;
    private Teacher teacher;
    List<Student> students=new ArrayList<Student>();
    private int limit;

    public SubjectInstance(Subject subject, int year, Teacher teacher, int limit) {
        this.subject = subject;
        this.year = year;
        this.teacher = teacher;
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public boolean enroll(Student student){
        if(students.size()<limit){
            students.add(student);
        return true;}
        return false;
    }
    public List<Student> getStudents(){
        return  List.copyOf(students);
    }
}
