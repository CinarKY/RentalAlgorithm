package def;
import java.util.Scanner;

public class HotelRoom extends Property {

	private String roomType;

	public HotelRoom() {
		super();
	}

	@Override
	public void getInput() {
		super.getInput();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Room Type (Single/Double): ");
		roomType = scanner.nextLine();
	}

	@Override
	public double calculateTotalPrice(int nights) {
		return (getBasePrice() + 50) * nights;
	}

	@Override
	public String toString() {
		return "--- Hotel Room Details ---\n" 
				+ "Property Id=" + getPropertyId() 
				+ ",\n Location=" + getLocation() 
				+ ",\n Base Price=" + getBasePrice()
				+ ",\n Room Type=" + roomType + "\n";
	}
}