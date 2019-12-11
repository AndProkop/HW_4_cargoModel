package cargo;

import transportation.Transportation;

import java.util.Arrays;

public class Cargo {
    private Long id;
    private static long idCounter = 1L;
    private String name;
    private int weight;
    private CargoType cargoType;
    private Transportation[] transportations;

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = idCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public CargoType getCargoType() {
        return cargoType;
    }

    public void setCargoType(CargoType cargoType) {
        this.cargoType = cargoType;
    }

    public Transportation[] getTransportations() {
        return transportations;
    }
    public void setTransportations(Transportation[] transportations) {
        this.transportations = transportations;
    }
}