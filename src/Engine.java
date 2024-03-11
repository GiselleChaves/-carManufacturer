public class Engine {

    private FuelType engineType;
    private int consumption;
    private int mileage;
    private int fuelConsumption;
    private int alcoholConsumption;

    public Engine(FuelType engineType, int consumption) {
        if (engineType == FuelType.FLEX) {
            throw new IllegalArgumentException("Flex engine type must have fuel and alcohol consumption set");
        }
        this.engineType = engineType;
        this.consumption = consumption;
    }

    public Engine(FuelType engineType, int fuelConsumption, int alcoholConsumption) {
        if (engineType != FuelType.FLEX) {
            throw new IllegalArgumentException("fuel and alcohol consumption can only be set for Flex engine type");
        }
        this.engineType = engineType;
        this.fuelConsumption = fuelConsumption;
        this.alcoholConsumption = alcoholConsumption;
        this.consumption = fuelConsumption;
    }

    public int getFuelConsumption() {
        return this.consumption;
    }

    public FuelType getEngineType() {
        return this.engineType;
    }

    public int getMileage() {
        return this.mileage;
    }

    public int requiredFuel(int distance) {
        return distance / consumption;
    }

    public void travel(int distance, boolean isEconomic) {
        mileage += distance;
        if (mileage % 5000 == 0 && isEconomic) {
            if (consumption >= 10)
                consumption -= 1;
            if (alcoholConsumption >= 10)
                alcoholConsumption -= 1;
            if (fuelConsumption >= 10)
                fuelConsumption -= 1;
        }
    }

    public void changeFuelConsumption(FuelType comsumptionType) {
        if (engineType != FuelType.FLEX)
            throw new IllegalArgumentException("fuel and alcohol consumption can only be changed for Flex engine type");

        if (comsumptionType == FuelType.FLEX) {
            this.consumption = this.alcoholConsumption;
            return;
        }
        if (engineType == FuelType.ALCOOL) {
            this.consumption = this.alcoholConsumption;
            return;
        }
        this.consumption = this.fuelConsumption;
    }

    @Override
    public String toString() {
        return "Engine [consumption=" + consumption + ", mileage=" + mileage + ", engineType=" + engineType + "]";
    }
}