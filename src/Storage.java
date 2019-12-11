import cargo.Cargo;

public class Storage {
    private static StringBuilder cargoStorage;
    private StringBuilder carrierStorage;
    private StringBuilder transportationStorage;

    public static void addCargo(Cargo cargo) {
        cargoStorage.append(cargo);
    }

    public void addCarrier() {
        //TODO
    }

    public void addTransportation() {
        //TODO
    }

    public static void printAllCargos() {
        System.out.println(cargoStorage);
    }

    public void printAllCarriers() {
        //TODO
    }

    public void printAllTransportations() {
        //TODO
    }
}
