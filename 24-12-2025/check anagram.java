import java.util.Arrays;
class Anagram {
    public static void main(String[] args) {
        String a = "listen", b = "silent";
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println(Arrays.equals(x, y));
    }
}
