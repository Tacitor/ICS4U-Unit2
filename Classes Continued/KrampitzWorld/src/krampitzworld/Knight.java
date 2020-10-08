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
    //nope turns out Knights don't really make sense to have power levels

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
        //draw a cross in the center
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(xPos, yPos);
        //draw top part of shield
        p.up();
        p.move(xPos + DRAW_SIZE*3, yPos + DRAW_SIZE/2);
        p.down();
        p.move(xPos, yPos + DRAW_SIZE*2.5);
        p.move(xPos - DRAW_SIZE*3, yPos + DRAW_SIZE/2);
        //draw bottom part of shield
        p.move(xPos - DRAW_SIZE*2, yPos - DRAW_SIZE*2);
        p.move(xPos - DRAW_SIZE, yPos - DRAW_SIZE*3.5);
        p.move(xPos, yPos - DRAW_SIZE*4);
        p.move(xPos + DRAW_SIZE, yPos - DRAW_SIZE*3.5);
        p.move(xPos + DRAW_SIZE*2, yPos - DRAW_SIZE*2);
        p.move(xPos + DRAW_SIZE*3, yPos + DRAW_SIZE/2);
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
    
    /**
     * A range limited attack used by knights because they sadly don't know magic :(
     * @param target 
     */
    public void stab(HumanInterface target) {
        //check if there is another human close enough to stab
        if (Math.sqrt(((target.getXPos() - xPos) * (target.getXPos()- xPos) + (target.getYPos()-yPos) * (target.getYPos()-yPos))) <= 30) {
            
            //damage the target
            target.setHealth(target.getHealth() - Human.HIGH_HEALTH / 4);
            
            System.out.println(name + " stabed " + target.getName() + " real good and imflicted " + Human.HIGH_HEALTH / 4 + " damage");
        }
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
