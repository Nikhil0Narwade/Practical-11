/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject2;

/**
 *
 * @author nikhilnarwade
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.example.gradleproject2;

/**
 *
 * @author nikhilnarwade
 */
 class Student {
   public static int count=0;
     
    Student(){
        count++;
        
    }
   }
class RegularStudent extends Student{
    
    String name;
    String branch;
    String dob;
    float mhtcetScore;
    //public static int count=0;
    
    RegularStudent(String name,String branch,String dob,float mhtcetScore){
       super();
        this.name= name;
        this.branch = branch;
        this.dob=dob;
        this.mhtcetScore=mhtcetScore;
       // count++;
        
       }
    
       public String toString(){
    
        return "\nName: "+this.name  + "\nBranch : "+this.branch + "\nDOB: "+this.dob + "\nMHTCET score: "+this.mhtcetScore ;
    
    }

    }

class DSYStudent extends Student{
    
    String name;
    String branch;
    String dob;
    float diplomaScore;
  // public static int count=0;
    
    DSYStudent(String name,String branch,String dob,float diplomaScore){
       super();
        this.name= name;
        this.branch = branch;
        this.dob=dob;
        this.diplomaScore=diplomaScore;
       // count++;
        
       }
    public String toString(){
    
        return "\nName: "+this.name  + "\nBranch : "+this.branch + "\nDOB: "+this.dob + "\nDIploma score: "+this.diplomaScore ;
    
    }

    }

public class Oh{
    
    public static void main(String[] args){

RegularStudent rpm = new RegularStudent("R P Mathwale","IT","2003-08-12",95.5f);
DSYStudent amf = new DSYStudent("A M Fajge","CSE","2002-05-12",95.5f);
System.out.println("Total Number Of Students: "+ Student.count);
System.out.println("Total Number Of REgStudents: "+ RegularStudent.count);
System.out.println("Total Number Of DSYStudents: "+ DSYStudent.count);

RegularStudent bss = new RegularStudent("B S shetty","IT","2003-11-03",99.5f);

System.out.println("Total Number Of Students: "+ Student.count);
System.out.println("Total Number Of RegStudents: "+ RegularStudent.count);

System.out.println("Total Number Of DSYStudents: "+ DSYStudent.count);

System.out.println(amf);
System.out.println("-----");
System.out.println(bss);




    }
    

}

