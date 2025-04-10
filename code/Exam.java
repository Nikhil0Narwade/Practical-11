class Exam {
    static {
        System.out.println("Static Block 1: EXAM");
    }
    Exam() {
        System.out.println("EXAM Constructor");
    }
    {
        System.out.println("Init Block: EXAM");
    }
    static {
        System.out.println("Static Block 2: EXAM");
    }
}

class MidTerm extends Exam {
    static {
        System.out.println("Static Block 1: MIDTERM");
    }

    {
        System.out.println("Init Block: MIDTERM");
    }

    MidTerm() {
        System.out.println("MIDTERM Constructor");
    }

    public String toString() {
        return "MidTerm";
    }

    static {
        System.out.println("Static Block 2: MIDTERM");
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Mid Term Examination");

        // Using the 'exam' variable to avoid the warning
        Exam exam = new Exam();
        System.out.println("Exam instance created: " + exam.toString());

        MidTerm javaProgramming = new MidTerm();
        System.out.println(javaProgramming);
    }
}
