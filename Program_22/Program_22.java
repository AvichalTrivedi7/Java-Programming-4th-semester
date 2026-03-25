package Program_22;
// Interface extend each other too !

interface Shape{
    double area();
}

interface Coloured{
    String getColour();
}

interface ColouredShape extends Shape, Coloured{
    void describe();
}

public class Program_22 implements ColouredShape {
    private double r = 5.0;
    public static void main(String[] args) {
        // can use and see how it goes...
    }
    public double area(){
        return Math.PI*r*r ;
    }
    public String getColour(){
        return "Red";
    }
    public void describe(){
        System.out.println("Red Circle");
    }
    
}
