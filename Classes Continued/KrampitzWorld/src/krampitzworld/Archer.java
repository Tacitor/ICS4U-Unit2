/*
 * Lukas Krampiz
 * Oct 7, 2020
 * A Human Archer. Shots are fatal. *pew* *pew*
 */
package krampitzworld;

import TurtleGraphics.Pen;
import java.awt.Color;

/**
 *
 * @author lukra1175
 */
public class Archer extends Human {

    //instance vars
    protected int arrows;
    //maybe a var for power levels, if I have time

    //class vars
    protected static int LOW_ARROW = 0;
    protected static int HIGH_ARROW = 30;
    protected static Color ARCHER_COLOUR = Color.MAGENTA;
    protected static int SHOOT_COST = 1;
    protected static int SHOOT_DAM_MULTI = 10;

    /**
     * Primary constructor
     */
    public Archer() {
        super();
        arrows = 0;
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
     * @param arrows
     */
    public Archer(String name, int age, double height, int health, int xPos, int yPos, int arrows) {
        super(name, age, height, health, xPos, yPos);
        this.arrows = arrows;

    }

    @Override
    public void draw(Pen p) {
        p.setColor(ARCHER_COLOUR);
        //draw the center line
        p.up();
        p.move(xPos - DRAW_SIZE*3, yPos);
        p.down();
        p.move(xPos + DRAW_SIZE*3, yPos);
        //draw arrow tip
        p.move(xPos + DRAW_SIZE*3, yPos + DRAW_SIZE);
        p.move(xPos + DRAW_SIZE*4, yPos);
        p.move(xPos + DRAW_SIZE*3, yPos - DRAW_SIZE);
        p.move(xPos + DRAW_SIZE*3, yPos);
        //draw feathers
        //back feather
        p.up();
        p.move(xPos - DRAW_SIZE*3, yPos);
        p.down();
        p.move(xPos - DRAW_SIZE*4, yPos + DRAW_SIZE);
        p.up();
        p.move(xPos - DRAW_SIZE*3, yPos);
        p.down();
        p.move(xPos - DRAW_SIZE*4, yPos - DRAW_SIZE);
        //front featehr
        p.up();
        p.move(xPos - DRAW_SIZE*2, yPos);
        p.down();
        p.move(xPos - DRAW_SIZE*3, yPos + DRAW_SIZE);
        p.up();
        p.move(xPos - DRAW_SIZE*2, yPos);
        p.down();
        p.move(xPos - DRAW_SIZE*3, yPos - DRAW_SIZE);
    }
    
    /**
     * Shoot an arrows, watch out this hurts the user
     * @param target
     */
    public void shoot(HumanInterface target) {
        //check if there are enough arrows
        if (arrows > SHOOT_COST) {
            arrows -= SHOOT_COST;
            
            //inflict self harm from shooting
            health-= SHOOT_COST * SHOOT_DAM_MULTI;
            
            //damage the target
            target.setHealth(target.getHealth() - SHOOT_DAM_MULTI * 5);
            
            System.out.println(name + " shot " + SHOOT_COST + " arrows at " + target.getName() + " and took " + SHOOT_COST * SHOOT_DAM_MULTI + " self-damage");
        }
    }
    
    /**
     * Set the level of arrows an Archer has, return false if invalid
     * @param a
     * @return 
     */
    public boolean setArrows(int a) {
        boolean sucess = false;

        //check if the new arrow level is valid
        if (a >= LOW_ARROW && a <= HIGH_ARROW) {
            arrows = a;
            sucess = true;
        }

        return sucess;
    }
    
    /**
     * Get the current arrow level
     * @return 
     */
    public int getArrows() {
        return arrows;
    }
    
    /**
     * Provides info on what a valid arrow level is
     * @return 
     */
    public static String getArrow() {
        return showRule(LOW_ARROW, HIGH_ARROW);
    }

    @Override
    public String toString() {
        String str = "\nClass: ARCHER"
                + "\nArrows: " + arrows
                + "\n" + super.toString();

        return str;
    }

    public boolean equals(Archer other) {
        return other.name.equals(name)
                && other.height == this.height
                && other.health == this.health
                && other.xPos == this.xPos
                && other.yPos == this.yPos
                && other.age == this.age
                && other.arrows == this.arrows;
    }
    
    @Override
    public Archer clone() {
        Archer copy = new Archer(name, age, height, health, xPos, yPos, arrows);
        return copy;
    }

}
