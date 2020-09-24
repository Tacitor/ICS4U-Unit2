/*
 * Lukas Krampiz
 * Sep 24, 2020
 * A demo for classes and objects
 */
package monitorprogramexample;

/**
 *
 * @author lukra1175
 */
public class MonitorProgramExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monitor m1; //variable decloration
        
        m1 = new Monitor(2400, 24, false); //instantiation
        
        Monitor m2 = new Monitor(4000, 40, true);
        
        m1.turnOn();
        
        System.out.println(m1.toString());
    }
    
}
