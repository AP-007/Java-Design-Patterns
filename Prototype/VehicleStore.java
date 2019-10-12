import java.util.HashMap;
import java.util.Map;

public class VehicleStore {
	private static Map<String, Vehicle> VEHICLE_MAP = new HashMap<String, Vehicle>();
	
	static {
		/* Do the expensive operations like db fetch or file load here as a one time task*/
		VEHICLE_MAP.put("ELECTRIC_CAR", new ElectricCar());
		VEHICLE_MAP.put("PETROL_CAR", new PetrolCar());
	}

	public static Vehicle getVehicle(String vehicleName) {
		return VEHICLE_MAP.get(vehicleName);
	}
}
	