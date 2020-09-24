/*
 * Lukas Krampitz
 * Sep 24, 2020
 * Test harness to Develop a class for a fictional beast called a Jabberwocky. The Jabberwocky can be many different colors, it has a gender, and it is either hungry or it is not. Be sure to include a method to feed the Jabberwocky because a full Jabberwocky will not attack a Knight.
 */
package introducinganddefiningclasses1_3;

/**
 *
 * @author Lukas
 */
public class IntroducingAndDefiningClasses1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jabberwocky monst1 = new Jabberwocky();
        
        //System.out.println(monst1);
        //System.out.println("");
        
        monst1.starve();
        monst1.setColour("Purple");
        
        //System.out.println(monst1);
        
        Jabberwocky monster = new Jabberwocky("Green", "Female", true);
        monster.starve();
        monster.feed();
        System.out.println(monster);
    }
    
}
