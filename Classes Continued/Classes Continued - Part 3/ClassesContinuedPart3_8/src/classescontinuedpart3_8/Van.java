/*
 * Lukas Krampitz
 * Oct 6, 2020
 * Moves things
 */
package classescontinuedpart3_8;

/**
 *
 * @author Tacitor
 */
abstract public class Van extends AbstractVehicle {

    protected int capacity;
    protected int currentLoad;

    public Van() {
        super();
        capacity = 0;
        currentLoad = 0;
    }

    public Van(boolean engStarted, boolean parked, double dist, int capacity, int currentLoad) {
        super(engStarted, parked, dist);
        this.capacity = capacity;
        this.currentLoad = currentLoad;
    }

    /**
     * Add cargo to the van
     *
     * @param newLoad
     * @return
     */
    abstract public boolean load(int newLoad);

    /**
     * Remove all cargo from the van
     *
     * @return
     */
    abstract public boolean unload();

    /**
     * Find how much cargo is in the Van
     *
     * @return
     */
    public int getCurrentLoad() {
        return currentLoad;
    }

    /**
     * Find how much cargo could be in the van
     *
     * @return
     */
    public int getCapacity() {
        return capacity;
    }
}
