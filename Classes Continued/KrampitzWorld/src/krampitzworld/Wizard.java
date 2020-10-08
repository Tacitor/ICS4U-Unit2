/*
 * Lukas Krampiz
 * Oct 7, 2020
 * A Human Wizard, very cool
 */
package krampitzworld;

import TurtleGraphics.Pen;
import java.awt.Color;

/**
 *
 * @author lukra1175
 */
public class Wizard extends Human {

    //instance vars
    protected int magicka;
    //maybe a var for power levels, if I have time

    //class vars
    protected static int LOW_MAGICKA = 0;
    protected static int HIGH_MAGICKA = 200;
    protected static Color WIZARD_COLOUR = Color.BLUE;
    protected static int SPELL_COST = 10;

    /**
     * Primary constructor
     */
    public Wizard() {
        super();
        magicka = 0;
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
     * @param magicka
     */
    public Wizard(String name, int age, double height, int health, int xPos, int yPos, int magicka) {
        super(name, age, height, health, xPos, yPos);
        this.magicka = magicka;

    }

    @Override
    public void draw(Pen p) {
        p.setColor(WIZARD_COLOUR);
        //draw a dot in the center
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(xPos, yPos);
        //draw hat base
        p.up();
        p.move(xPos + DRAW_SIZE*3, yPos + DRAW_SIZE/2);
        p.down();
        p.move(xPos + DRAW_SIZE*3, yPos - DRAW_SIZE/2);
        p.move(xPos - DRAW_SIZE*3, yPos - DRAW_SIZE/2);
        p.move(xPos - DRAW_SIZE*3, yPos + DRAW_SIZE/2);
        p.move(xPos + DRAW_SIZE*3, yPos + DRAW_SIZE/2);
        //draw hat point
        p.up();
        p.move(xPos + DRAW_SIZE*2, yPos + DRAW_SIZE/2);
        p.down();
        p.move(xPos, yPos + DRAW_SIZE*6);
        p.move(xPos - DRAW_SIZE*2, yPos + DRAW_SIZE/2);
    }
    
    /**
     * Casts a very cool spell from a Wizard
     */
    public void castSpell() {
        //check if there is enough magicka
        if (magicka > SPELL_COST) {
            magicka -= SPELL_COST;
            System.out.println(name + " cast an epic spell for " + SPELL_COST + " magicka");
        }
    }
    
    /**
     * Set the Magicka level of a Wizard, return false if invalid
     * @param m
     * @return 
     */
    public boolean setMagicka(int m) {
        boolean sucess = false;

        //check if the new magicka level is valid
        if (m >= LOW_MAGICKA && m <= HIGH_MAGICKA) {
            magicka = m;
            sucess = true;
        }

        return sucess;
    }
    
    /**
     * Get the current magicka level
     * @return 
     */
    public int getMagicka() {
        return magicka;
    }
    
    /**
     * Provides info on what a valid magicka level is
     * @return 
     */
    public static String getMagickaRules() {
        return showRule(LOW_MAGICKA, HIGH_MAGICKA);
    }

    @Override
    public String toString() {
        String str = "\nClass: WIZARD"
                + "\nMagicka: " + magicka
                + "\n" + super.toString();

        return str;
    }

    public boolean equals(Wizard other) {
        return other.name.equals(name)
                && other.height == this.height
                && other.health == this.health
                && other.xPos == this.xPos
                && other.yPos == this.yPos
                && other.age == this.age
                && other.magicka == this.magicka;
    }
    
    @Override
    public Wizard clone() {
        Wizard copy = new Wizard(name, age, height, health, xPos, yPos, magicka);
        return copy;
    }

}
