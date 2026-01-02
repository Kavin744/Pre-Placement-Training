import java.util.Arrays;
class BinarySearch {
    public static void main(String[] args) {
        int[] a = {40, 10, 30, 20};
        Arrays.sort(a);
        int key = 30, l = 0, h = a.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (a[m] == key) {
                System.out.println("Found");
                return;
            }
            if (a[m] < key) l = m + 1;
            else h = m - 1;
        }
        System.out.println("Not Found");
    }
}
