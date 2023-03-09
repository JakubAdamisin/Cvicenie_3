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

        System.out.println("Vyber vhodnu moznost:\n");
        System.out.println("Ak chces zoznam zoradit podla ID zdola hore stlac:1");
        System.out.println("Ak chces zoznam zoradit podla ID zhora dole stlac:2");
        System.out.println("Ak chces zoznam zoradit podla mena abecedne stlac:3");
        System.out.println("Ak chces zoznam zoradit podla mena abecednhe ale od konca stlac:4");
        System.out.println("Ak chces zoznam zoradit podla priezviska abecedne stlac:5");
        System.out.println("Ak chces zoznam zoradit podla priezviska abecednhe ale od konca stlac:6");
        System.out.println("Ak chces zoznam zoradit podla veku zdola hore stlac:7");
        System.out.println("Ak chces zoznam zoradit podla veku zhora dole stlac:8");
        int a = KeyboardInput.readInt();

        switch (a) {
            case 1: {
                Collections.sort(student, new SortByID());
                for (int i = 0; i < student.size(); i++)
                    System.out.println(student.get(i));
                break;
            }
            case 2: {
                Collections.sort(student, new SortByID());
                for (int i = student.size() - 1; i >= 0; i--)
                    System.out.println(student.get(i));
                break;
            }
            case 3: {
                Collections.sort(student, new SortByName());
                for (int i = 0; i < student.size(); i++)
                    System.out.println(student.get(i));
                break;
            }
            case 4: {
                Collections.sort(student, new SortByName());
                for (int i = student.size()-1; i >= 0; i--)
                    System.out.println(student.get(i));
                break;
            }
            case 5: {
                Collections.sort(student, new SortBySurename());
                for (int i = 0; i < student.size(); i++)
                    System.out.println(student.get(i));
                break;
            }
            case 6: {
                Collections.sort(student, new SortBySurename());
                for (int i = student.size()-1; i >= 0; i--)
                    System.out.println(student.get(i));
                break;
            }
            case 7: {
                Collections.sort(student, new SortByVek());
                for (int i = 0; i < student.size(); i++)
                    System.out.println(student.get(i));
                break;
            }
            case 8: {
                Collections.sort(student, new SortByVek());
                for (int i = student.size() - 1; i >= 0; i--)
                    System.out.println(student.get(i));
                break;
            }
            default:
                System.out.println("Zle si zvolil cislo:");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
