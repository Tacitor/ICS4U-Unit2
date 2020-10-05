/*
 * Brad Cutten
 * Sept 2014
 * A wheel object which... extents the Circle class. In the process it extends the AbstractShape class, and implemnets the Shape interface.
 */
package shapetestharnessccp2;
import TurtleGraphics.Pen;

public class Wheel extends Circle {
    private int spokes;
    
    //Constructor!
    //purpose is to create a blank circle, wich creates a blank AbstractShape at (0,0) also adds 0 spokes
    public Wheel(){
        super();            
        spokes = 0; 
    }
    
    //Constructor!
    //purpose is to create a custom wheel at the postion, and with the radius and spoke count the client wants
    public Wheel(double xLoc, double yLoc, double r, int s){
        super(xLoc, yLoc, r);        
        spokes = s;
    }
    
    public void draw(Pen p){        
        super.draw(p);
      
        for(int i = 1; i <= spokes; i++){
            p.up();
            p.move(xPos, yPos);
            p.setDirection(i*360.0 / spokes);
            p.down();
            p.move(radius);
        }
        
    }
    
    public void setSpokes(int s){
        spokes = s;
    }
    
    
    public String toString(){
        String str = "WHEEL\n"
                + "Radius: " + radius + "\n"
                + "Spokes: " + spokes + "\n"
                + "(X,Y) Position: (" + xPos + "," + yPos + ")\n"
                + "Area: " + area();
        return str;
    }
    
}
