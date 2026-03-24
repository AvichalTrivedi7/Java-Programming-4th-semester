// Interfaces - it is a reference type that can only define abstract methods not concrete ones.
// It is fully abstract and everything inside is by default public.
// All variables are by default public static final - which means they are constant, which in turn again means that they cannot be changed.  
// Interfaces are implemented, classes are extended.

interface Drawable{
    void draw();
    void resize(double factor);

    int MAX_SIZE = 1000;    
}

interface Saveable{
    void save(String filename);
    void load(String filename);
}

class Circle implements Drawable, Saveable{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }

    // Must implement all methods from drawable
    public void draw(){
        System.out.println("Drawing circle r=" + radius);
    }

    public void resize(double factor){
        radius *= factor;
    }

    
    // Must implement all methods from saveable
    public void save(String f){
        System.out.println("The data has been saved ==>" + f);
    }
    public void load(String f){
        System.out.println("The data has been loaded ==>" + f);
    }
    
}

public class Program_21{
    public static void main(String[] args) {
        Drawable d; // interface reference variable
        d = new Circle(5.5);
        d.draw();
    }
}
