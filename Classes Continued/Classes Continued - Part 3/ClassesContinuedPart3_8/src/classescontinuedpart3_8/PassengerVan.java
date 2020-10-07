/*
 * Lukas Krampitz
 * Oct 6, 2020
 * Moves alive things (Does not matter if things were previously not alive, van does not care)
 */
package classescontinuedpart3_8;

/**
 *
 * @author Tacitor
 */
public class PassengerVan extends Van {

    public PassengerVan() {
        super();
    }

    public PassengerVan(boolean engStarted, boolean parked, double dist, int capacity, int currentLoad) {
        super(engStarted, parked, dist, capacity, currentLoad);
    }

    @Override
    public boolean load(int newLoad) {
        boolean success = false;

        //check if ther is room
        if (newLoad <= capacity) {
            //check if it safe to load people
            if (!engStarted && parked) {
                currentLoad = newLoad;
                success = true;
            }
        }

        return success;
    }

    @Override
    public boolean unload() {
        boolean success = false;

        //check if it safe to unload people
        if (!engStarted && parked) {
            currentLoad = 0;
            success = true;
        }

        return success;
    }

    @Override
    public String toString() {
        String str = "Car type: Passenger Van"
                + "\nMax Cargo: " + capacity
                + "\nCurrent Cargo: " + currentLoad
                + "\n" + super.toString();

        return str;
    }

    @Override
    public PassengerVan clone() {
        PassengerVan copy = new PassengerVan(engStarted, parked, dist, capacity, currentLoad);

        return copy;
    }

    public boolean equals(PassengerVan other) {
        return other.engStarted == this.engStarted
                && other.parked == this.parked
                && other.dist == this.dist
                && other.capacity == this.capacity
                && other.currentLoad == this.currentLoad;
    }

}
