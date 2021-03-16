package com.company;

import java.util.ArrayList;
import java.util.List;

public class AlphabeticEnroller implements Enroller{
List<Student> lista=new ArrayList<Student>();
SubjectInstance instance2;
    @Override
    public void clear() {
        lista.clear();
    }

    @Override
    public void setSubjectInstance(SubjectInstance instance) {
    instance2=instance;
    }

    @Override
    public void addStudent(Student student) {
        lista.add(student);
    }

    @Override
    public void process() {
    lista.sort((Student a,Student b)->a.getLastName().compareTo(b.getLastName()));
    instance2.students=lista.subList(0,instance2.getLimit());
    }
}
