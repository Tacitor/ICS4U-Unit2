/*
 * Brad Cutten
 * Sept 2014
 * What is the purpose of this file?
This is a master file dictating the behavior of other classes, it is called an interface. Other classes call on this class to implement the methods.
 */
package shapetestharness;
import TurtleGraphics.Pen;
public interface Shape {
    /**
     * Purpose is calculate the area of a shape
     * @return the area as a double
     */
    public double area();
    /**
     * Purpose is to draw the shape using 2D graphics and the Turtle Library
     * @param p 
     */
    public void draw(Pen p);
    
    //Accessor!
    /**
     * An Accessor for the x position
     * @return 
     */
    public double getXPos();
    
    //Accessor!
    /**
     * An Accessor for the y position
     * @return 
     */
    public double getYPos();
    
    //Mutator!
    /**
     * An Mutator for the x and y positions
     * @param xLoc
     * @param yLoc 
     */
    public void move(double xLoc, double yLoc);
    
    //Mutator!
    /**
     * An Mutator for the size of the shape, used to enlarge and decrease the size.
     * @param factor 
     */
    public void stretchBy(double factor);
    
    //Accessor!
    /**
     * Print the attributes of the shape
     * @return 
     */
    public String toString();
}


