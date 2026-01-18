// About and using If-else 

public class Program_7 {
    public static void main(String[] args) {
        

        boolean isRaining = true;
        if (isRaining) { 
            System.out.println("Bring an umbrella!"); 
        }
        int x = 20;
        int y = 18; 
        if (x > y) { 
            System.out.println("x is greater than y"); 
        } 
        int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy 
 

        if (weather == 1) { 
            System.out.println("Bring an umbrella."); 
        } else if (weather == 2) { 
            System.out.println("Wear sunglasses."); 
        } else { 
            System.out.println("Just go outside normally."); 
        }         


        int time = 22; 
        if (time < 10) { 
            System.out.println("Good morning."); 
        } else if (time < 18) { 
            System.out.println("Good day."); 
        } else { 
            System.out.println("Good evening."); 
        } 

        
    }
}
