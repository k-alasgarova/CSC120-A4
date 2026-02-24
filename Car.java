import java.util.ArrayList;

/**
 * Car stores passangers that ride in one train car.
 */
public class Car implements CarRequirements {
    /** List of all passangers currently in the car */
    private ArrayList<Passenger> passengers;
    /** Max number of passengers allowed */
    private int capacity;

    /**
     * Constructs a Car with a specified passanger capacity.
     * @param capacity
     */
    public Car(int capacity) {
        this.capacity = capacity;
        passengers = new ArrayList<>();
    }

    /** Returns max seating capacity */
    public int getCapacity() {
        return capacity;
    }

    /** Returns number of remaining available seats */
    public int seatsRemaining() {
        return capacity - passengers.size();
    }

    /**
     * Adds passenger if there is space.
     */
    public Boolean addPassenger(Passenger p) {
        if (seatsRemaining() > 0 && !passengers.contains(p)) {
            passengers.add(p);
            return true;
        }
        return false;
    }

    /**
     * Removes passenger if they are onboard. 
     */
    public Boolean removePassenger(Passenger p) {
        if (passengers.contains(p)) {
            passengers.remove(p);
            return true;
        }
        return false;
    }

    /**
     * Prints passengers in this car.
     */
    public void printManifest() {
        if (passengers.isEmpty()) {
            System.out.println("This car is EMPTY.");
        } else {
            for (Passenger p : passengers) {
                System.out.println(p.getName());
            }
        }
    }
}