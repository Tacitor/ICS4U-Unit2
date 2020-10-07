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
public class Human implements HumanInterface{
    
    //instance vars
    protected String name;
    protected int age;
    protected double height;
    protected int health;
    protected int xPos;
    protected int yPos;
    
    //class vars
    static final double LOW_HEIGHT = 0.5;
    static final double HIGH_HEIGHT = 3;
    static final int LOW_AGE = 0;
    static final int HIGH_AGE = 120;
    static final int LOW_HEALTH = 0;
    static final int HIGH_HEALTH = 100;
    static int NUM_HUMANS = 0;
    
    public Human() {
        name = "???";
        age = 0;
        height = 0;
        health = 100;
        xPos = 0;
        yPos = 0;
        NUM_HUMANS++;
    }
    
    public Human(String name, int age, double height, int health, int xPos, int yPos) {
        this();
        this.name = name;
        this.age = age;
        this.height = height;
        this.health = health;
        this.xPos = xPos;
        this.yPos = yPos;
        NUM_HUMANS++;
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setAge(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setHeight(double h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHeath() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setHealth(int h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Pen p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getYPos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getXPos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
