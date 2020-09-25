/*
 * Lukas Krampiz
 * Sep 25, 2020
 * Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and quarters into a piggy bank and then prompts the user to make a selection. The MySavings application should include a PiggyBank object that can add coins to the piggy bank, remove coins, and return the total amount in the bank.
 */
package krampitzmysavings3_3;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lukra1175
 */
public class KrampitzMySavings3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //formats
        DecimalFormat money = new DecimalFormat("$#,##0.00");
        
        // TODO code application logic here
        boolean runLoop = true;
        boolean validInput;
        int input = 0;
        String inputMsg = "\n1. Show total in bank."
                + "\n2. Show breakdown of coins in bank. "
                + "\n3. Add penny."
                + "\n4. Add nickel."
                + "\n5. Add dime."
                + "\n6. Add quarter. "
                + "\n7. Remove specific coins. "
                + "\n8. Take money out of bank. "
                + "\n9. Quit"
                + "\nPlease enter a number:";
        
        PiggyBank bank = new PiggyBank("My PiggyBank");
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Hello and Welcome to your PiggyBank.");
        
        //menu loop
        while (runLoop) {
            //reset the input var
            validInput = false;
            
            //try to get some input
            input = getInput(inputMsg, validInput, reader);
            
            System.out.println("You selected: " + input);
            
            if (input == 9) {
                //exit the program
                runLoop =  false;
            } else if (input == 8) {
                
            } else if (input == 7) {
                
            } else if (input == 6) {
                //ask how many coins should be added
                input = getCoinInput("How many Quarters would you like to add?", validInput, reader);  
                
                //add the coins
                bank.addQuarter(input);
            } else if (input == 5) {
                //ask how many coins should be added
                input = getCoinInput("How many Dimes would you like to add?", validInput, reader);   
                
                //add the coins
                bank.addDime(input);                
            } else if (input == 4) {
                //ask how many coins should be added
                input = getCoinInput("How many Nickels would you like to add?", validInput, reader);  
                
                //add the coins
                bank.addNickel(input);
            } else if (input == 3) {
                //ask how many coins should be added
                input = getCoinInput("How many Pennies would you like to add?", validInput, reader);
                
                //add the coins
                bank.addPenny(input);
            } else if (input == 2) {
                //show the coin breakdown
                System.out.println(bank.getBreakDown());
            } else if (input == 1) {
                //Show the total
                System.out.println("Your total is: " + money.format(bank.getTotal()));
            } else {
                System.out.println("Welp. No idea how you got this message to show!\nThat means it is probably a bug and you should report it.");
            }
        }
        
        
    }
    
    public static int getCoinInput(String msg, boolean validInput, Scanner reader) {
        int input = 0;
        
        while (!validInput) {
                try {
                    System.out.println(msg);
                    input = Integer.parseInt(reader.nextLine());
                    
                    //check if it is within the range of options
                    if(input < 1) {
                        validInput = false;
                        System.out.println("Sorry, " + input + " is not an option, try again.");
                    } else {                    
                        validInput = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e + "\nPlease try again");
                    validInput = false;
                }
            }
        
        return input;
    }
    
    public static int getInput(String msg, boolean validInput, Scanner reader) {
        int input = 0;
        
        while (!validInput) {
                try {
                    System.out.println(msg);
                    input = Integer.parseInt(reader.nextLine());
                    
                    //check if it is within the range of options
                    if(input < 1 || input > 9) {
                        validInput = false;
                        System.out.println("Sorry, " + input + " is not an option, try again.");
                    } else {                    
                        validInput = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e + "\nPlease try again");
                    validInput = false;
                }
            }
        
        return input;
    }
    
}
