/**
 * Passanger represents a person that rides a train.
 * They can board or leave the train cars.
 */
public class Passenger implements PassengerRequirements {
    /** Passanger name */
    private String name;

    /**
     * Constructs Passanger with a given name.
     * @param name
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Returns a passanger name.
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * If space exists, attempts to board a specified car.
     */
    public void boardCar(Car c) {
        if (!c.addPassenger(this)) {
            System.out.println(name + " could not board (car full).");
        }
    }

    /**
     * Passanger leaves a specified car.
     */
    public void getOffCar(Car c) {
        if (!c.removePassenger(this)) {
            System.out.println(name + " was not in this car.");
        }
    }
}
