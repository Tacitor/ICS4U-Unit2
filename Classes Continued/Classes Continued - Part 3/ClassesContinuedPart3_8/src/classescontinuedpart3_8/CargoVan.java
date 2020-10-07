/*
 * Lukas Krampitz
 * Oct 6, 2020
 * Moves not alive things (Does not matter if things were previously not not alive, van does not care)
 */
package classescontinuedpart3_8;

/**
 *
 * @author Tacitor
 */
public class CargoVan extends Van {

    public CargoVan() {
        super();
    }

    public CargoVan(boolean engStarted, boolean parked, double dist, int capacity, int currentLoad) {
        super(engStarted, parked, dist, capacity, currentLoad);
    }

    @Override
    public boolean load(int newLoad) {
        boolean success = false;

        //check if ther is room
        if (newLoad <= capacity) {
            currentLoad = newLoad;
            success = true;
        }

        return success;
    }

    @Override
    public boolean unload() {
        currentLoad = 0;

        return true;
    }

    @Override
    public String toString() {
        String str = "Car type: Cargo Van"
                + "\nMax Cargo: " + capacity
                + "\nCurrent Cargo: " + currentLoad
                + "\n" + super.toString();

        return str;
    }

    @Override
    public CargoVan clone() {
        CargoVan copy = new CargoVan(engStarted, parked, dist, capacity, currentLoad);

        return copy;
    }

    public boolean equals(CargoVan other) {
        return other.engStarted == this.engStarted
                && other.parked == this.parked
                && other.dist == this.dist
                && other.capacity == this.capacity
                && other.currentLoad == this.currentLoad;
    }

}
