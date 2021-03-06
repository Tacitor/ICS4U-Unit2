/*
 * B Cutten
    Sept 2014
    Test harness which tests the classes in the Shape hierarchy
 */

package shapetestharnessccp2_6;

import TurtleGraphics.*;
import java.awt.Color;

public class ShapeTestHarnessCCP2 {

    public static void main(String[] args) {
        Pen p = new StandardPen(500,500);
        Shape s1 = new Circle(20,20,20);
        Shape s2 = new Rect(-50,-50,10,20);
        Shape s3 = new Wheel(-20,-20,20,6);
        
        Shape s2VerTwo = new Rect(-50,-50,10,20);
        
        Shape s1VerTwo = ((Circle)s1).clone();
        
        s1.draw(p);
        s2.draw(p);
        s3.draw(p);
        p.setColor(Color.red);
        s1VerTwo.draw(p);
        
        System.out.println(s1); 
        System.out.println(s2); 
        System.out.println(s3);
        
        System.out.println(((Rect)s2).equals((Rect)s2VerTwo));
        
        System.out.println(s1VerTwo);
        
        System.out.println(s2.getPerim());
        System.out.println(s3.getPerim());
        System.out.println(s1.getPerim());
    }
    
}
