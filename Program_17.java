class Animal {
    void speak() { System.out.println("..."); }
}

class Dog extends Animal {
    @Override
    void speak() { System.out.println("Woof!"); }
    void fetch() { System.out.println("Fetching!"); }
}

class Cat extends Animal {
    @Override
    void speak() { System.out.println("Meow!"); }
    void purr()  { System.out.println("Purrrr..."); }
}

// ── The superclass variable only sees superclass methods ──────
// a1.fetch();  ← ❌ COMPILE ERROR
//   The variable type is Animal. Animal doesn't have fetch().
//   Even though the real object is Dog, the compiler won't allow it.

public class Program_17 {
    public static void main(String args[]){
        // UPCASTING: Child object → stored in Parent variable
        Animal a1 = new Dog();   // legal, automatic, no cast needed
        Animal a2 = new Cat();   // legal

        a1.speak();  // → "Woof!"  Java looks at the REAL object (Dog) at runtime
        a2.speak();  // → "Meow!"  Java looks at the REAL object (Cat) at runtime    
    }
}
