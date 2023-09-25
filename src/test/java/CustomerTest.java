import com.codebase.Customer;
import com.codebase.Engine;
import com.codebase.Vehicle;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class CustomerTest {
    private ArrayList<Vehicle> vehicles;
    private Vehicle vehicle1;
    private Vehicle vehicle2;
    private Engine engine1;
    private Engine engine2;
    private Customer customer;

    @Before
    public void before() {
        vehicle1 = new Vehicle(20_000, "Red", engine1);
        vehicle2 = new Vehicle(10_000, "Blue", engine2);
        vehicles = new ArrayList<>();
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        customer = new Customer(5_000, vehicles);
    }

    @Test
    public void canGetBalance() {

        assertEquals(5_000, customer.getBalance());

    }

    @Test
    public void canGetVehicles() {

        assertEquals(2, customer.getVehicles().size());
    }
}
