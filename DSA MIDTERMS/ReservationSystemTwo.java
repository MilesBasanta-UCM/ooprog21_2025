import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

// 1. The Reservation Object
class Reservation {
    int id;
    String name;
    LocalDate date;
    int persons;

    public Reservation(int id, String name, LocalDate date, int persons) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.persons = persons;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Date: " + date + " | Persons: " + persons);
    }
}

// 2. The Main System
public class ReservationSystemTwo{
    static Reservation[] reservationsArray = new Reservation[100];
    static int reservationCount = 0; 
    static int idCounter = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n*** Reservation System (FIFO Array) ***");
            System.out.println("1. Add Reservation");
            System.out.println("2. Cancel (Remove First)");
            System.out.println("3. Display All");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            
            // Check if input is actually a number to prevent crashes
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); // Clear buffer
            } else {
                System.out.println("Please enter a valid number.");
                sc.nextLine(); // Clear invalid input
                continue;
            }

            switch (choice) {
                case 1: addReservation(sc); break;
                case 2: cancelReservation(); break;
                case 3: displayReservations(); break;
                case 4: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        sc.close();
    }

    public static void addReservation(Scanner sc) {
        if (reservationCount >= reservationsArray.length) {
            System.out.println("Error: System Full!");
            return;
        }

        try {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter date (yyyy-MM-dd): ");
            String inputDate = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(inputDate, formatter);

            System.out.print("Enter number of persons: ");
            int persons = Integer.parseInt(sc.nextLine()); // Safer way to read integers

            reservationsArray[reservationCount++] = new Reservation(idCounter++, name, date, persons);
            System.out.println("Successfully added!");
            
        } catch (DateTimeParseException e) {
            System.out.println("ERROR: Invalid date format. Use yyyy-MM-dd (e.g., 2026-12-25)");
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Please enter a valid number for persons.");
        }
    }

    public static void displayReservations() {
        if (reservationCount == 0) {
            System.out.println("The list is empty.");
            return;
        }
        for (int i = 0; i < reservationCount; i++) {
            reservationsArray[i].display();
        }
    }

    // UPDATED FOR FIFO LOGIC
    public static void cancelReservation() {
        if (reservationCount == 0) {
            System.out.println("Nothing to cancel.");
            return;
        }
        
        // 1. Save the first reservation (at index 0) so we can print it later
        Reservation canceledReservation = reservationsArray[0];
        
        // 2. Shift all remaining reservations one position to the left
        for (int i = 0; i < reservationCount - 1; i++) {
            reservationsArray[i] = reservationsArray[i + 1];
        }
        
        // 3. Decrease the counter
        reservationCount--; 
        
        // 4. Clear the last duplicated spot to keep memory clean
        reservationsArray[reservationCount] = null;

        System.out.println("First reservation removed (FIFO):");
        canceledReservation.display();
    }
}
