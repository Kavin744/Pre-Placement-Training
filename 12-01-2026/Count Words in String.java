public class WordCount {
    public static void main(String[] args) {
        String s = "Java makes life easy";
        String[] words = s.split("\\s+");
        System.out.println("Words: " + words.length);
    }
}
