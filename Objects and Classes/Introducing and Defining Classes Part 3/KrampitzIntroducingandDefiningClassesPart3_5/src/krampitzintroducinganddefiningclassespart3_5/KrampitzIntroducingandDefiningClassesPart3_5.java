/*
 * Lukas Krampitz
 * Sep 25, 2020
 * Develop a new class called Car. A Car has a color, a size, an X,Y position, and a draw method.  Test-drive your new class in an interface similar to that of the SmilingFaces program.
 */
package krampitzintroducinganddefiningclassespart3_5;

import java.awt.Color;

/**
 *
 * @author Lukas
 */
public class KrampitzIntroducingandDefiningClassesPart3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car car = new Car(100, 100, Color.MAGENTA, 10);
        
        car.draw();
        
        car.move(0, 0);
        
        car.draw();
        car.erase();
    }
    
}
