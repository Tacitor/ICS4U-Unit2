/*
 * Lukas Krampitz
 * Oct 6, 2020
 * Implement the hierarchy of artifacts you designed for #2. Include an interface, an abstract class, and a test harness in your project. Also include equals and clone methods (and test them!). 
 */
package classescontinuedpart3_8;

/**
 *
 * @author Tacitor
 */
public class CarTestHarness {

    /**
     * Test my cool new Classes
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle car1 = new Sedan();
        Vehicle car2 = new Pickup(true, true, 0, 0, true);
        Vehicle car3 = new CargoVan(true, false, 0, 50, 0);
        Vehicle car4 = new PassengerVan(true, false, 0, 50, 0);

        Vehicle car5 = ((PassengerVan) car4).clone();

        System.out.println(((PassengerVan) car4).equals((PassengerVan) car5));

        car1.putInDrive();
        car1.StartEng();
        ((Sedan) car1).setSpeed(50);
        car1.Drive(100);

        car2.putInDrive();
        car2.Drive(50);

        car3.Drive(61);
        ((CargoVan) car3).load(49);

        car4.Drive(61);
        car4.StopEng();
        car4.putInPark();
        ((PassengerVan) car4).load(49);

        System.out.println(car1);
        System.out.println("\n" + car2);
        System.out.println("\n" + car3);
        System.out.println("\n" + car4);

        System.out.println(AbstractVehicle.globalDistDriven);

        System.out.println(((PassengerVan) car4).equals((PassengerVan) car5));
    }

}
