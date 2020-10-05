/*
 * B Cutten
 Sept 2014
 A system which...Finds the total amount of money paid to employees
 */
package employeepayrollsystem;

import java.util.Scanner;

public class EmployeePayrollSystem {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);//Instantiation!
        Employee emp;
        String name;
        int type = -1;
        double rate;
        int hours;
        String prompt;
        boolean moreInput = true;
        boolean invalidType;
        boolean invalidRate;
        boolean invalidHours;
        
        //Purpose is to keep looping so long as the user has more input
        while (moreInput) {
            
            System.out.println("Enter employee data");
            System.out.println("  Name(or q to quit):");
            name = reader.next();
            //Purpose is to check if the user is done giving input
            if (name.toLowerCase().equals("q")) {
                moreInput = false;
            } else {
                
                invalidType = true;
                //Purpose is to loop until the user gives some valid input
                while (invalidType) {
                    prompt = " Type (" + Employee.getTypeRules() + ")";
                    System.out.println(prompt);
                    type = reader.nextInt();
                    //Purpose is to check for valid input
                    if (Employee.typeOK(type)) {
                        invalidType=false;
                    }
                }

                //Purpose is to pick a type of employee and therin a pay structure
                if (type == 1) {
                    emp = new FullTimeEmployee();//Instantiation!
                } else {
                    emp = new PartTimeEmployee();//Instantiation!
                }
                emp.setName(name);
                
                invalidRate = true;           
                //Purpose is to loop until the user gives some valid input
                while (invalidRate) {
                    prompt = " Hourly Rate (" + Employee.getRateRules() + "): ";
                    System.out.println(prompt);
                    rate = reader.nextDouble();
                    //Purpose is to check for valid input
                    if (emp.setRate(rate)) {
                        invalidRate = false;
                    }
                }

                invalidHours = true;
                //Purpose is to loop until the user gives some valid input
                while (invalidHours){
                    prompt = " Hours worked (" + Employee.getHoursRules() + "): ";
                    System.out.println(prompt);
                    hours = reader.nextInt();
                    //Purpose is to check for valid input
                    if(emp.setHours(hours)){
                        invalidHours = false;
                    }
                }
            
                
                System.out.println(" The weekly pay for " + emp.getName() + " is " + emp.getPay());
            }

        }
        
        System.out.println("\nTotal pay: " + Employee.getTotalPay());
    }

}
//Output is just the sum of they pay of ALL the employees