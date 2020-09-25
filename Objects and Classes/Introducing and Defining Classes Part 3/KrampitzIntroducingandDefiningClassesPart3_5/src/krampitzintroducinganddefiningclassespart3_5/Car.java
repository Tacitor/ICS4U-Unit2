/*
 * Lukas Krampitz
 * Sep 25, 2020
 * Develop a new class called Car. A Car has a color, a size, an X,Y position, and a draw method. 
 */
package krampitzintroducinganddefiningclassespart3_5;

import java.awt.Color;
import TurtleGraphics.*;

/**
 *
 * @author Lukas
 */
public class Car {
    //attributes
    private double size;
    private int x;
    private int y;
    private Color colour;
    private StandardPen pen;
    
    //constructors
    public Car() {
        size = 20;
        x = 0;
        y = 0;
        colour = Color.GREEN;
        pen = new StandardPen(500, 500);
        
    }
    public Car(int x, int y, Color colour) {
        this();
        this.x = x;
        this.y = y;
        this.colour = colour;
        pen.setColor(colour);
    }
    
    public Car(int x, int y, Color colour, double size) {
        this(x, y, colour);
        this.size = size;
    }
    
    //behavior
    public void draw() {
        //draw wheels
        drawCircle(x-(4*size), y-size, size); //left
        drawCircle(x+(4*size), y-size, size); //right
        
        //draw the frame
        drawRect(x-(6*size), y, x-(6*size), y+(2*size), x+(6*size), y+(2*size), x+(6*size), y);
        
        //draw the cab
        drawRect(x-(3*size), y+(2*size), x-(3*size), y+(4*size), x+(3*size), y+(4*size), x+(3*size), y+(2*size));
    }
    
    private void drawRect(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        pen.up();
        pen.move(x1, y1);
        pen.down();
        pen.move(x2, y2);
        pen.move(x3, y3);
        pen.move(x4, y4);
        pen.move(x1, y1);
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
    
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void erase() {
        pen.setColor(Color.WHITE);
        draw();
        pen.setColor(colour);
    }
    
}
