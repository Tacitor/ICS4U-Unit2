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
    
    //next add a constructor
    public Monitor(int newRez, double newSize, boolean newOn) {
        rez = newRez;
        size = newSize;
        on = newOn;
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
    
    public void setRez(int newRez) {
        rez = newRez;
    }
    
    public void turnOn() {
        on = true;
    }
    
    public void turnOff() {
        on = false;
    }
    
    //add aditional behavior
    public void draw(StandardPen p) {
        
    }
    
    //toString method
    public String toString() {
        return "Resolution: " + rez + 
                "\nSize: " + size + 
                "\nOn? " + on;
    }
}
