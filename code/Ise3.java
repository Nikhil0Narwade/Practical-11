class Ex{
final int age;
Ex(int i){
age = 4;
System.out.println("Hi from Ex(int)");
System.out.println(i);

}
Ex(){

    System.out.println("Hi from Ex()");
    age = 345;
}

}
public class Ise3 {
    Ise3(int no){
        System.out.println("Hi from Ise3()"+no);

    }
    public Ex createExam(){
        return new Ex(45);

    }
    public static void main(String[] args) {
        System.out.println(new Ise3(111).createExam());
    }


}
