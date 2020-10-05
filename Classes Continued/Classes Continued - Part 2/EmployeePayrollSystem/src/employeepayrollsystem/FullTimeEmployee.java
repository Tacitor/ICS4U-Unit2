/*
 * B Cutten
 * Sept 2014
 * Represents...An employee that works full time. An extention of the abstract Employee class. Checks for working overtime
 * 
 */
package employeepayrollsystem;

public class FullTimeEmployee extends Employee{
    
    //Constructor!
    //purpose is to call the constructor from the super class
    public FullTimeEmployee(){
        super(); 
    }
    
    //Purpose is to calculate how much money an employee earned
    public double getPay(){
        double pay;
        
        //Purpose is to decide the pay structure. Reg or overtime
        if(hours <=40){
            pay = rate * hours;
        }else{ 
            pay = rate * 40 + (rate * 2 * (hours - 40));
        }
        totalPay = totalPay + pay;
        return pay;
    }
}
