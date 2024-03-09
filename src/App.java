public class App {
    public static void main(String[] args) throws Exception {

        Car basic = new Car.Builder(CarCategory.SPORT, new Engine(FuelType.FUEL, 10),
                new FuelCapacity(FuelType.FUEL, 10)).build();

        System.out.println("Tipos de veiculos:");
        System.out.println(basic);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basic.refuel(FuelType.FUEL, 55);
        System.out.println(basic);
        System.out.println("\nViajando com o carro basico");
        basic.travel(250);
        basic.travel(150);
        System.out.println(basic);
    }
}
