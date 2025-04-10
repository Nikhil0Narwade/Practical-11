public class Student {
    
static int number;
Student(){
int number = 1;
}
Student(int number)
{
    this.number = number;
}
public static void main(String[] args) {
    Student s = new Student();
    System.out.println(s.number);

    Student sa = new Student(777);
    System.out.println(s.number);
}



}
