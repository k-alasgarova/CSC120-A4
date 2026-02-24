/**
 * Engine is the locomotive that power the train.
 * It stores fuel type, current level, and maximum fuel capacity. 
 */
public class Engine implements EngineRequirements {
    /** Fuel type used by the engine */
    private FuelType fuelType;
    /** Current fuel level */
    private double currentFuel;
    /** Maximum fuel capacity */
    private double maxFuel;

    /**
     * Constructor initializes the fuels information of the engine.
     * @param fuelType
     * @param currentFuel
     * @param maxFuel
     */
    public Engine(FuelType fuelType, double currentFuel, double maxFuel) {
        this.fuelType = fuelType;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }

    /** Returns the engine fuel type */
    public FuelType getFuelType() {
        return fuelType;
    }

    /** Returns maximum fuel capacity */
    public double getMaxFuel() {
        return maxFuel;
    }

    /** Returns current fuel level */
    public double getCurrentFuel() {
        return currentFuel;
    }

    /**
     * Refills the fuel to the max level/
     */
    public void refuel() {
        currentFuel = maxFuel;
    }

    /**
     * Uses fuel to move train, returning true if it remains.
     */
    public Boolean go() {
        if (currentFuel > 0) {
            currentFuel -= 10;
            System.out.println("Fuel remaining: " + currentFuel);
            return true;
        }
        return false;
    }
}