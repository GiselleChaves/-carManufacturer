public class FuelCapacity {

    private FuelType fuelType;
    private int capacity;
    private int availableFuel;

    public FuelCapacity(FuelType fuelType, int capacity) {
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.availableFuel = 0;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailableFuel() {
        return availableFuel;
    }

    // Retorna false se o tipo de combustivel for incompativel ou se a quantidade
    // for maior que a capacidade livre
    public boolean supply(FuelType fuelType, int quantity) {
        if (fuelType != this.fuelType) {
            if (this.fuelType == FuelType.FLEX) {
                if (!(fuelType == FuelType.FUEL || fuelType == FuelType.ALCOOL)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (getAvailableFuel() + quantity > getCapacity()) {
            return false;
        } else {
            availableFuel += quantity;
            return true;
        }
    }

    public boolean expend(int quantity) {
        if (getAvailableFuel() - quantity < 0) {
            return false;
        } else {
            availableFuel -= quantity;
            return true;
        }
    }

    @Override
    public String toString() {
        return "TanqueCombustivel [capacidade=" + capacity + ", combustivelDisponivel=" + availableFuel
                + ", tipoCombustivel=" + fuelType + "]";
    }

}
