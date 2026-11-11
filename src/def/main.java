package def;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(java.lang.System.in);
		String input;
		
		java.lang.System.out.print("Do you want to add a property? (Yes/No): ");
		input = scanner.next();
		
		while (input.equalsIgnoreCase("yes")) {
			System.out.println("1 - Enter a house\n2 - Enter a Hotel Room");
			int choice = scanner.nextInt();
			
			Property p = null;
			
			if (choice == 1) {
				p = new House();
			} else if (choice == 2) {
				p = new HotelRoom();
			}
			
			if (p != null) {
				p.getInput();
				WorkSystem.addProperty(p);
			}
			
			System.out.println("\nDo you want to add another property? (Yes/No): ");
			input = scanner.next();
		}
		
		System.out.println("\nAll Properties in the System:");
		WorkSystem.displayAllProperties();
		
		System.out.println("Average Price of Properties: " + WorkSystem.calculateAveragePrice());
		
		System.out.print("\nDo you want to add a booking? (Yes/No): ");
		input = scanner.next();
		
		while (input.equalsIgnoreCase("yes")) {
			Booking b = new Booking();
			b.getInput();
			
			System.out.print("Enter the Property ID for this booking: ");
			int propId = scanner.nextInt();
			
			Property foundProperty = WorkSystem.searchProperty(propId);
			
			if (foundProperty != null) {
				b.setProperty(foundProperty);
				System.out.println("\nBooking created successfully!");
				System.out.println(b.toString());
			} else {
				System.out.println("\nProperty not found. Booking is incomplete.");
			}
			
			System.out.print("\nDo you want to add another booking? (Yes/No): ");
			input = scanner.next();
		}

	}

}
