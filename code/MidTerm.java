class Exam {
    static {
    System.out.println("Static Block 1: EXAM");
    }
    Exam(){
         System.out.println("EXAM Constructor");
    }
    {
    System.out.println("Init Block: EXAM");
    }
    static {
        System.out.println("Static Block 2: EXAM");
    }
}
   public class MidTerm extends Exam {

    static 
    {
        System.out.println("Static Block I: MIDTERM");
    }
    MidTerm(){
    System.out.println("MIDTERM Constructor");
    }
    public String toString() {
    return "MidTerm";
    }
    static {
    System.out.println("Static Block 2: MIDTERM");
    }
    public static void main(String[] args) 
    {
    System.out.println("Welcome To Mid Term Examiniation");
    Exam exam = new Exam();
    MidTerm javaProgramming = new MidTerm();
    System.out.println(javaProgramming);
    }
    {
    System.out.println("Init Block: MIDTERM");
    }
}
    
    