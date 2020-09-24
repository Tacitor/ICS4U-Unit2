/*
 * Lukas Krampiz
 * Sep 24, 2020
 * Develop a DVD class that contains information about the title, genre, production year, whether or not it is on loan and who the DVD is on loan to.
 */
package introducinganddefiningclasses1_2;

/**
 *
 * @author lukra1175
 */
public class Dvd {
    private String title;
    private String genre;
    private int year;
    private boolean loan;
    private String loanee;
    
    public Dvd(String name, String genre, int year) {
        title = name;
        this.genre = genre;
        this.year = year;
        loan = false;
        loanee = "No one!";
    }
    public Dvd(String name, String genre, int year, boolean loan, String loanee) {
        title = name;
        this.genre = genre;
        this.year = year;
        this.loan = loan;
        this.loanee = loanee;
    }    
    
    public void setTitle(String name) {
        title = name;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void signOut(String loanee) {
        loan = true;
        this.loanee = loanee;
    }
    public void signIn() {
        loan = false;
        loanee = "No one!";
    }

    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public int getYear() {
        return year;
    }
    public boolean isLoaned() {
        return loan;
    }
    public String getLoanee() {
        return loanee;
    }

    public String toString() {
        return "Title: " + title + 
                "\nGenre: " + genre + 
                "\nYear produced: " + year + 
                "\nOn loan? " + loan + 
                "\nLoaned to: " + loanee;
    }

}
