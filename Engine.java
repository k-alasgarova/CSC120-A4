public class Engine implements EngineRequirements {
    private FuelType fuelType;
    private double currentFuel;
    private double maxFuel;


    public Engine(FuelType fuelType, double currentFuel, double maxFuel) {
        this.fuelType = fuelType;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public void refuel() {
        currentFuel = maxFuel;
    }

    public Boolean go() {
        if (currentFuel > 0) {
            currentFuel -= 10;
            System.out.println("Fuel remaining: " + currentFuel);
            return true;
        }
        return false;
    }
}