package vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleTest {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle car = new Car("Toyota", "Camry", 2024, 4);
        Vehicle motorCycle = new Motorcycle("Harley-Davidson", "Street 750", 2018, true);
        Vehicle truck = new Truck("Ford", "F-150", 2022, 1500);

        vehicles.add(car);
        vehicles.add(motorCycle);
        vehicles.add(truck);

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
