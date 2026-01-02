interface Shape {
    void area();
}
class Square implements Shape {
    public void area() {
        System.out.println(4 * 4);
    }
}
