/*
 * Brad Cutten
 * Sept 2014
 * Draws a smiling face on the screen
 */
package krampitzsmilingfacetestharnessidcp2;

import TurtleGraphics.*;
import java.awt.Color;

public class SmilingFace {
    private StandardPen pen;
    private double xPosition, yPosition;
    private double radius;
    private String colour;
    private boolean smiling;
    
    //Constructor #1, it's purpose is to create a new SmilingFace with deflaut positions
    public SmilingFace(){
        xPosition = 0;
        yPosition = 0;
        pen = new StandardPen(500,500);
        pen.setColor(Color.red);
        smiling = true;
    }
    
    //Constructor #2, it's purpose is to create a new SmilingFace with custom positions
    public SmilingFace(double x, double y){
        this(); 
        xPosition = x;
        yPosition = y;        
    }
    
    //purpose is to draw a smiling face. It does this by drawing three circles, 1 large one as the head and two smaller ones as the eyes
    public void draw(){
        double radius = 50;
        int smileFactor = 5;
        
        drawCircle(xPosition, yPosition, radius);
        
        
        drawCircle(xPosition - radius / 2.5, yPosition + radius /3, radius / 4);
        drawCircle(xPosition + radius / 2.5, yPosition + radius /3, radius / 4);
        
        //main mouth line
        drawLine(xPosition - radius /3, yPosition - radius / 2, xPosition + radius / 3, yPosition - radius / 2);
        
        //check for smile of no smile
        if (!smiling) {
            smileFactor=-smileFactor;
        }
        
        //emotion lines(happy up, sad down)
        drawLine(xPosition - radius /3, yPosition - radius / 2, xPosition - radius / 3 - 5, yPosition - radius / 2 + smileFactor);    //point at (x1,y1) and (x2,y2). (x1,y1) is connected to the mouth, (x2,y2) goes either up of down    
        drawLine(xPosition + radius /3, yPosition - radius / 2, xPosition + radius / 3 + 5, yPosition - radius / 2 + smileFactor);
    }
        
    //mutator
    //purpose is to "earase the smiling face" it does this by drawing over it in white, which is the background colour
    public void erase(){
        pen.setColor(Color.white);
        draw();
        pen.setColor(Color.red);
    }
    
    //mutator
    //purpose is to mutate the position of the smiling face
    public void move(double x, double y){
        xPosition = x;
        yPosition = y;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void setMood(boolean mood) {
        smiling = mood;
    }
    
    
    //purpose is to draw a circle in a specific spot
    private void drawCircle(double x, double y, double r){
        double side = 2.0 * Math.PI * r / 120.0;
        pen.up();
        pen.move(x+r, y-side / 2.0);
        pen.setDirection(90);
        pen.down();
        
        //purpose is to actually draw the circle. 120 times draw a segment of the cirle that is a arclength one 120th of the circumference and then rotate 3 degrees to draw another.
        for(int i = 0; i <120; i++){
            pen.move(side);
            pen.turn(3);
        }
    }
    
    //purpose is to draw a line from one point to a second
    private void drawLine(double x1, double y1, double x2, double y2){
        //method stub
        pen.up();
        pen.move(x1,y1);
        pen.down();
        pen.move(x2, y2);
        
    }
}
