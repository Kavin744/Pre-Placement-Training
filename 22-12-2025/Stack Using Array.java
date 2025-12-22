public class StackArray {
    int top = -1;
    int[] stack = new int[5];

    void push(int value) {
        if (top == stack.length - 1)
            System.out.println("Stack Overflow");
        else
            stack[++top] = value;
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println("Popped: " + stack[top--]);
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.pop();
    }
}
