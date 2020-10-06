/*
 * Brad Cutten
 * Sept 2014
 * A rectangular object extends AbstractShape and in the process implements
 * the Shape interface
 */
package shapetestharnessccp2_4;

import TurtleGraphics.Pen;

public class Rect extends AbstractShape {

    private double height, width;

    //default constructor
    public Rect() {
        super();
        height = 1;
        width = 1;
    }

    //secondary constructor
    public Rect(double xLoc, double yLoc, double h, double w) {
        super(xLoc, yLoc);
        height = h;
        width = w;
    }

    //the next three methods were abstract in the superclass
    //Now we define them
    //returns the area of the rectangle
    public double area() {
        return height * width;
    }

    //draws the rectangle using the given pen
    public void draw(Pen p) {
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

    //increases the size of the rectangle
    public void stretchBy(double factor) {
        height = height * factor;
        width = width * factor;
    }

    //Notice that the toString method calls the corresponding method in the 
    //super class in order to accomplish it's task
    //In the superclass, the toString method calls area, which will activate 
    //the area method in this class and not the area method in the superclass
    //which is abstract
    public String toString() {
        String str = "RECTANGLE\n"
                + "Width and Height: " + width + " and " + height + "\n"
                + super.toString();
        return str;
    }

    public boolean equals(Rect otherRect) {
        boolean result = false;

        if (otherRect.xPos == this.xPos
                && otherRect.yPos == this.yPos
                && otherRect.height == this.height
                && otherRect.width == this.width) {
            result = true;
        }

        return result;
    }
}
