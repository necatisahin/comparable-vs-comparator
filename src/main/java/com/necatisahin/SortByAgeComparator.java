package com.necatisahin;

import java.util.Comparator;

public class SortByAgeComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
