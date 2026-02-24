/**
 * Passanger represents a person that rides a train.
 */
public class Passenger implements PassengerRequirements {
    
    private String name;

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
     * If space exists, board a car.
     */
    public void boardCar(Car c) {
        if (!c.addPassenger(this)) {
            System.out.println(name + " could not board (car full).");
        }
    }

    /**
     * Passanger leaves a car.
     */
    public void getOffCar(Car c) {
        if (!c.removePassenger(this)) {
            System.out.println(name + " was not in this car.");
        }
    }
}
