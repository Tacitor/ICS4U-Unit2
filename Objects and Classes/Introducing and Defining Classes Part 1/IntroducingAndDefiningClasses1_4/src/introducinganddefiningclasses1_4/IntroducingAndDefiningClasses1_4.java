/*
 * Lukas Krampitz
 * Sep 24, 2020
 * 
 */
package introducinganddefiningclasses1_4;

/**
 *
 * @author Lukas
 */
public class IntroducingAndDefiningClasses1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computer dell = new Computer();
        
        System.out.println(dell);
        
        dell.setCoreClock(3.8);
        dell.setDiskSpace(2000);
        dell.turnOn();
        dell.sendEmail();
        dell.setCurrentProcess("MS Word");
        dell.sendEmail(22);
        
        System.out.println(dell + "\n");
        
        dell.turnOff();
        
        System.out.println(dell);
        
        Computer lenovo = new Computer(4.1, 1000, true, false, 44, "Net Legumes");
        
        lenovo.turnOn();
        
        System.out.println("\n\n" + lenovo);
    }
    
}
