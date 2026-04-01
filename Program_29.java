// Strings 

public class Program_29 {
    public static void main(String[] args) {

        String s = "Java Programming";

        // Length
        System.out.println("Length: " + s.length());

        // Character at index
        System.out.println("Char at 5: " + s.charAt(5));

        // Substring
        System.out.println("Substring: " + s.substring(5));

        // Index of
        System.out.println("Index of 'gram': " + s.indexOf("gram"));

        // Compare
        System.out.println("Equals: " + s.equals("Java Programming"));
        System.out.println("Ignore case: " + s.equalsIgnoreCase("java programming"));

    }
}