/*
 * Lukas Krampiz
 * Sep 25, 2020
 * Teacher class, manages a teacher's name and three Student objects
*/
package krampitzstudenttester;

/**
 *
 * @author lukra1175
 */
public class Teacher {
    //attributes
    private String name;
    private Student st1;
    private Student st2;
    private Student st3;
    
    //constructors
    public Teacher() {
        name = "none";
    }
    
    public Teacher(String name) {
        this.name = name;
    }
    
    public Teacher(String name, Student st1, Student st2, Student st3) {
        this(name);
        this.st1 = st1;
        this.st2 = st2;
        this.st3 = st3;
    }
    
    //behavior
    public Student getSt1() {
        return st1;
    }
    public Student getSt2() {
        return st2;
    }
    public Student getSt3() {
        return st3;
    }
    
    public void setSt1(Student st1) {
        this.st1 = st1;
    }
    public void setSt2(Student st2) {
        this.st2 = st2;
    }
    public void setSt3(Student st3) {
        this.st3 = st3;
    }
    
    public String toString() {
        return "Teacher name: " + name +
                "\nStudent 1:\n" + st1 +
                "\nStudent 2:\n" + st2 +
                "\nStudent 3:\n" + st3;
    }
}
