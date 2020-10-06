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
    
    //Purpose is to make sure all sub classes have an area calculation method
    abstract public double area();
    
    //Purpose is to make sure all sub classes have a draw method
    abstract public void draw(Pen p);
    
    //Accessor!
    /**
     * return part of the position (x part)
     * @return 
     */
    public final double getXPos(){
        return xPos;
    }
    
    //Accessor!
    /**
     * return part of the position (y part)
     * @return 
     */
    public final double getYPos(){
        return yPos;
    }
    
   //Mutator!
    /**
     * Mutate the position variables
     * @param xLoc
     * @param yLoc 
     */
    public void move(double xLoc, double yLoc){
        xPos = xLoc;
        yPos= yLoc;
    }
    
    //Mutator! Well not yet but when there's a body it is
    abstract public void stretchBy(double factor);
  
    public String toString(){
        String str= "(X,Y) Position: (" + xPos + "," + yPos + ")\n" 
                + "Area: " + area();
        return str;
    }
}
