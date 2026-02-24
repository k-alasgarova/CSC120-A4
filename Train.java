import java.util.ArrayList;

/**
 * Train ties both Engine and Cars together and manages total passenger capacity and manifests./
 */
public class Train implements TrainRequirements {
    /** Engine that powers the train */
    private Engine engine;
    /** Collection of attached cars */
    private ArrayList<Car> cars;

    /**
     * Constructs train with engine and cars.
     * @param fuelType
     * @param currentFuelLevel
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     */
    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity) {
        engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        cars = new ArrayList<>();

        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    /** Return's a train's engine */
    public Engine getEngine() {
        return engine;
    }

    /** Returns a specific (y i) car */
    public Car getCar(int i) {
        return cars.get(i);
    }

    /**
     * Total capacity of passenger across the cars. 
     */
    public int getMaxCapacity() {
        int total = 0;
        for (Car c : cars) {
            total += c.getCapacity();
        }
        return total;
    }

    /**
     * The remaining seats in the train.
     */
    public int seatsRemaining() {
        int total = 0; 
        for (Car c : cars) {
            total += c.seatsRemaining();
        }
        return total;
    }

    /**
     * Print a full list of train passengers.
     */
    public void printManifest() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + i + ":");
            cars.get(i).printManifest();
        }
    }
}
