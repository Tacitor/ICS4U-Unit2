/*
 * Lukas Krampitz
 * Oct 6, 2020
 * Adds some basic functionality to all vehicles
 */
package classescontinuedpart3_8;

/**
 *
 * @author Tacitor
 */
abstract class AbstractVehicle implements Vehicle {

    protected boolean engStarted;
    protected boolean parked;
    protected double dist;
    protected static double globalDistDriven = 0;
    
    /**
     * Primary constructor
     */
    public AbstractVehicle() {
        engStarted = false;
        parked = true;
        dist = 0;
    }
    
    /**
     * Secondary constructor
     * @param engStarted
     * @param parked
     * @param dist 
     */
    public AbstractVehicle(boolean engStarted, boolean parked, double dist) {
        this();
        this.engStarted = engStarted;
        this.parked = parked;
        this.dist = dist;
    }
    
    /**
     * Start the vehicle
     */
    @Override
    public void StartEng() {
        engStarted = true;
    }
    
    /**
     * Stop the vehicle
     */
    @Override
    public void StopEng() {
        engStarted = false;
    }
    
    /**
     * Check if the vehicle is started
     * @return true or false
     */
    @Override
    public boolean isStarted() {
        return engStarted;
    }
    
    /**
     * Drive the vehicle, includes safety checks to make sure the vehicle is allowed to drive
     * @param dist how far the vehicle will move
     * @return If it was successful
     */
    @Override
    public boolean Drive(double dist) {
        //successfully drove?
        boolean succes = false;
        
        //check to see if you can dive
        if (isStarted() && !isParked()) {
            this.dist += dist;
            globalDistDriven += dist;
            succes = true;
        }
        
        return succes;
    }

    @Override
    public double getDist() {
        return dist;
    }

    @Override
    public double getGlobalDist() {
        return globalDistDriven;
    }

    @Override
    public void putInPark() {
        parked = true;
    }

    @Override
    public void putInDrive() {
        parked = false;
    }

    @Override
    public boolean isParked() {
        return parked;
    }

    @Override
    public String toString() {
        String str = "Engine Started? " + engStarted
                + "\nCar parked? " + parked
                + "\nDistance traveled: " + dist;

        return str;
    }

}
