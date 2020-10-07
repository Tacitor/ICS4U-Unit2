/*
 * Lukas Krampitz
 * Oct 6, 2020
 * A cool truck to go offroading with
 */
package classescontinuedpart3_8;

/**
 *
 * @author Tacitor
 */
public class Pickup extends AbstractVehicle {

    protected double offRoadDist;
    protected boolean offRoad;

    public Pickup() {
        super();
        offRoadDist = 0;
        offRoad = false;
    }

    public Pickup(boolean engStarted, boolean parked, double dist, double offRoadDist, boolean offRoad) {
        super(engStarted, parked, dist);
        this.offRoadDist = offRoadDist;
        this.offRoad = offRoad;
    }
    
    /**
     * Vroom Vroom, drive the pickup and add to the distance tracker. Also see if you are off roading or not
     * @param dist how to to drive
     * @return boolean
     */
    @Override
    public boolean Drive(double dist) {
        boolean succes = super.Drive(dist);

        if (offRoad) {
            offRoadDist += dist;
        }

        return succes;
    }

    @Override
    public Pickup clone() {
        Pickup copy = new Pickup(engStarted, parked, dist, offRoadDist, offRoad);

        return copy;
    }

    public boolean equals(Pickup other) {
        return other.engStarted == this.engStarted
                && other.parked == this.parked
                && other.dist == this.dist
                && other.offRoadDist == this.offRoadDist
                && other.offRoad == this.offRoad;
    }

    public String toString() {
        String str = "Car type: Pickup"
                + "\nOff Road Distance: " + offRoadDist
                + "\nOff Road mode? " + offRoad
                + "\n" + super.toString();

        return str;
    }

}
