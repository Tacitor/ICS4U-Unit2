/*
 * Brad Cutten
 * Sept 2014
 * Test harness for the SmilingFace class
 */
package smilingfacetestharnessidcp2;

import java.util.Scanner;

public class KrampitzSmilingFaceTestHarnessIDCP2 {   
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double x,y,radius;
        System.out.println("Initial X position: ");
        x = reader.nextDouble();
        System.out.println("Initial Y position: ");
        y = reader.nextDouble();
        SmilingFace face = new SmilingFace(x,y);     //Instantiates an object!   
        face.draw(); //this draw command draws a face
        
        //purpose is to loop infinitly. Let the user draw infinit smileing faces one at a time.
        while(true){
            System.out.println("Initial X position: ");
            x = reader.nextDouble();
            System.out.println("Initial Y position: ");
            y = reader.nextDouble();
            
            face.erase();
            face.move(x, y);
            face.draw(); //this draw command draws a face
        }
    }
}


//The outputs a Smiling face. It does this by drawing three circles, 1 large one as the head and two smaller ones as the eyes. The eye circles are inside of the larger circle and share a y coordinate. They are also eqedistand from the edge of the circle.