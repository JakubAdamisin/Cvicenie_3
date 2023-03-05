package sk.stuba.fei.uim.oop;

import java.util.ArrayList;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Main {
    public static void main(String[] args) {
//    1. Uloha   /////////////////////////////////////////////////////////////////////////////////////
//    Student student = new Student();
//    Student student1 = new Student(10,"Juro","Slovak",10);
//
//        System.out.println("meno "+student.getMeno()+" priezvisko "+student.getPriezvisko());
//        student.setPriezvisko("Potkan");
//        student.setMeno("Ondrej");
//        System.out.println("meno "+student.getMeno()+" priezvisko "+student.getPriezvisko());
//
//        System.out.println("meno "+student1.getMeno()+" priezvisko "+student1.getPriezvisko());
////////////////////////////////////////////////////////////////////////////////////////////////////////
//        2.Uloha   ////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Student> student = new ArrayList<Student>();
        student.add(new Student(1,"Juraj","Onderko",19));
        student.add(new Student(112,"Miro","Svec",19));
        student.add(new Student(105,"Jaro","Novak",21));
        student.add(new Student(204,"Peter","Balaz",22));
        student.add(new Student(404,"Juraj","Lepak",24));

        Collections.sort(student, new SortByName());

        for (int i = 0; i < student.size(); i++)
            System.out.println(student.get(i));

//        for (int i = 0; i < 5; i++) {
//            System.out.println(student[i].getMeno() +"   "+ student[i].getPriezvisko()  +"   "+ student[i].getVek() +"   "+ student[i].getID());
//        }

//        String[] pole = new String[5];
//        System.out.println();
//        for (int i = 0; i < 5; i++) {
//            pole[i]= student[i].getMeno();
//        }
//        Arrays.sort(pole);
//        System.out.println(Arrays.toString(pole));
    }
}
