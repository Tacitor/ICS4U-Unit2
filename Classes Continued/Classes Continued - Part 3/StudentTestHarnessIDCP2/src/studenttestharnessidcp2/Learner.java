/*
 * Lukas Krampiz
 * Oct 6, 2020
 * An interface to base a student off of
 */
package studenttestharnessidcp2;

/**
 *
 * @author lukra1175
 */
public interface Learner {
    public void setName(String nm);
    public String getName();
    public void setScore(int i, int score);
    public int getScore(int i);
    public int getAverage();
    public int getHighScore();
    public String toString();
}
