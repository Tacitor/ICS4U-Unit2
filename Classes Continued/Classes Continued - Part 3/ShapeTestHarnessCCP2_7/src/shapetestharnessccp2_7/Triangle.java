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
public class Triangle extends AbstractShape {

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
        return (Math.abs(xPos * yPos2 - xPos2 * yPos + xPos2 * yPos3 - xPos3 * yPos2 + xPos3 * yPos - xPos * yPos3) / 2);
    }

    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(xPos2, yPos2);
        p.move(xPos3, yPos3);
        p.move(xPos, yPos);
    }

    public double getPerim() {
        double sum = 0;

        sum += Math.sqrt((xPos - xPos2) * (xPos - xPos2) + (yPos - yPos2) * (yPos - yPos2));
        sum += Math.sqrt((xPos - xPos3) * (xPos - xPos3) + (yPos - yPos3) * (yPos - yPos3));
        sum += Math.sqrt((xPos3 - xPos2) * (xPos3 - xPos2) + (yPos3 - yPos2) * (yPos3 - yPos2));

        return sum;
    }
    
    /**
     * Mutate the position of the triangle
     * @param xTran The translation in the x
     * @param yTran The translation in the y
     */
    public void move(double xTran, double yTran) {
        xPos += xTran;
        xPos2 += xTran;
        xPos3 += xTran;
        yPos += yTran;
        yPos2 += yTran;
        yPos3 += yTran;
    }

    public void stretchBy(double factor) {
        xPos2 = xPos + (xPos2 - xPos) * factor;
        xPos3 = xPos + (xPos3 - xPos) * factor;
        yPos2 = yPos + (yPos2 - yPos) * factor;
        yPos3 = yPos + (yPos3 - yPos) * factor;
    }

    public String toString() {
        String str = "TRIANGLE\n"
                + "(X1,Y1) Position: (" + xPos + "," + yPos + ")\n"
                + "(X2,Y2) Position: (" + xPos2 + "," + yPos2 + ")\n"
                + "(X3,Y3) Position: (" + xPos3 + "," + yPos3 + ")\n"
                + "Area: " + area();

        return str;
    }

    public Triangle clone() {
        Triangle copy = new Triangle(xPos, yPos, xPos2, yPos2, xPos3, yPos3);
        return copy;
    }

    public boolean equals(Triangle other) {
        return (other.xPos == this.xPos
                && other.xPos2 == this.xPos2
                && other.xPos3 == this.xPos3
                && other.yPos == this.yPos
                && other.yPos2 == this.yPos2
                && other.yPos3 == this.yPos3);
    }
}
