package com.necatisahin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(new Student("Yasemin", 22), new Student("Helen", 20), new Student("Derin", 25));

        System.out.println("Student List without sorting");
        studentList.forEach(p-> System.out.println(p.toString()));

        Collections.sort(studentList);

        System.out.println("Student List sorting with Comparable by compareTo methods.");
        studentList.forEach(p-> System.out.println(p.toString()));

        System.out.println("Student List sorting with Comparator by compareTo methods.");
        Collections.sort(studentList,new SortByAgeComparator());
        studentList.forEach(p-> System.out.println(p.toString()));

    }
}