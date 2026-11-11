package def;
import java.util.Scanner;

public class Booking {

	private int bookingId;
	private String guestName;
	private int nights;
	private Property property;
	
	private static int countOfBookings = 0;

	public Booking() {
		guestName = "No Name";
		countOfBookings++;
	}

	public static int getCountOfBookings() {
		return countOfBookings;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public double getBookingTotal() {
		if (property != null) {
			return property.calculateTotalPrice(nights);
		}
		return 0;
	}

	public void getInput() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nEnter Booking Id: ");
		bookingId = scanner.nextInt();
		
		scanner.skip("\\R");
		
		System.out.print("Enter Guest Name: ");
		guestName = scanner.nextLine();
		
		System.out.print("Enter Number of Nights: ");
		nights = scanner.nextInt();
	}

	@Override
	public String toString() {
		String propDetails = (property != null) ? property.toString() : "No property assigned";
		
		return "Booking Id=" + bookingId 
				+ ",\n Guest Name=" + guestName 
				+ ",\n Nights=" + nights 
				+ ",\n Total Price=" + getBookingTotal()
				+ "\n\n" + propDetails;
	}
}