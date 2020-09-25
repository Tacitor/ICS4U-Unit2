/**
 * B Cutten
 * Sept 2014
 * Student class, manages a student's name and three test scores
 */
package studenttestharnessidcp2;

public class Student {
    
    private String name;    
    private int test1;      
    private int test2;      
    private int test3;      
    
    //contructor, purpose is to create a new Student object, this one is blank
    public Student(){
        name = "";
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }
    
    //contructor, purpose is to create a new Student object, this one is mostly blank but has a name
    public Student(String n){
        this();
        name = n;
    }
    
    //contructor, purpose is to create a new Student object, this one just copies the data of an existing student into the new object
    public Student(Student s){
    	name = s.name;
    	test1 = s.test1;
    	test2 = s.test2;
    	test3 = s.test3;
    }
    
    //mutator!
    //Purpose is to change the value of the name
    public void setName(String nm){
        name = nm;
    }

    //accessor!
    //Purpose is to get the value of the name
    public String getName(){
        return name;
    }
    
    //mutator!
    //Purpose is to change the value of the test scores
    public void setScore(int i, int score){
        //Purpose is to set the test score in the correct attribute
        if (i==1){
            test1 = score;
        }else if (i==2){
            test2 = score;
        }else{
            test3 = score;
        }
    }

    //accessor!
    //Purpose is to get the value of the test scores
    public int getScore(int i){
        //Purpose is to find the corerct test score from the desired attribute
        if (i==1){
            return test1;
        }else if(i==2){
            return test2;
        }else{
            return test3;
        }
    }

    //Purpose is to calculate the mean test score of one student
    public int getAverage(){
        int average;
        average = (int)Math.round((test1+test2+test3) / 3.0);
        return average;
    }

    //Purpose is to find the highest of 3 test scores
    public int getHighScore(){
        int highscore;
        highscore = test1;
        //Purpose is to compare test score to see which is the laregst of the three
        if(test2 > highscore){
            highscore = test2;
        }
        if(test3 > highscore){
            highscore = test3;
        }
        return highscore;
    }

    //Purpose is to return a string that prints the attributes of the Student object
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
