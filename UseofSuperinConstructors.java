class Base {
    Base(int x) {
        System.out.println("This is Base class constructor" + x);
    }
}

class Derived extends Base {
    Derived(int x) {
        super(x);
        System.out.println("This is Derived class constructor");
    }
}

public class UseofSuperinConstructors {
    public static void main(String[] args) {
        Derived obj = new Derived(2);
    }
}
