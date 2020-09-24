/*
 * Lukas Krampiz
 * Sep 24, 2020
 * A BaseballPlayer
 */
package introducinganddefiningclasses1_1;

/**
 *
 * @author lukra1175
 */
public class BaseballPlayer {
    //attibutes
    private String name;
    private String teamName;
    private int homeRuns;
    private double battingAv;
    
    //contructors
    public BaseballPlayer(String newName) {
        name = newName;
        teamName = "Solo!";
        homeRuns = 0;
        battingAv = 1;
    }
    
    public BaseballPlayer(String newName, String newTeamName) {
        name = newName;
        teamName = newTeamName;
        homeRuns = 0;
        battingAv = 1;
    }
    
    //getters
    public String getName() {
        return name;
    }
    public String getTeamName() {
        return teamName;
    }
    public int gethomeRuns() {
        return homeRuns;
    }
    public double getBattingAv() {
        return battingAv;
    }
    
    //setters
    public void setName(String newName) {
        name = newName;
    }
    public void setTeamName(String newTeamName) {
        teamName = newTeamName;
    }
    
    public String toString() {
        return "Name: " + name + 
                "\nTeam Name: " + teamName + 
                "\nHome Runs: " + homeRuns + 
                "\nBatting Average: " + battingAv;
    }

}
