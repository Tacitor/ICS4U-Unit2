/*
 * Lukas Krampitz
 * Sep 23, 2020
 * 
 */
package drawsquareloop;

import TurtleGraphics.*;

/**
 *
 * @author Lukas
 */
public class DrawSquareLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaring and instantiating a StandardPen type object
        StandardPen pen = new StandardPen(500,500);
        
        //lift the pen, move it to the squares
        //top left corner, then lower it
        pen.up();
        pen.move(25); //pixels
        pen.turn(90); //counter clock wise
        pen.move(25);
        pen.down();
        
        //Draw the squre
        for (int i = 0; i < 4; i++) {
            pen.turn(90);
            pen.move(50);
        }
    }
    
}
