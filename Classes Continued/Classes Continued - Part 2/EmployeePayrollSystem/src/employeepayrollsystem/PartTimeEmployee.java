/*
 * B Cutten
 * Sept 2014
 * Represents...A Part time employee that never have overtime. Also extends the abstract Employee class.
 */
package employeepayrollsystem;

public class PartTimeEmployee extends Employee{
    
    //Constructor!
    //purpose is to call the constructor from the super class
    public PartTimeEmployee(){
        super();
    }
    
    //Purpose is to calculate how much money an employee earned for their hours
    public double getPay(){
        double pay;        
        pay = rate * hours;
        totalPay = totalPay + pay;
        return pay;
    }
}
