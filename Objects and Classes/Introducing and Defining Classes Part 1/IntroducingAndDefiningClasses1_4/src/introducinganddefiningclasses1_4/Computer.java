/*
 * Lukas Krampitz
 * Sep 24, 2020
 * 
 */
package introducinganddefiningclasses1_4;

/**
 *
 * @author Lukas
 */
public class Computer {
    //Attributes
    private double coreClock; //in GHz
    private double diskSpace; //in Gb
    private boolean laptop;
    private boolean on;
    private int emailsSent; //a counter
    private String currentProcess;
    
    //Constructors
    public Computer() { //set up an empty computer
        coreClock = 0;
        diskSpace = 0;
        laptop = false;
        on = false;
        emailsSent = 0;
        currentProcess = "none";
    }
    public Computer(double coreClock, double diskSpace, boolean laptop) { //set up the hardware of a computer
        this.coreClock = coreClock;
        this.diskSpace = diskSpace;
        this.laptop = laptop;
        on = false;
        emailsSent = 0;
        currentProcess = "none";
    }
    public Computer(double coreClock, double diskSpace, boolean laptop, boolean on, int emailsSent, String currentProcess) { //set up the hardware of a computer and software
        this.coreClock = coreClock;
        this.diskSpace = diskSpace;
        this.laptop = laptop;
        this.on = on;
        this.emailsSent = emailsSent;
        this.currentProcess = currentProcess;
    }

    //Behavior
    public double getCoreClock() {
        return coreClock;
    }
    public double getDiskSpace() {
        return diskSpace;
    }
    public boolean isLaptop() {
        return  laptop;
    }
    public boolean isOn() {
        return on;
    }
    public int getEmailsSent() {
        return  emailsSent;
    }
    public String getCurrentProcess() {
        return currentProcess;
    }

    public void setCoreClock(double coreClock) {
        this.coreClock = coreClock;
        
    }
    public void setDiskSpace(double diskSpace) {
        this.diskSpace = diskSpace;
    }
    
    public void turnOn() {
        on = true;
    }    
    public void turnOff() {
        on = false;
    }
    
    public void setEmailsSent(int emailsSent) {
        this.emailsSent = emailsSent;
    }
    
    public void setCurrentProcess(String currentProcess) {
        this.currentProcess = currentProcess;
    }

    public void sendEmail() {
        emailsSent++;
    }
    
    public void sendEmail(int num) {
        emailsSent+= num;
    }

    public String toString() {
        return "CPU speed: " + coreClock + 
                "\nDisk capacity: " + diskSpace + 
                "\nLaptop? " + laptop + 
                "\nOn? " + on + 
                "\nEmails sent: " + emailsSent + 
                "\nCurrent process: " + currentProcess;
    }


}
