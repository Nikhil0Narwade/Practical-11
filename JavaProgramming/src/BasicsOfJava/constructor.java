package BasicsOfJava;

public class constructor {

    static{
        System.out.println("Hi from static 1");

    }
    {
        System.out.println("hello");

    }
    constructor(int num){

        System.out.println("Hello from constructor , num= "+num);

    }
    public static void main(String[] args){

        constructor obj1 = new constructor(123);
        System.out.println( obj1);
        constructor obj2 = new constructor(321);

    }

    static{

        System.out.println("Hi from static 2");

    }

}
