/*
 * Lukas Krampitz
 * Sep 24, 2020
 * Develop a class for a fictional beast called a Jabberwocky. The Jabberwocky can be many different colors, it has a gender, and it is either hungry or it is not. Be sure to include a method to feed the Jabberwocky because a full Jabberwocky will not attack a Knight.
 */
package introducinganddefiningclasses1_3;

/**
 *
 * @author Lukas
 */
public class Jabberwocky {
    //Attributes
    private String colour;
    private String gender;
    private boolean hungry;
    
    //Constructor
    public Jabberwocky() {
        colour = "none";
        gender = "none";
        hungry = false;
    }
    public Jabberwocky(String colour, String gender, boolean hungry) {
        this.colour = colour;
        this.gender = gender;
        this.hungry = hungry;
    }
    
    //Behavior
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public String getGender() {
        return  gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public boolean isHungry() {
        return hungry;
    }
    public void feed() {
        hungry = false;
    }
    public void starve() {
        hungry = true;
    }
    
    public String toString() {
        return "Colour: " + colour + 
                "\nGender: " + gender + 
                "\nHungry? " + hungry;
    }

}
