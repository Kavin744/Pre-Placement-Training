import java.util.Scanner;
class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), temp = n, sum = 0;
        int digits = String.valueOf(n).length();
        while (n != 0) {
            int r = n % 10;
            sum += Math.pow(r, digits);
            n /= 10;
        }
        System.out.println(sum == temp ? "Armstrong" : "Not Armstrong");
    }
}
