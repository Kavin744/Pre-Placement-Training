public class PalindromeNum {
    public static void main(String[] args) {
        int n = 121, rev = 0, temp = n;

        while(n > 0){
            rev = rev*10 + n%10;
            n /= 10;
        }
        System.out.println(rev == temp);
    }
}
