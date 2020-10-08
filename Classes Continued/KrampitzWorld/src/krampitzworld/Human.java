/*
 * Lukas Krampiz
 * Oct 7, 2020
 * A basic implementation of a human
 */
package krampitzworld;

import TurtleGraphics.Pen;

/**
 *
 * @author lukra1175
 */
abstract public class Human implements HumanInterface {

    //instance vars
    protected String name;
    protected int age;
    protected double height;
    protected int health;
    protected int xPos;
    protected int yPos;

    //class vars
    static final double LOW_HEIGHT = 0.1; //in meters
    static final double HIGH_HEIGHT = 3;
    static final int LOW_AGE = 0;
    static final int HIGH_AGE = 120;
    static final int LOW_HEALTH = 0;
    static final int HIGH_HEALTH = 100;
    static int NUM_HUMANS = 0;

    static final int DRAW_SIZE = 5;

    /**
     * Primary constructor, no data
     */
    public Human() {
        name = "???";
        age = 0;
        height = 0;
        health = 100;
        xPos = 0;
        yPos = 0;
        NUM_HUMANS++;
    }

    /**
     * Secondary constructor, given data
     *
     * @param name
     * @param age
     * @param height
     * @param health
     * @param xPos
     * @param yPos
     */
    public Human(String name, int age, double height, int health, int xPos, int yPos) {
        this();
        this.name = name;
        this.age = age;
        this.height = height;
        this.health = health;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public int getYPos() {
        return yPos;
    }

    @Override
    public int getXPos() {
        return xPos;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public boolean setAge(int a) {
        boolean sucess = false;

        //check if the new age is valid
        if (a >= LOW_AGE && a <= HIGH_AGE) {
            age = a;
            sucess = true;
        }

        return sucess;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public boolean setHeight(double h) {
        boolean sucess = false;

        //check if the new height is valid
        if (h >= LOW_HEIGHT && h <= HIGH_HEIGHT) {
            height = h;
            sucess = true;
        }

        return sucess;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public boolean setHealth(int h) {
        boolean sucess = false;

        //check if the new health is valid
        if (h >= LOW_HEALTH && h <= HIGH_HEALTH) {
            health = h;
            sucess = true;
        }

        return sucess;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos + DRAW_SIZE, yPos + DRAW_SIZE);
        p.down();
        p.move(xPos + DRAW_SIZE, yPos - DRAW_SIZE);
        p.move(xPos - DRAW_SIZE, yPos - DRAW_SIZE);
        p.move(xPos - DRAW_SIZE, yPos + DRAW_SIZE);
        p.move(xPos + DRAW_SIZE, yPos + DRAW_SIZE);
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(xPos, yPos);
    }

    @Override
    public void move(int x, int y) {
        xPos = x;
        yPos = y;
    }

    @Override
    public String toString() {
        String str = "Name: " + name
                + "\nAge: " + age
                + "\nHeight: " + height
                + "\nHealth: " + health
                + "\nPosition: (" + xPos + ", " + yPos + ")";

        return str;
    }
    
    /**
     * Get the number of humans instances in the world
     * @return 
     */
    public static int getNumHumans() {
        return NUM_HUMANS;
    }
    
    /**
     * Set a value for the number of humans in existence
     * @param num_humans 
     */
    public static void setNumHumans(int num_humans) {
        NUM_HUMANS = num_humans;
    }

    /**
     * Provides info on what a valid age is
     *
     * @return
     */
    public static String getAgeRules() {
        return showRule(LOW_AGE, HIGH_AGE);
    }

    /**
     * Provides info on what a valid height is
     *
     * @return
     */
    public static String getHeightRules() {
        return showRule(LOW_HEIGHT, LOW_HEIGHT);
    }

    /**
     * Provides info on what a valid health is
     *
     * @return
     */
    public static String getHealthRules() {
        return showRule(LOW_HEALTH, LOW_HEALTH);
    }

    /**
     * Provides info on valid information ranges
     *
     * @param num1
     * @param num2
     * @return A string with the range in plain English
     */
    protected static String showRule(double num1, double num2) {
        String range = "A number between: " + num1 + " and: " + num2 + ", inclusive.";

        return range;
    }
    
    /**
     * Heal the user to max health
     */
    @Override
    public void heal() {
        //check if they are low enough for healing 20% min
        if (health <= ((HIGH_HEALTH / 100) * 20)) {
            health = HIGH_HEALTH;
        }
    }

}
