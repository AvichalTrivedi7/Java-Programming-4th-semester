/* Using super.method() to access parent class methodsw */

class LivingThings{
    void Breathe(){
        System.out.println("The living things breathe");
    }
    void Grow(){
        System.out.println("The living things grow");
    }
}

class Animals extends LivingThings{
    void Eat(){
        super.Breathe();
        System.out.println("The Animals eat");
    }
    void Move(){
        System.out.println("The Animals move");
    }
    void Sleep(){
        System.out.println("The Animals sleep");
    }
}

class Dogs extends Animals{
    void Bark(){
        super.Eat();
        System.out.println("The Dogs Bark");
    }
    void Fetch(){
        System.out.println("The Dogs Fetch");
    }
    void Wagtail(){
        System.out.println("The Dogs Wag their tail");
    }
}

public class Program_16 {
    public static void main(String args[]){
        Dogs d1 = new Dogs();
        d1.Bark();
        d1.Eat();
    }
}
