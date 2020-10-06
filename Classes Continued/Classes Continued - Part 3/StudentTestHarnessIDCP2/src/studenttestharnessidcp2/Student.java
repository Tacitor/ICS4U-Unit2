/**
 * B Cutten
 * Sept 2014
 * Student class, manages a student's name and three test scores
 */
package studenttestharnessidcp2;

public class Student implements Learner{
    
    private String name;    
    private int test1;      
    private int test2;      
    private int test3;      
    
    public Student(){
        name = "";
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }
    
    public Student(String n){
        this();
        name = n;
    }

    public Student(Student s){
    	name = s.name;
    	test1 = s.test1;
    	test2 = s.test2;
    	test3 = s.test3;
    }
    
    public void setName(String nm){
        name = nm;
    }

    public String getName(){
        return name;
    }

    public void setScore(int i, int score){
        if (i==1){
            test1 = score;
        }else if (i==2){
            test2 = score;
        }else{
            test3 = score;
        }
    }

    public int getScore(int i){
        if (i==1){
            return test1;
        }else if(i==2){
            return test2;
        }else{
            return test3;
        }
    }

    public int getAverage(){
        int average;
        average = (int)Math.round((test1+test2+test3) / 3.0);
        return average;
    }

    public int getHighScore(){
        int highscore;
        highscore = test1;
        if(test2 > highscore){
            highscore = test2;
        }
        if(test3 > highscore){
            highscore = test3;
        }
        return highscore;
    }

    @Override
    public String toString(){
        String str;
        str = "Name:    " + name + "\n" +
                "Test 1:    " + test1 + "\n" +
                "Test 2:    " + test2 + "\n" +
                "Test 3:    " + test3 + "\n" +
                "Average:   " + getAverage();
        return str;
    }
}
