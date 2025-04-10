class Exa{
    String name;
    Exa(int i){
    
    System.out.println("Hi from Exam() = "+i);    
    }
        
    }
     public class Ise2 extends Exa{
    
      //  Ise2(){
          //  System.out.println("Hi form Classp2()");
       // }
        Ise2(int no){
            super(no);
            System.out.println("hi from Classp2()"+no);
        }
        
        public static void main(String[] args) {
            Ise2 Is = new Ise2(12);
            System.out.println(Is);
    
        }
    
    }
    