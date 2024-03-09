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
        return new Car.Builder(CarCategory.UTIL, new Engine(FuelType.FUEL, 5),
                new FuelCapacity(FuelType.FLEX, 55)).build();
    }

    public Car constructSUVFlexCar() {
        return new Car.Builder(CarCategory.FLEX, new Engine(FuelType.FLEX, 8),
                new FuelCapacity(FuelType.FLEX, 65)).build();
    }
}
