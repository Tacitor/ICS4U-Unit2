/*
 * Lukas Krampitz
 * Oct 6, 2020
 * What any Vehicle might look like
 */
package classescontinuedpart3_8;

/**
 *
 * @author Tacitor
 */
public interface Vehicle {

    public void StartEng();

    public void StopEng();

    public boolean isStarted();

    public boolean Drive(double dist);

    public double getDist();

    public double getGlobalDist();

    public void putInPark();

    public void putInDrive();

    public boolean isParked();

    public String toString();
}
