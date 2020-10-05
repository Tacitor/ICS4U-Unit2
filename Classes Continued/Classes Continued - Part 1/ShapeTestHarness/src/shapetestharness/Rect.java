/*
 * Brad Cutten
 * Sept 2014
 * What is the purpose of this file?
This file uses the Shape interface. It describes what a Ractangle object looks like and it does so by asking the Shape interface what a Shape looks like.
 */
package shapetestharness;
import TurtleGraphics.Pen;

public class Rect implements Shape{
    
    private double xPos, yPos;
    private double height, width;
    
    //Constructor!
    //purpose is to create a fully blank and basic rect
    public Rect(){
        xPos = 0;
        yPos = 0;
        height = 1;
        width = 1;
    }
    
    //Constructor!
    //purpose is to create a rect with the values that the client wants
    public Rect(double xLoc, double yLoc, double h, double w){
        this(); //constructor chaining
        xPos = xLoc;
        yPos = yLoc;
        height = h;
        width = w;
    }
    
    public double area(){
        return height * width;
    }
    
    /**
     * This is a draw command and it is drawing a rectangle
     * @param p 
     */
    public void draw(Pen p){
        p.up();
        p.move(xPos, yPos);        
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
    }
    
    //Accessor! 
    public double getXPos(){
        return xPos;
    }
    
    //Accessor!
    public double getYPos(){
        return yPos;
    }
    
    //Mutator!
    public void move(double xLoc, double yLoc){
        xPos = xLoc;
        yPos= yLoc;
    }
    
    //Mutator!
    public void stretchBy(double factor){
        height = height * factor;
        width = width * factor;
    }
    
    //Accessor!
    public String toString(){
        String str = "RECTANGLE\n"
                + "Width and Height: " + width + " and " + height + "\n"
                + "(X,Y) Position: (" + xPos + "," + yPos + ")\n" 
                + "Area: " + area();
        return str;
    }
}
