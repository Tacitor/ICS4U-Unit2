/*
 * Brad Cutten
 * Sept 2014
 * An abstract class which ... Implments the Shape interface.
 */
package shapetestharnessccp2;
import TurtleGraphics.Pen;

abstract public class AbstractShape implements Shape {
    
    protected double xPos;
    protected double yPos;
    
    //Constructor!
    //purpose is to create blank Shape at the origin
    public AbstractShape (){
        xPos = 0;
        yPos = 0;        
    }
    
    //Constructor!
    //purpose is to create a more custom shape that has a position that the client chose
    public AbstractShape(double xLoc, double yLoc){
        this();
        xPos = xLoc;
        yPos = yLoc;
    }
    
  
    abstract public double area();
    
    abstract public void draw(Pen p);
  
    public final double getXPos(){
        return xPos;
    }
    
    public final double getYPos(){
        return yPos;
    }
    
   
    public void move(double xLoc, double yLoc){
        xPos = xLoc;
        yPos= yLoc;
    }
    
    abstract public void stretchBy(double factor);
  
    public String toString(){
        String str= "(X,Y) Position: (" + xPos + "," + yPos + ")\n" 
                + "Area: " + area();
        return str;
    }
}
