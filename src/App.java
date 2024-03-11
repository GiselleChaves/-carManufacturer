public class App {
    public static void main(String[] args) throws Exception {

        Car sportivoCar = new Car.Builder(CarCategory.SPORT, new Engine(FuelType.FUEL, 6),
                new FuelCapacity(FuelType.FUEL, 45)).build();

        System.out.println("Tipos de veiculos:");
        System.out.println(sportivoCar);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro Sport com gasolina");
        sportivoCar.refuel(FuelType.FUEL, 55);
        System.out.println(sportivoCar);
        System.out.println("\nViajando com o carro Sport");
        sportivoCar.travel(100);
        sportivoCar.travel(300);
        System.out.println(sportivoCar);

        Car utilitarioCar = new Car.Builder(CarCategory.UTIL, new Engine(FuelType.DIESEL, 5),
                new FuelCapacity(FuelType.DIESEL, 70)).build();

        System.out.println("Tipos de veiculos:");
        System.out.println(utilitarioCar);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro Utilitário com Flex");
        utilitarioCar.refuel(FuelType.FUEL, 65);
        System.out.println(utilitarioCar);
        System.out.println("\nViajando com o carro Utilitário");
        utilitarioCar.travel(70);
        utilitarioCar.travel(40);
        System.out.println(utilitarioCar);

        Car SuvCar = new Car.Builder(CarCategory.SUV, new Engine(FuelType.FUEL, 8),
                new FuelCapacity(FuelType.FUEL, 55)).build();

        System.out.println("Tipos de veiculos:");
        System.out.println(SuvCar);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro SUV com gasolina");
        SuvCar.refuel(FuelType.FUEL, 65);
        System.out.println(SuvCar);
        System.out.println("\nViajando com o carro SUV");
        SuvCar.travel(100);
        SuvCar.travel(120);
        System.out.println(SuvCar);

        Car SuvFlexCar = new Car.Builder(CarCategory.SUVFLEX, new Engine(FuelType.FLEX, 6),
                new FuelCapacity(FuelType.FLEX, 65)).build();

        System.out.println("Tipos de veiculos:");
        System.out.println(SuvFlexCar);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro SUV Flex com alcool");
        SuvFlexCar.refuel(FuelType.FLEX, 6);
        System.out.println(SuvFlexCar);
        System.out.println("\nViajando com o carro SUV Flex");
        SuvFlexCar.travel(97);
        SuvFlexCar.travel(56);
        System.out.println(SuvFlexCar);

        Car econoCar = new Car.Builder(CarCategory.ECONOMIC, new Engine(FuelType.FUEL, 20),
                new FuelCapacity(FuelType.FUEL, 55)).build();

        System.out.println("Tipos de veiculos:");
        System.out.println(econoCar);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro Econômico com gasolina");
        SuvCar.refuel(FuelType.FUEL, 8);
        System.out.println(econoCar);
        System.out.println("\nViajando com o carro SUV Flex");
        econoCar.travel(160);
        econoCar.travel(426);
        System.out.println(econoCar);
    }
}
