class Exx{
    String name;
    Exx(int i){
    System.out.println("Hi from Ex(int)");
    
    }
  
    }
     class Ise4 extends Exx {
        Ise4(int no){
            super(no);
            System.out.println("Hi from Ise3()"+no);
    
        }
        
        public static void main(String[] args) {
            Ise4 iss = new Ise4(111);
            System.out.println(iss);
        }

        static{
            System.out.println("Hi from static block Ise4 Class");
        }
    
        {
            System.out.println("init block Ise4 Class");
        }
    
    }
    