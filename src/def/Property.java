package def;
import java.util.Scanner;

public class Property {
	
	private int propertyId;
	private String location;
	private double basePrice;

	public Property() {
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getLocation() {
		return location;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Property Id: ");
		propertyId = scanner.nextInt();
		
		scanner.skip("\\R");
		
		System.out.print("Enter Location: ");
		location = scanner.nextLine();
		
		System.out.print("Enter Base Price: ");
		basePrice = scanner.nextDouble();
	}

	public double calculateTotalPrice(int nights) {
		return basePrice * nights;
	}

	@Override
	public String toString() {
		return "Property Id=" + propertyId 
				+ ",\n Location=" + location 
				+ ",\n Base Price=" + basePrice;
	}
	
}






