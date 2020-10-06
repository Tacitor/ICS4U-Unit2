/*
 * B Cutten
    Sept 2014
    Test harness which tests the classes in the Shape hierarchy
 */

package shapetestharnessccp2_7;

import TurtleGraphics.*;
import java.awt.Color;

public class ShapeTestHarnessCCP2 {

    public static void main(String[] args) {
        Pen p = new StandardPen(500,500);
        Shape s1 = new Circle(20,20,20);
        Shape s2 = new Rect(-50,-50,10,20);
        Shape s3 = new Wheel(-20,-20,20,6);
        Shape s4 = new Triangle(0,0,30,-30,-30,-30);
        
        Shape s2VerTwo = new Rect(-50,-50,10,20);
        
        Shape s1VerTwo = ((Circle)s1).clone();
        
        Shape Tri2 = ((Triangle)s4).clone();
        
        //move the triangle off the other shapes
        s4.move(50, -10);
        
        s4.stretchBy(2);
        
        s4.move(0, 120);
        
        s1.draw(p);
        s2.draw(p);
        s3.draw(p);
        s4.draw(p);
        //p.setColor(Color.red);
        //s1VerTwo.draw(p);
        
        System.out.println(s1); 
        System.out.println(s2); 
        System.out.println(s3);
        System.out.println(s4);
        
        //System.out.println(((Rect)s2).equals((Rect)s2VerTwo));
        
        //System.out.println(s1VerTwo);
        
        //System.out.println(s2.getPerim());
        //System.out.println(s3.getPerim());
        //System.out.println(s1.getPerim());
        
        //System.out.println(((Triangle)s4).equals((Triangle)Tri2));
    }
    
}
