import java.util.Scanner;

public class AirplaneTicketPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double basePrice = 0.0;

        System.out.println("Welcome to the Airplane Ticket Price Calculator!");

        System.out.println("Please enter the destination (e.g., 'New York', 'London', 'Tokyo'): ");
        String destination = scanner.nextLine();

        System.out.println("Please enter the class (e.g., 'Economy', 'Business', 'First'): ");
        String flightClass = scanner.nextLine().toLowerCase();

        // Calculate base price based on the destination
        if (destination.equalsIgnoreCase("New York")) {
            basePrice = 500.0;
        } else if (destination.equalsIgnoreCase("London")) {
            basePrice = 600.0;
        } else if (destination.equalsIgnoreCase("Tokyo")) {
            basePrice = 800.0;
        } else {
            System.out.println("Sorry, the destination is not supported.");
            scanner.close();
            return;
        }

        // Apply class-specific multipliers to the base price
        double classMultiplier;
        if (flightClass.equals("economy")) {
            classMultiplier = 1.0;
        } else if (flightClass.equals("business")) {
            classMultiplier = 1.5;
        } else if (flightClass.equals("first")) {
            classMultiplier = 2.0;
        } else {
            System.out.println("Invalid class type. Assuming Economy class.");
            classMultiplier = 1.0;
        }

        // Calculate the final ticket price
        double ticketPrice = basePrice * classMultiplier;

        System.out.println("The ticket price for a flight to " + destination + " in " + flightClass + " class is: $" + ticketPrice);

        scanner.close();
    }
}