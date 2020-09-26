/*
 * Lukas Krampitz
 * Sep 25, 2020
 * Develop a new class called Car. A Car has a color, a size, an X,Y position, and a draw method.  Test-drive your new class in an interface similar to that of the SmilingFaces program.
 */
package krampitzintroducinganddefiningclassespart3_5;

import java.awt.Color;
import java.util.Scanner;

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
        Scanner reader = new Scanner(System.in);
        int x;
        int y;
        double size;
        Color colour;
        
        System.out.println("Car's X position: ");
        x = reader.nextInt();
        System.out.println("Car's Y position: ");
        y = reader.nextInt();
        System.out.println("Car's size: ");
        size = reader.nextDouble();
        
        colour = getColour(reader);
        
        Car car = new Car(x, y, colour, size);
        car.draw();
        
        while (true) {
            System.out.println("Car's X position: ");
            x = reader.nextInt();
            System.out.println("Car's Y position: ");
            y = reader.nextInt();
            System.out.println("Car's size: ");
            size = reader.nextDouble();
            colour = getColour(reader);
            
            car.setColour(colour);
                        
            //clear the car
            car.erase();
            
            car.setSize(size);
            
            car.move(x, y);
            car.draw();
        }
    }
    
    public static Color getColour(Scanner reader) {
        int input;
        Color colour = Color.RED;
        System.out.println("1. Red"
                + "\n2. Blue"
                + "\n3. Green"
                + "\n4. Yellow"
                + "\n5. Black"
                + "\n6. Magenta"
                + "\n7. Orange"
                + "\nSelect a colour:");
        
        input = reader.nextInt();
        
        if (input == 1) {
            colour = Color.RED;
        } else if (input == 2) {
            colour = Color.BLUE;
        } else if (input == 3) {
            colour = Color.GREEN;
        } else if (input == 4) {
            colour = Color.YELLOW;
        } else if (input == 5) {
            colour = Color.BLACK;
        } else if (input == 6) {
            colour = Color.MAGENTA;
        } else if (input == 7) {
            colour = Color.ORANGE;
        }
        
        return colour;
    }
    
}
