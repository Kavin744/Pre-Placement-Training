import java.util.Scanner;
class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), flag = 1;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) flag = 0;
        System.out.println(flag == 1 ? "Prime" : "Not Prime");
    }
}
