interface Sum {
    void add(int x, int y);
}

interface Mul {
    void multiply(int x, int y);
}

class T1 implements Sum, Mul {
    public void add(int x, int y) {
        System.out.println("Sum is: " + (x + y));
    }

    public void multiply(int x, int y) {
        System.out.println("Product is: " + (x * y));
    }

    void display() {
        System.out.println("Hello from T1");
    }
}

public class Interface {
    public static void main(String[] args) {
        T1 obj = new T1();
        obj.add(5, 10);
        obj.multiply(5, 10);
        obj.display();
    }
}
