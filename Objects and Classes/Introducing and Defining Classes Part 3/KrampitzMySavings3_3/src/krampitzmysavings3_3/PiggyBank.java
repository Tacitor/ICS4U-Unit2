/*
 * Lukas Krampiz
 * Sep 25, 2020
 * a PiggyBank object that can add coins to the piggy bank, remove coins, and return the total amount in the bank.
 */
package krampitzmysavings3_3;

/**
 *
 * @author lukra1175
 */
public class PiggyBank {    
    //attributes
    private String name;
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;
    
    private double penVal = 0.01;
    private double nicVal = 0.05;
    private double dimVal = 0.1;
    private double quaVal = 0.25;
    
    //constructors
    public PiggyBank() {
        name = "New PiggyBank";
        pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;
    }
    
    public PiggyBank(String name) {
        this();
        this.name = name;
    }
    
    public PiggyBank(String name, int pennies, int nickels, int dimes, int quarters) {
        this(name);
        this.pennies = pennies;
        this.nickels = nickels;
        this.dimes = dimes;
        this.quarters = quarters;        
    }
    
    //behavior
    public int getPennies() {
        return  pennies;
    }
    public int getNickels() {
        return nickels;
    }
    public int getDimes() {
        return dimes;
    }
    public int getQuarters() {
        return quarters;
    }
    
    public void setPennies(int pennies) {
        this.pennies = pennies;
    }
    public void setNickels(int nickels) {
        this.nickels = nickels;
    }
    public void setDimes(int dimes) {
        this.dimes = dimes;
    }
    public void setQuarters(int quarters) {
        this.quarters = quarters;
    }
    
    //Additional behavior
    public void addPenny() {
        this.pennies++;
    }
    public void addNickel() {
        this.nickels++;
    }
    public void addDime() {
        this.dimes++;
    }
    public void addQuarter() {
        this.quarters++;
    }
    
    public void addPenny(int num) {
        this.pennies += num;
    }
    public void addNickel(int num) {
        this.nickels += num;
    }
    public void addDime(int num) {
        this.dimes += num;
    }
    public void addQuarter(int num) {
        this.quarters += num;
    }
    
    public double getTotal() {
        double total = 0;
        
        //add each value times the amt of coin to the total
        total+=pennies*penVal;
        total+=nickels*nicVal;
        total+=dimes*dimVal;
        total+=quarters*quaVal;
        
        return total;
    }
    
    public String getBreakDown() {
        return "Pennies: " + pennies + 
                "\nNickels: " + nickels + 
                "\nDimes: " + dimes +
                "\nQuarters: " + quarters;
    }
    
    public String toString() {
        return "Name: " + name + "\n" + getBreakDown();
    }
}
