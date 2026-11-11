package def;
import java.util.Scanner;

public class House extends Property {

	private int numberOfRooms;
	private boolean hasPool;

	public House() {
	}

	@Override
	public void getInput() {
		super.getInput();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number of Rooms: ");
		numberOfRooms = scanner.nextInt();
		scanner.skip("\\R");

		System.out.print("Does house have a pool? (Y/N): ");
		String poolInput = scanner.nextLine();
		if (poolInput.equalsIgnoreCase("Y"))
			this.hasPool = true;
		else if (poolInput.equalsIgnoreCase("N"))
			this.hasPool = false;
	}

	@Override
	public double calculateTotalPrice(int nights) {
		return getBasePrice() * nights;
	}

	@Override
	public String toString() {
		String poolStatus = "";
		if(hasPool == true) {
			poolStatus += "Has pool.";
		} else {
			poolStatus += "No pool.";
		}
		
		return "--- House Details ---\n" 
				+ "Property Id=" + getPropertyId() 
				+ ",\n Location=" + getLocation() 
				+ ",\n Base Price=" + getBasePrice()
				+ ",\n Number of Rooms=" + numberOfRooms 
				+ ",\n Pool Status=" + poolStatus + "\n";
	}
}