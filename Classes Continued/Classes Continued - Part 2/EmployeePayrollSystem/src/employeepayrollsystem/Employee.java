/*
 * Brad Cutten
 * Sept 2014
 * Abstract class which represents...Any employee
 */
package employeepayrollsystem;

abstract public class Employee {    
    
    protected String name;
    protected double rate;
    protected int hours;
    
    //Constructor!
    //purpose is to create a new blank employee
    public Employee(){
        name = "";
        rate = 0;
        hours = 0;
    }
    
    //Mutator!
    public boolean setName(String nm){
        //Purpose is to check if input is valid
        if (nm.equals("")){
            return false;
        }else{
            name = nm;
            return true;
        }
    }
    
    //Mutator!
    public boolean setRate(double rt){
        //Purpose is to check if input is valid
        if (!(LOW_RATE <= rt && rt <=HIGH_RATE)){
            return false;
        }else{
            rate = rt;
            return true;
        }
    }
    
    //Mutator!
    public boolean setHours(int hrs){
        //Purpose is to check if input is valid
        if (!(LOW_HOURS <= hrs && hrs <=HIGH_HOURS)){
            return false;
        }else{
            hours = hrs;
            return true;
        }
    }
    
    //Accessor!
    public String getName(){
        return name;
    }
    
    //where is the definition of this method?
    //      In the two sub classes
    //Purpose is to calculate how much money an employee earned
    abstract public double getPay();
    

    public static double LOW_RATE = 6.75;
    public static double HIGH_RATE= 30.50;
    public static int LOW_HOURS = 1;
    public static int HIGH_HOURS= 60;
    
    protected static double totalPay = 0;
    
    //Accessor!
    public static String getNameRules(){
        return "nonblank";
    }
    
    //Accessor!
    public static String getTypeRules(){
        return "1 or 2";
    }
    
    //Accessor!
    public static String getRateRules(){
        return getRule(LOW_RATE,HIGH_RATE);
    }
    
    //Accessor!
    public static String getHoursRules(){
        return getRule(LOW_HOURS,HIGH_HOURS);
    }
    
    //Purpose is to check if input is valid
    public static boolean typeOK (int type){
        return type == 1 || type == 2;
    }
    
    //Accessor!
    public static double getTotalPay(){
        
        return totalPay;
    }
    
    //Purpose is to Display a valid range of input to the user
    public static String getRule(double low, double high){        
        return "between " + low + " and  " + high + ", inclusive" ;
    }
     
    
}
