class Base {
    int a = 5;

    void show() {
        System.out.println("This is display function in UseofSuper class with int as " + a);
    }
}

class Derived extends Base {
    void show() {
        System.out.println("This is show function in Derived class with int as " + a);
    }

    void display() {
        show();
        super.a = 10;
        super.show();
    }
}

public class UseofSuper {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.display();
    }
}
