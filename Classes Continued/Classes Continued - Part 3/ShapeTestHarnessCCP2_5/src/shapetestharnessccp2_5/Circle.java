/*
 * Brad Cutten
 * Sept 2014
 * A circle object extends AbstractShape and in the process implements the 
 * Shape interface
 */
package shapetestharnessccp2_5;
import TurtleGraphics.Pen;

public class Circle extends AbstractShape {
   
    protected double radius;
    
    //default constructor
    public Circle(){
        super();    //activate matching contstrctor in AbstractShape
        radius = 1; //init radius
    }
    
    //secondary constructor
    public Circle(double xLoc, double yLoc, double r){
        super(xLoc, yLoc);  //activate matching constructor in AbstractShape
        radius = r;         //init radius
    }
    
    //the next three methods were abstract in the superclass
    //Now we define them
    public double area(){
        return Math.PI * radius * radius;
    }
    
    //draws the circle using the given pen
    public void draw(Pen p){
        double side = 2.0 * Math.PI * radius /120.0;
        p.up();
        p.move(xPos + radius, yPos - side / 2.0);
        p.setDirection(90);
        p.down();
        for(int i = 0; i <120; i++){
            p.move(side);
            p.turn(3);
        }
    }
    
    //makes the circle larger
    public void stretchBy(double factor){
        radius = radius * factor;
    }
    
    //Notice that the toString method calls the corresponding method in the 
    //super class in order to accomplish it's task
    
    //In the superclass, the toString method calls area, which will activate 
    //the area method in this class and not the area method in the superclass
    //which is abstract
    public String toString(){
        String str = "CIRCLE\n"
                + "Radius: " + radius + "\n"
                + super.toString();
        return str;
    }
    
    public Circle clone() {
        Circle copy = new Circle(xPos, yPos, radius);
        
        return copy;
    }
}
