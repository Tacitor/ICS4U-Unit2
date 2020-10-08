/*
 * Lukas Krampiz
 * Oct 7, 2020
 * A barebones set of requirements for all human
 */
package krampitzworld;

import TurtleGraphics.*;

/**
 *
 * @author lukra1175
 */
public interface HumanInterface {
    //return the name of the human
    public String getName();
    //change the name of the human
    public void setName(String name);
    /**
     * Get the age of the human
     * @return 
     */
    public int getAge();
    //change the age, return false if invalid
    public boolean setAge(int a);
    //return the height
    public double getHeight();
    //change the height, return false if invalid
    public boolean setHeight(double h);
    //return the health
    public int getHealth();
    //change the height, return false if invalid
    public boolean setHealth(int h);
    //draw a humna
    public void draw(Pen p);
    //move a human
    public void move(int x, int y);
    //get the y pos
    public int getYPos();
    //get the x pos
    public int getXPos();
    //heal the user to max health
    public void heal();
    //return string with all atributes
    @Override
    public String toString();
}
