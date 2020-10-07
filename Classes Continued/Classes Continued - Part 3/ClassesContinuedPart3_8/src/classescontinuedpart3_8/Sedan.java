/*
 * Lukas Krampitz
 * Oct 6, 2020
 * A fast car
 */
package classescontinuedpart3_8;

/**
 *
 * @author Tacitor
 */
public class Sedan extends AbstractVehicle {

    protected static int speed;

    public Sedan() {
        super();
        speed = 1;
    }

    public Sedan(boolean engStarted, boolean parked, double dist, int speed) {
        super(engStarted, parked, dist);
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        Sedan.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    /**
     * Drive the vehicle, includes safety checks to make sure the vehicle is
     * allowed to drive from the super class. Also calculate the time it took
     * and at what speed
     *
     * @param dist how far the vehicle will move
     * @return If it was successful
     */
    @Override
    public boolean Drive(double dist) {
        boolean succes = super.Drive(dist);

        if (succes) {
            System.out.println("Your Sedan vehicle drove " + dist + " Km in " + dist / speed + " hours at a speed of " + speed + " Km/h.");
        }

        return succes;
    }

    @Override
    public Sedan clone() {
        Sedan copy = new Sedan(engStarted, parked, dist, speed);

        return copy;
    }

    public boolean equals(Sedan other) {
        return other.engStarted == this.engStarted
                && other.parked == this.parked
                && other.dist == this.dist
                && other.speed == this.speed;
    }

    public String toString() {
        String str = "Car type: Sedan"
                + "\nSpeed: " + speed
                + "\n" + super.toString();

        return str;
    }

}
