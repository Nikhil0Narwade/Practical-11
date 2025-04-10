//import javax.print.DocFlavor.READER;

class Student {
    static int count=0;

    Student(){

        count++;

    }
    
}

class RegularStudent extends Student{
    static int count=0;
    String name ;
    String branch;
    String dob;
    float mhtcetScore;

    RegularStudent(String name , String branch, String dob , float nhtcetScore){
        super();
        count++;
        this.name = name;
        this.branch = branch ; 
        this.dob = dob;
        this.mhtcetScore  = mhtcetScore;



    }
    



    }

class DSYStudent extends Student {
    static int count=0;
    String name ;
    String branch;
    String dob;
    float diplomaScore;


    DSYStudent(String name , String branch, String dob, float diplomaScore){
        super();

        count++;
        this.name = name;
        this.branch = branch ; 
        this.dob = dob;
        this.diplomaScore  = diplomaScore;


}
}
class AM{

public static void main(String[] args) {
    RegularStudent rpm = new RegularStudent("R P Mathwale", "IT","2003-08-12",95.5);
    DSYStudent amf = new DSYStudent("A M Fajge", "CSE","2002-05-12",95.5);

    System.out.println("Total Number of Students :" + Student.count);
    System.out.println("Total Number of RegularStudents :" + RegularStudent.count);
    System.out.println("Total Number of DSYStudents :" + DSYStudent.count);


    RegularStudent bss = new RegularStudent("B S Shetty", "IT","2003-11-03",95.5);

    System.out.println("Total Number of Students :" + Student.count);
    System.out.println("Total Number of RegularStudents :" + RegularStudent.count);
    System.out.println("Total Number of DSYStudents :" + DSYStudent.count);

    System.out.println(amf);
    System.out.println("________");
    System.out.println(bss);


}


}

