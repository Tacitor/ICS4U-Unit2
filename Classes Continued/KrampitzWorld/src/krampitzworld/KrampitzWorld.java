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
        System.out.println(Human.getNumHumans());
        
        HumanInterface h1 = new Wizard();
        HumanInterface h2 = new Wizard("???", 0, 0, 100, 0, 0, 40);
        
        StandardPen pen = new StandardPen(500, 500);
        
        ((Wizard)h1).setMagicka(50);        
        ((Wizard)h1).castSpell();
        
        System.out.println(h1);
        
        h1.draw(pen);
        
        System.out.println(Human.getNumHumans());
    }
    
}
