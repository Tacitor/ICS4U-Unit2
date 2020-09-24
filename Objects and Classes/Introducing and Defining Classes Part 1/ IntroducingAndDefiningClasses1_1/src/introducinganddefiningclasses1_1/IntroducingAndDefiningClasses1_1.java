/*
 * Lukas Krampiz
 * Sep 24, 2020
 * Develop a design for a new class called BaseballPlayer
 */
package introducinganddefiningclasses1_1;

/**
 *
 * @author lukra1175
 */
public class IntroducingAndDefiningClasses1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BaseballPlayer baller1 = new BaseballPlayer("Jimmy");
        
        baller1.setName("Carl");
        baller1.setTeamName("The Purple Socks");
        
        System.out.println(baller1);
    }
    
}
