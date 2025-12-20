import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Add  2.Subtract  3.Multiply  4.Divide");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Division by zero not allowed");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
