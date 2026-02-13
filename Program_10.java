/* Practice Problem — Pizza Ordering System
Scenario

You are designing a small Java program for a pizza shop that manages pizza orders.
Each pizza has size, toppings, and price calculation rules.


Part A — Basic Class & Constructor

Create a class Pizza with:
Data Members
String size (Small / Medium / Large)
int cheeseToppings
int pepperoniToppings
int veggieToppings

Constructor
Initialize all fields using a constructor.

Method
double calcCost()

Cost rules:
Size Base  Price
Small         8
Medium    10
Large        12
Each topping → + ₹2


Part B — Method Overloading

Overload method addToppings():
1. Add only cheese
addToppings(int cheese)

2. Add cheese & pepperoni
addToppings(int cheese, int pepperoni)

3. Add all toppings
addToppings(int cheese, int pepperoni, int veggie)

Note: Update topping counts accordingly.

Part C - In main():
1. Create one normal Pizza
2. Create one DeluxePizza
3. Use different overloaded methods
4. Display final cost
*/
class Pizza {

    String size;
    int cheeseToppings;
    int pepperoniToppings;
    int veggieToppings;

    // Constructor
    Pizza(String size, int cheese, int pepperoni, int veggie) {
        this.size = size;
        this.cheeseToppings = cheese;
        this.pepperoniToppings = pepperoni;
        this.veggieToppings = veggie;
    }

    // Method to calculate cost
    double calcCost() {

        int basePrice = 0;

        if (size.equals("Small")) {
            basePrice = 8;
        } else if (size.equals("Medium")) {
            basePrice = 10;
        } else if (size.equals("Large")) {
            basePrice = 12;
        }

        int toppingsCost = (cheeseToppings + pepperoniToppings + veggieToppings) * 2;

        return basePrice + toppingsCost;
    }

    // Method Overloading

    // 1. Add only cheese
    void addToppings(int cheese) {
        this.cheeseToppings += cheese;
    }

    // 2. Add cheese & pepperoni
    void addToppings(int cheese, int pepperoni) {
        this.cheeseToppings += cheese;
        this.pepperoniToppings += pepperoni;
    }

    // 3. Add all toppings
    void addToppings(int cheese, int pepperoni, int veggie) {
        this.cheeseToppings += cheese;
        this.pepperoniToppings += pepperoni;
        this.veggieToppings += veggie;
    }
}


public class Program_10 {
    public static void main(String[] args) {

        // 1. Normal Pizza
        Pizza normalPizza = new Pizza("Small", 1, 1, 0);

        // Using overloaded method (add only cheese)
        normalPizza.addToppings(2);

        System.out.println("Normal Pizza Cost: ₹" + normalPizza.calcCost());


        // 2. Deluxe Pizza
        Pizza deluxePizza = new Pizza("Large", 2, 2, 2);

        // Using overloaded method (add all toppings)
        deluxePizza.addToppings(1, 1, 1);

        System.out.println("Deluxe Pizza Cost: ₹" + deluxePizza.calcCost());
    }
}