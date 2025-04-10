class Parent {
    static void display() {
        System.out.println("Parent Static");
    }

    void show() {
        System.out.println("Parent Instance");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child Static");
    }

    @Override
    void show() {
        System.out.println("Child Instance");
    }
}

 public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
        p.show();
    }
}
