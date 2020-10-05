/*
 * B Cutten
    Sept 2014
    Test harness which tests the classes in the Shape hierarchy
 */

package shapetestharnessccp2;

import TurtleGraphics.*;

public class ShapeTestHarnessCCP2 {

    public static void main(String[] args) {
        Pen p = new StandardPen(500,500); //Instantiation!
        Shape s1 = new Circle(20,20,20);//Instantiation!
        Shape s2 = new Rect(-50,-50,10,20);//Instantiation!
        Shape s3 = new Wheel(-20,-20,20,6);//Instantiation!
        
        s1.draw(p);
        s2.draw(p);
        s3.draw(p);
        
        System.out.println(s1); 
        System.out.println(s2); 
        System.out.println(s3);
    }
    
}
//Output: The program outputs a Turtle Graphics Window showing the shapes created. In the console the ouptut displays the attributes of the shapes.
