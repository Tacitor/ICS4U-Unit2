/**
 * B. Cutten
 * Sept 2014
 * A test harness for the Student class
 */
package krampitzstudenttester;

import java.util.Scanner;

public class KrampitzStudentTester {

    public static void main(String[] args) {
        Student student1;        
        student1 = new Student();       
        
        Student student2 = new Student();
        
        Student student3 = new Student();
        
        Scanner reader = new Scanner(System.in);
        
        String name;
        int score;

        System.out.println("Enter the first student's name: ");
        name = reader.next();
        student1.setName(name);
        //Purpose is to loop three times to ask for the students score on each respective test
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter the student's score on test " + i + " : ");
            score = reader.nextInt();
            student1.setScore(i, score);
        }

        
        System.out.println("Enter the second student's name: ");
        name = reader.next();
        student2.setName(name);
        //Purpose is to loop three times to ask for the students score on each respective test
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter the student's score on test " + i + " : ");
            score = reader.nextInt();
            student2.setScore(i, score);
        }
        
        System.out.println("Enter the third student's name: ");
        name = reader.next();
        student3.setName(name);
        //Purpose is to loop three times to ask for the students score on each respective test
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter the student's score on test " + i + " : ");
            score = reader.nextInt();
            student3.setScore(i, score);
        }
        
        //three students have been made, assign to teacher
        Teacher teach1 = new Teacher("Schaeffer", student1, student2, student3);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
              
        //Purpose is to compare the students highest score and select the greater one
        if (student1.getHighScore() > student2.getHighScore()) {
            name = student1.getName();
            score = student1.getHighScore();
        } else {
            name = student2.getName();
            score = student2.getHighScore();
        }
        System.out.println(name + " has the highest score: " + score);

        //Purpose is to compare the students average and select the greater one
        if (student1.getAverage() > student2.getAverage()) {
            name = student1.getName();
            score = student1.getAverage();
        } else {
            name = student2.getName();
            score = student2.getAverage();
        }
        System.out.println(name + " has the highest average score: " + score);
        
        System.out.println("\n" + teach1);
        

    }
}
//Anaysis over the students scores is being outputted. Two tables are printed, one for each student. Each table contains the name of the student and their scores on each of the three tests. Each table also contains the students average over the three tests. The final two lines of output summerize who had the single highest score and who have the highest average score