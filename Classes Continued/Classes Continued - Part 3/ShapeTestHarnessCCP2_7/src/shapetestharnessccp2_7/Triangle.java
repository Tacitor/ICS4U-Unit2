/*
 * Lukas Krampiz
 * Oct 6, 2020
 * 
 */
package shapetestharnessccp2_7;

import TurtleGraphics.Pen;

/**
 *
 * @author lukra1175
 */
public class Triangle extends AbstractShape{
    
    protected double xPos2;
    protected double yPos2;
    protected double xPos3;
    protected double yPos3;
    
    public Triangle() {
        super();
        xPos2 = 0;
        yPos2 = 0;
        xPos3 = 0;
        yPos3 = 0;
    }
    
    public Triangle(double xLoc, double yLoc, double xLoc2, double yLoc2, double xLoc3, double yLoc3) {
        super(xLoc, yLoc);
        xPos2 = xLoc2;
        yPos2 = yLoc2;
        xPos3 = xLoc3;
        yPos3 = yLoc3;
    }
    
    public double area() {
        
    }
    
    public void draw(Pen p) {
        
    }
    
    public double getPerim() {
        
    }
    
    public void move(double xLoc, double yLoc) {
        
    }
    
    public void stretchBy(double factor) {
        
    }
    
    public String toString() {
        String str = "TRIANGLE\n"
                + "(X,Y) Position: (" + xPos + "," + yPos + ")\n"; //add the other points
        
        return str;
    }
    
    public Triangle clone() {
        Triangle copy = new Triangle(xPos, yPos, xPos2, yPos2, xPos3, yPos3);
        return copy;
    }
    
    public boolean equals() {
        return false;
    }
}
