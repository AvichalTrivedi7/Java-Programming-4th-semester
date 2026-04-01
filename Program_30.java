// More Strings

public class Program_30 {
    public static void main(String[] args) {

        String s = "  hello world  ";

        // Trim
        String trimmed = s.trim();
        System.out.println("Trimmed: " + trimmed);

        // Uppercase
        String upper = trimmed.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // Replace
        String replaced = upper.replace("WORLD", "JAVA");
        System.out.println("Replaced: " + replaced);

        // IMPORTANT: original string unchanged
        System.out.println("Original: " + s);

    }
}

    