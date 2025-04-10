class A {
    A() {
        System.out.println("Constructor A");
    }
}

class B extends A {
    B() {
        System.out.println("Constructor B");
    }

    {
        System.out.println("Instance Block B");
    }

    static {
        System.out.println("Static Block B");
    }
}

 class Test11 {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj);
    }
}
