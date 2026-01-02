class Box {
    int l, b;
    Box() { l = b = 0; }
    Box(int x, int y) { l = x; b = y; }
    int area() { return l * b; }
}
class Test {
    public static void main(String[] args) {
        Box b1 = new Box(4, 5);
        System.out.println(b1.area());
    }
}
