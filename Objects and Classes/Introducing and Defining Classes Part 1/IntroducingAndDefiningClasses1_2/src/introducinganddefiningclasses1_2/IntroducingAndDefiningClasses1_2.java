/*
 * Lukas Krampiz
 * Sep 24, 2020
 * Test harnes to Develop a DVD class that contains information about the title, genre, production year, whether or not it is on loan and who the DVD is on loan to.
 */
package introducinganddefiningclasses1_2;

/**
 *
 * @author lukra1175
 */
public class IntroducingAndDefiningClasses1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dvd disc1  = new Dvd("Shrok 1", "Cartoon", 2003);
        
        //System.out.println(disc1);
        
        disc1.setTitle("Shrek 1");
        disc1.setYear(2001);
        disc1.setGenre("Animation");
        
        //System.out.println(disc1);
        
        Dvd disc2 =  new Dvd("Shrek 2", "Perfect", 2005, true, "Obama");
        
        disc2.signIn();
        
        disc2.signOut("Cutten");
        
        disc2.signOut("Dr. Phil");
        
        System.out.println(disc2);
    }
    
}
