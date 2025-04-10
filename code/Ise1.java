 class Exam{
String name;
Exam(){

System.out.println("Hi from Exam()");    
}
    
}
 public class Ise1 extends Exam{

    Ise1(){
        System.out.println("Hi form Classp2()");
    }
    Ise1(int no){

        System.out.println("hi from Classp2()"+no);
    }
    
    public static void main(String[] args) {
        Ise1 Ise = new Ise1();
       // System.out.println(Ise);

    }

}
