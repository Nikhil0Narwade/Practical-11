// Base class
class Student {
    static int count = 0; // Total number of students

    Student() {
        count++; // Increment student count
    }
}

// RegularStudent class
class RegularStudent extends Student {
    static int count = 0; // Count of Regular Students
    String name;
    String branch;
    String dob;
    float mhtcetScore;

    RegularStudent(String name, String branch, String dob, float mhtcetScore) {
        super(); // Calls Student constructor, incrementing total count
        count++; // Increment count for Regular Students
        this.name = name;
        this.branch = branch;
        this.dob = dob;
        this.mhtcetScore = mhtcetScore;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nBranch: " + branch + "\nDOB: " + dob + "\nMHTCET Score: " + mhtcetScore;
    }
}

// DSYStudent class
class DSYStudent extends Student {
    static int count = 0; // Count of DSY Students
    String name;
    String branch;
    String dob;
    float diplomaScore;

    DSYStudent(String name, String branch, String dob, float diplomaScore) {
        super(); // Calls Student constructor, incrementing total count
        count++; // Increment count for DSY Students
        this.name = name;
        this.branch = branch;
        this.dob = dob;
        this.diplomaScore = diplomaScore;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nBranch: " + branch + "\nDOB: " + dob + "\nDiploma Score: " + diplomaScore;
    }
}

// CMS class with the main method
public class CMS {
    public static void main(String[] args) {
        RegularStudent rpm = new RegularStudent("R P Mathwale", "IT", "2003-08-12", 95.5f);
        DSYStudent amf = new DSYStudent("A M Fajge", "CSE", "2002-05-12", 95.5f);

        System.out.println("Total Number of Students: " + Student.count);
        System.out.println("Total Number of Regular Students: " + RegularStudent.count);
        System.out.println("Total Number of DSY Students: " + DSYStudent.count);

        RegularStudent bss = new RegularStudent("B S Shetty", "IT", "2003-11-03", 99.5f);

        System.out.println("Total Number of Students: " + Student.count);
        System.out.println("Total Number of Regular Students: " + RegularStudent.count);
        System.out.println("Total Number of DSY Students: " + DSYStudent.count);

        System.out.println("\n" + amf);
        System.out.println("________");
        System.out.println(bss);
    }
}
