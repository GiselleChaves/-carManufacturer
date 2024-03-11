public class CarDirector {
    public Car constructSportCar() {
        return new Car.Builder(CarCategory.SPORT, new Engine(FuelType.FUEL, 6),
                new FuelCapacity(FuelType.FUEL, 45)).build();
    }

    public Car constructUtilCar() {
        return new Car.Builder(CarCategory.UTIL, new Engine(FuelType.ALCOOL, 5),
                new FuelCapacity(FuelType.ALCOOL, 70)).build();
    }

    public Car constructSUVCar() {
        return new Car.Builder(CarCategory.SUV, new Engine(FuelType.FUEL, 5),
                new FuelCapacity(FuelType.FLEX, 55)).build();
    }

    public Car constructSUVFlexCar() {
        return new Car.Builder(CarCategory.SUVFLEX, new Engine(FuelType.FLEX, 8, 6),
                new FuelCapacity(FuelType.FLEX, 65)).build();
    }

    public Car constructEconomicCar() {
        return new Car.Builder(CarCategory.ECONOMIC, new Engine(FuelType.FUEL, 20),
                new FuelCapacity(FuelType.FUEL, 55)).build();
    }
}
