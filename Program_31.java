// Even more Strings

public class Program_31 {
    public static void main(String[] args) {

        // Array of Strings
        String[] fruits = {"Apple", "Banana", "Cherry"};

        for (String f : fruits) {
            System.out.println(f);
        }

        // Split
        String data = "red,green,blue";
        String[] colors = data.split(",");

        System.out.println("After split:");
        for (String c : colors) {
            System.out.println(c);
        }

        // Join
        String joined = String.join("-", colors);
        System.out.println("Joined: " + joined);

        // Switch with String
        String day = "Sunday";

        switch (day) {
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Weekday");
        }
    }
}
