/*
 * Lukas Krampiz
 * Sep 24, 2020
 * Monitor Class
 */
package monitorprogramexample;

import TurtleGraphics.*;

/**
 *
 * @author lukra1175
 */
public class Monitor {
    //first define attribues
    private int rez;
    private double size; //inches
    private boolean on;
    
    public Monitor(int rez, double size) {
        this.rez = rez;
        this.size = size;
        on = false;
    }
    
    //next add a constructor
    public Monitor(int rez, double size, boolean on) {
        this(rez, size); //constructor chainning
        this.on = on;
    }
    
    //next add egtters and setters
    public int getRez() {
        return rez;
    }
    
    public double getSize() {
        return size;
    }
    
    public boolean isOn() {
        return on;
    }
    
    public void setRez(int rez) {
        this.rez = rez;
    }
    
    public void turnOn() {
        on = true;
    }
    
    public void turnOff() {
        on = false;
    }
    
    //add aditional behavior
    public void draw(StandardPen p) {
        double sideLength = size * 10;
        p.up();
        p.move(0,0);
        p.move(-sideLength, -sideLength);
        p.down();
        p.move(-sideLength, sideLength);
        p.move(sideLength, sideLength);
        p.move(sideLength, -sideLength);
        p.move(-sideLength, -sideLength);
    }
    
    //toString method
    public String toString() {
        return "Resolution: " + rez + 
                "\nSize: " + size + 
                "\nOn? " + on;
    }
}
