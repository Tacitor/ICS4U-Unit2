/*
 * Lukas Krampiz
 * Oct 7, 2020
 * A Human Knight, has a horse
 */
package krampitzworld;

import TurtleGraphics.Pen;
import java.awt.Color;

/**
 *
 * @author lukra1175
 */
public class Knight extends Human {

    //instance vars
    protected String horseName;
    //maybe a var for power levels, if I have time

    //class vars
    protected static Color KNIGHT_COLOUR = Color.RED;

    /**
     * Primary constructor
     */
    public Knight() {
        super();
        horseName = "Random Horse";
    }

    /**
     * Secondary constructor
     *
     * @param name
     * @param age
     * @param height
     * @param health
     * @param xPos
     * @param yPos
     * @param horseName
     */
    public Knight(String name, int age, double height, int health, int xPos, int yPos, String horseName) {
        super(name, age, height, health, xPos, yPos);
        this.horseName = horseName;

    }

    @Override
    public void draw(Pen p) {
        p.setColor(KNIGHT_COLOUR);
        super.draw(p); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Change the value of the name of the Knight's horses 
     * @param name 
     */
    public void setHorseName(String name) {
        horseName = name;
    }

    /**
     * Gives the name of the Knight's horse
     * @return 
     */
    public String getHorseName() {
        return horseName;
    }

    @Override
    public String toString() {
        String str = "\nClass: KNIGHT"
                + "\nHorse's name: " + horseName
                + "\n" + super.toString();

        return str;
    }

    public boolean equals(Knight other) {
        return other.name.equals(name)
                && other.height == this.height
                && other.health == this.health
                && other.xPos == this.xPos
                && other.yPos == this.yPos
                && other.age == this.age
                && other.horseName.equals(this.horseName);
    }
    
    @Override
    public Knight clone() {
        Knight copy = new Knight(name, age, height, health, xPos, yPos, horseName);
        return copy;
    }

}
