/*
 * B Cutten
    Sept 2014
    A test harness for the a variety of user defined shapes.
 */

package shapetestharness;
import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;

public class ShapeTestHarness {

    public static void main(String[] args) {
        //Instantiation!
        Pen p = new StandardPen(500,500);
        //Instantiation!
        Scanner s = new Scanner(System.in);
        
        //Instantiation!
        Shape s1 = new Circle(20,20,20);
        //Instantiation!
        Shape s2 = new Rect(-50,-50,10,20);
        
        s1.draw(p);
        s2.draw(p);
        
        System.out.println(s1); 
        System.out.println(s2);
        
        System.out.println("Press enter to change shapes...");
        s.nextLine();
        
        p.setColor(Color.white);
        s1.draw(p);
        s2.draw(p);
        p.setColor(Color.red);
        
        s1.move(30,30);
        s2.move(-30, -30);
        s1.stretchBy(2);
        s2.stretchBy(2);
        s1.draw(p);
        s2.draw(p);
        
       
    }
    
}

//Output: The program outputs a Turtle Graphics Window showing the shapes created. In the console the ouptut displays the attributes of the shapes. There is also a non functioning prompt to change the shapes.
