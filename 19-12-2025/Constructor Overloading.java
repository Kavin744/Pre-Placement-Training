class Rectangle {
    int length, breadth;

    Rectangle() {
        length = breadth = 0;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 5);

        System.out.println("Area1: " + r1.area());
        System.out.println("Area2: " + r2.area());
    }
}
