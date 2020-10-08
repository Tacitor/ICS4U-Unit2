/*
 * Lukas Krampiz
 * Oct 7, 2020
 * 
 */
package krampitzworld;

import TurtleGraphics.StandardPen;

/**
 *
 * @author lukra1175
 */
public class KrampitzWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        StandardPen pen = new StandardPen(500, 500);
        
        //Declares 4 Humans.
        Human h1, h2, h3, h4, arch;   
        
        //Instantiates a Knight
        h1 = new Knight("Caldor", 35, 1.8, 100, 50, -50, "Jimmothy");
        
        //Instantiates a Wizard and moves it. 
        h2 = new Wizard("Rasmodius", 118, 1.6, 100, 0, 0, 200);
        h2.move(-100, 0);
        
        // Clones the Knight  and changes its name
        h3 = ((Knight)h1).clone();
        h3.setName("Marombo");    
        
        //Checks if the Knight clone is not equal to the original Knight, and if so: Moves the clone.
        if (!((Knight)h3).equals((Knight)h1)) {
            h3.move(0, 0);
        }
        
        // Clones the Wizard
        h4 = ((Wizard)h2).clone();  
        
        //Checks if the Knight clone is not equal to the original Knight, and if so: Moves the clone.
        if (((Wizard)h4).equals((Wizard)h2)) {
            h4.move(20, 20);
        }
        
        //Instantiated an Human from the third class (Archer)
        arch = new Archer("Ronaldo", 10, 1, 50, 0, 0, 20);
        arch.move(-10, 200);
        ((Archer)arch).shoot(h2);
        ((Archer)arch).shoot(h1);
        
        //have the wizzard fight back
        ((Wizard)h2).castSpell(arch);
        
        //have the archer heal
        arch.heal();
        
        //have the wizzard fight back but first he must level up 
        h2.heal();
        ((Wizard)h2).levelUp();
        ((Wizard)h2).levelUp();
        ((Wizard)h2).castSpell(arch);
        
        //have the knight attack the wizard close by using his ranged limeted attack
        ((Knight)h3).stab(h4);
        
        h1.draw(pen);
        h2.draw(pen);
        h3.draw(pen);
        h4.draw(pen);
        arch.draw(pen);
        
        System.out.println("There are a total of " + Human.getNumHumans() + " humans in the world.");
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(arch);
        
    }
    
}
