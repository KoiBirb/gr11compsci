/*
    * Record.java
    * Leo Bogaert
    * 2024/05/08
    * This class creates a Record object containing a title, artist, and year.
    * It can print the record information and compare two records.
 */

public class Record {

    private final String TITLE, ARTIST;
    private final int YEAR;

    /**
     * Creates a new Record with the given title, artist, and year.
     * @param title String value of the record title
     * @param artist String value of the record artist
     * @param year int value of the record release year
     */
    public Record (String title, String artist, int year){
        this.TITLE = title;
        this.ARTIST = artist;
        this.YEAR = year;
    }

    /**
     * Returns the title, artist, and year of the record.
     * @return String value of the record title, artist, and year
     */
    public String toString(){
        return TITLE + " by " + ARTIST + " - released in " + YEAR;
    }

    /**
     * Compares the title, artist, and year of two records to determine if they are the same or different.
     * @param r Record object to compare to
     */
    public boolean equals (Record r){
        if (r == null) {
            System.out.println("The comparison record is null.");
            return false;
        } else {
            return TITLE.trim().equalsIgnoreCase(r.getTITLE().trim())
                    && ARTIST.trim().equalsIgnoreCase(r.getARTIST().trim()) && YEAR == r.getYEAR();
        }
    }

    /**
     * Returns the title of the record.
     * @return String value of the record title
     */
    public String getTITLE() {
        return TITLE;
    }

    /**
     * Returns the artist of the record.
     * @return String value of the record artist
     */
    public String getARTIST() {
        return ARTIST;
    }

    /**
     * Returns the year of the record.
     * @return int value of the record release year
     */
    public int getYEAR() {
        return YEAR;
    }
}
