/*
 * Brad Cutten
 * Sept 2014
 * A wheel object which...
 */
package shapetestharnessccp2;
import TurtleGraphics.Pen;

public class Wheel extends Circle {
    private int spokes;
    
    
    public Wheel(){
        super();            
        spokes = 0; 
    }
    
    
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
