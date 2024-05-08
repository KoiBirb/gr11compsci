import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
     * LeoRecordCollection.java
     * Leo Bogaert
     * 2024/05/08
     * This class contains a collection of records.
     * It can add, remove, and print records from the collection.
 */
public class LeoRecordCollection {

    public static ArrayList<Record> recordCollection = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static String title, artist;
    private static int year;

    public static void main(String[] args) {
        // Default records in collection
        recordCollection.add(new Record("After Hours", "The Weeknd", 2020));
        recordCollection.add(new Record("Master Of Puppets", "Metallica", 1986));
        recordCollection.add(new Record("1989", "Taylor Swift", 2014));
        recordCollection.add(new Record("Nevermind", "Nirvana", 1991));
        boolean keepGoing = true, validInput = false;

        // Menu loop
        while (keepGoing) {

            // Ask user for choice
            System.out.println("""
                    Record Collection Menu:
                    1. Buy a record
                    2. Sell a record
                    3. Show record collection
                    4. Show record collection by year
                    5. Show record collection by artist
                    6. Exit""");

            // Loop until valid input is received
            validInput = false;
            while (!validInput) {
                System.out.print("Enter your choice: ");
                int choice;
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid choice.");
                    scanner.nextLine();
                    continue;
                }

                scanner.nextLine();
                // Perform action based on choice
                validInput = true;
                switch (choice) {
                    case 1:
                        // Get record information from user and add record
                        getRecordInformation();
                        buyRecord(title, artist, year);
                        System.out.println("Record added to collection.");
                        break;
                    case 2:
                        // Get record information from user and remove record
                        getRecordInformation();
                        if (sellRecord(title, artist, year))
                            System.out.println("Record removed from collection.");
                        else
                            System.out.println("Record not found in collection.");
                        break;
                    case 3:
                        // Print all records in collection
                        printCollection();
                        break;
                    case 4:
                        // Get year from user and print records from that year
                        askYear();
                        printCollection(year);
                        break;
                    case 5:
                        // Get artist from user and print records by that artist
                        System.out.print("Enter the artist to search for: ");
                        String artist = scanner.nextLine();
                        printCollection(artist);
                        break;
                    case 6:
                        // Exit program
                        System.out.println("Goodbye!");
                        keepGoing = false;
                        break;
                    default:
                        validInput = false;
                        System.out.println("Invalid choice.");
                }
            }
        }
    }

    /**
     * Gets record information from the user.
     */
    public static void getRecordInformation(){
        System.out.print("Enter the title of the record: ");
        title = scanner.nextLine();
        System.out.print("Enter the artist of the record: ");
        artist = scanner.nextLine();
        askYear();
    }

    /**
     * Gets the year of the record from the user with input validation.
     */
    public static void askYear(){
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the year of the record: ");
                year = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid year.");
                scanner.nextLine();
            }
        }
    }

    /**
     * Adds a record to the collection with the given title, artist and year.
     * @param title String value of the record title
     * @param artist String value of the record artist
     * @param year int value of the record release year
     */
    public static void buyRecord(String title, String artist, int year) {
        recordCollection.add(new Record(title, artist, year));
    }

    /**
     * Removes a record from the collection with the given title, artist and year.
     * @param title String value of the record title
     * @param artist String value of the record artist
     * @param year int value of the record release year
     * @return true if the record has been removed from the collection, false otherwise
     */
    public static boolean sellRecord(String title, String artist, int year) {
        Record temp = new Record(title, artist, year);
        for (Record r : recordCollection) {
            if (r.equals(temp)) {
                recordCollection.remove(r);
                return true;
            }
        }
        return false;
    }

    /**
     * Prints all records in the collection.
     */
    public static void printCollection() {
        for (Record r : recordCollection) {
            System.out.println(r);
        }
    }

    /**
     * Prints all records in the collection with the given year.
     * @param year int value of the year to search for
     */
    public static void printCollection(int year) {
        boolean found = false;
        for (Record r : recordCollection) {
            if (r.getYEAR() == year) {
                System.out.println(r);
                found = true;
            }
        }
        if (!found)
            System.out.println("No records found for the year " + year + ".");
    }

    /**
     * Prints all records in the collection from a given artist.
     * @param artist String value of the artist to search for
     */
    public static void printCollection(String artist) {
        boolean found = false;
        for (Record r : recordCollection) {
            if (r.getARTIST().equalsIgnoreCase(artist)) {
                System.out.println(r);
                found = true;
            }
        }
        if (!found)
            System.out.println("No records found for the artist " + artist + ".");
    }
}