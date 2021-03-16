package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RandomEnroller implements Enroller{
    private class StudentWithRandom{
        final Student student;
        double punkty;

        private StudentWithRandom(Student student,double punkty) {
            this.student = student;
            this.punkty=punkty;
        }

        public double getPunkty() {
            return punkty;
        }
    }
    List<StudentWithRandom> lista=new ArrayList<StudentWithRandom>();
    SubjectInstance instance1;
    @Override
    public void clear() {
        lista.clear();
    }

    @Override
    public void setSubjectInstance(SubjectInstance instance) {
        instance1=instance;
    }

    @Override
    public void addStudent(Student student) {
        lista.add(new StudentWithRandom(student, Math.random()));
    }

    @Override
    public void process() {
        lista.sort(Comparator.comparingDouble(StudentWithRandom::getPunkty));
        for(int i=0;i< instance1.getLimit()&&i<lista.size();i++)
            instance1.enroll(lista.get(i).student);
    }
}
