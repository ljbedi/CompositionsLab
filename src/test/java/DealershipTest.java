import com.codebase.*;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class DealershipTest {
    private ArrayList<Vehicle> vehicles;
    private Vehicle vehicle1;
    private Vehicle vehicle2;
    private Engine engine1;
    private Engine engine2;
    private Dealership dealership;

    @Before
    public void before() {
        vehicle1 = new Vehicle(20_000, "Red", engine1, VehicleType.MOTORBIKE, TyreType.RACING);
        vehicle2 = new Vehicle(10_000, "Blue", engine2, VehicleType.TANK, TyreType.WINTER);
        vehicles = new ArrayList<>();
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        dealership = new Dealership(100_000, vehicles);
    }

    @Test
    public void canGetVehicles() {
        assertEquals(2, dealership.getVehicles().size());
    }

    @Test
    public void canGetBalance() {
        assertEquals(100_000, dealership.getBalance());
    }
}