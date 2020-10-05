/*
 * Brad Cutten
 * Sept 2014
 * What is the purpose of this file?
This file uses the Shape interface. It describes what a Circle object looks like and it does so by asking the Shape interface what a Shape looks like.
 */
package shapetestharness;
import TurtleGraphics.Pen;

public class Circle implements Shape{
   
    private double xPos, yPos;
    private double radius;
    private final static double PI = 3.14;
    
    //Constructor!
    //purpose is to create a fully blank and basic circle    
    public Circle(){
        xPos = 0;
        yPos = 0;
        radius = 1; 
    }
    
    //Constructor!
    //purpose is to create a circle with the values that the client wants
    public Circle(double xLoc, double yLoc, double r){
        this();
        xPos = xLoc;
        yPos = yLoc;
        radius = r;         
    }
    
   
    public double area(){
        return PI * radius * radius;
    }
    
    /**
     * This is a draw command and it is drawing a circle
     * @param p 
     */
    public void draw(Pen p){
        double side = 2.0 * PI * radius /120.0;
        p.up();
        p.move(xPos + radius, yPos - side / 2.0);
        p.setDirection(90);
        p.down();
        
        //Loop! Purpose is to actually draw the circle. It does this by looping though the cricle in 3 degress archlengths and drawing little arch segments of the circle until the loop has drawn the circumference.
        for(int i = 0; i <120; i++){
            p.move(side);
            p.turn(3);
        }
    }
    
    //Mutator!
    public void stretchBy(double factor){
        radius = radius * factor;
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
    
    //Accessor!
    public String toString(){
        String str = "CIRCLE\n"
                + "Radius: " + radius + "\n"
                + "(X,Y) Position: (" + xPos + "," + yPos + ")\n" 
                + "Area: " + area();
        return str;
    }
}
