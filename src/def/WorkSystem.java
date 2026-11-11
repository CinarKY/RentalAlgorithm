package def;

public class WorkSystem {
private static final int MAX_CAPACITY = 50;
	
	private static Property[] properties = new Property[MAX_CAPACITY];
	private static int propertyCount = 0;
	
	private static Booking[] bookings = new Booking[MAX_CAPACITY];
	private static int bookingCount = 0;

	public static void addProperty(Property p) {
		if (propertyCount < MAX_CAPACITY) {
			if (searchPropertyById(p.getPropertyId())) {
				System.out.println("Property ID already exists. Please enter a different ID.");
			} else {
				properties[propertyCount++] = p;
				System.out.println("Property added successfully!");
			}
		} else {
			System.out.println("Maximum capacity of properties reached.");
		}
	}

	public static boolean searchPropertyById(int id) {
		for (int i = 0; i < propertyCount; i++) {
			if (properties[i].getPropertyId() == id) {
				return true;
			}
		}
		return false;
	}

	public static Property searchProperty(int id) {
		Property foundProperty = null;

		for (int i = 0; i < propertyCount; i++) {
			if (properties[i].getPropertyId() == id) {
				foundProperty = properties[i];
				return foundProperty;
			}
		}
		return null;
	}

	public static void displayAllProperties() {
		String output = "";

		if (propertyCount == 0) {
			System.out.println("No properties to display.");
		} else {
			for (int i = 0; i < propertyCount; i++) {
				output += properties[i].toString() + "\n";
			}
		}
		System.out.println(output);
	}

	public static double calculateAveragePrice() {
		if (propertyCount == 0) {
			return 0;
		}

		double totalPrice = 0;
		for (int i = 0; i < propertyCount; i++) {
			totalPrice += properties[i].getBasePrice();
		}
		return totalPrice / propertyCount;
	}

}
