/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject3;

/**
 *
 * @author nikhilnarwade
 */


class Student {
    public static int totalStudents = 0; // Track total number of students

    Student() {
        totalStudents++; // Increase count when a new student is created
    }
}

class RegularStudent extends Student {
    String name;
    String branch;
    String dob;
    float mhtcetScore;
    public static int totalRegularStudents = 0; // Track only Regular Students

    RegularStudent(String name, String branch, String dob, float mhtcetScore) {
        super(); // Calls Student constructor, which increments totalStudents
        this.name = name;
        this.branch = branch;
        this.dob = dob;
        this.mhtcetScore = mhtcetScore;
        totalRegularStudents++; // Count Regular Students separately
    }

//    public String toString() {
//        return "\nName: " + this.name + "\nBranch: " + this.branch + "\nDOB: " + this.dob + "\nMHTCET Score: " + this.mhtcetScore;
//    }
//}
}
class DSYStudent extends Student {
    String name;
    String branch;
    String dob;
    float diplomaScore;
    public static int totalDSYStudents = 0; // Track only DSY Students

    DSYStudent(String name, String branch, String dob, float diplomaScore) {
        super(); // Calls Student constructor, which increments totalStudents
        this.name = name;
        this.branch = branch;
        this.dob = dob;
        this.diplomaScore = diplomaScore;
        totalDSYStudents++; // Count DSY Students separately
    }

    public String toString() {
        return "\nName: " + this.name + "\nBranch: " + this.branch + "\nDOB: " + this.dob + "\nDiploma Score: " + this.diplomaScore;
    }
}

public class CMS {
    public static void main(String[] args) {
        RegularStudent rpm = new RegularStudent("R P Mathwale", "IT", "2003-08-12", 95.5f);
        DSYStudent amf = new DSYStudent("A M Fajge", "CSE", "2002-05-12", 95.5f);

        System.out.println("Total Number of Students: " + Student.totalStudents);
        System.out.println("Total Number of Regular Students: " + RegularStudent.totalRegularStudents);
        System.out.println("Total Number of DSY Students: " + DSYStudent.totalDSYStudents);

        RegularStudent bss = new RegularStudent("B S Shetty", "IT", "2003-11-03", 99.5f);

        System.out.println("Total Number of Students: " + Student.totalStudents);
        System.out.println("Total Number of Regular Students: " + RegularStudent.totalRegularStudents);
        System.out.println("Total Number of DSY Students: " + DSYStudent.totalDSYStudents);

        System.out.println(amf);
        System.out.println("-----");
        System.out.println(bss);
    }
}
