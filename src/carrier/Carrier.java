package carrier;

import transportation.Transportation;

public class Carrier {
    private Long id;
    private static long idCounter = 1L;
    private String name;
    private String address;
    private CarrierType carrierType;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CarrierType getCarrierType() {
        return carrierType;
    }

    public void setCarrierType(CarrierType carrierType) {
        this.carrierType = carrierType;
    }

    public Transportation[] getTransportations() {
        return transportations;
    }

    public void setTransportations(Transportation[] transportations) {
        this.transportations = transportations;
    }
}