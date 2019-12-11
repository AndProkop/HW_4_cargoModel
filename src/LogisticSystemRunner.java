import cargo.Cargo;
import cargo.CargoType;
import carrier.Carrier;
import carrier.CarrierType;
import transportation.Transportation;

import java.util.Date;

public class LogisticSystemRunner {
    public static void main(String[] args) {

        Cargo apple = new Cargo();
        apple.setId();
        apple.setName("Apple");
        apple.setWeight(20);
        apple.setCargoType(CargoType.FOOD);
        Storage.addCargo(apple);

        Cargo hoodie = new Cargo();
        hoodie.setId();
        hoodie.setName("Hoodie");
        hoodie.setWeight(10);
        hoodie.setCargoType(CargoType.CLOTHES);
        Storage.addCargo(hoodie);

        Cargo laptop = new Cargo();
        laptop.setId();
        laptop.setName("Laptop");
        laptop.setWeight(40);
        laptop.setCargoType(CargoType.COMPUTERS);
        Storage.addCargo(laptop);

        Carrier airFast = new Carrier();
        airFast.setId();
        airFast.setName("AirExpress");
        airFast.setAddress("SPb, Slavi st. 58");
        airFast.setCarrierType(CarrierType.PLANE);

        Carrier titanicExpress = new Carrier();
        titanicExpress.setId();
        titanicExpress.setName("AirExpress");
        titanicExpress.setAddress("Moscow, Mira st. 110");
        titanicExpress.setCarrierType(CarrierType.PLANE);

        Carrier carDelivery = new Carrier();
        carDelivery.setId();
        carDelivery.setName("CarDelivery");
        carDelivery.setAddress("Paris, Montaigne st. 20");
        carDelivery.setCarrierType(CarrierType.CAR);

        Transportation transportation1 = new Transportation();
        transportation1.setId();
        transportation1.setCargo(apple);
        transportation1.setCarrier(carDelivery);
        transportation1.setDescription("Even rockstars eats fruit");
        transportation1.setBillTo("Till Lindemann");
        Date date = new Date(System.currentTimeMillis() - 72 * 60 * 60 * 1000L);
        transportation1.setDate(date);
        apple.setTransportations(new Transportation[]{transportation1});

        Transportation transportation2 = new Transportation();
        transportation2.setId();
        transportation2.setCargo(hoodie);
        transportation2.setCarrier(titanicExpress);
        transportation2.setDescription("There is no warm clothes in Finland, hurry up!");
        transportation2.setBillTo("Mayor of Helsinki");
        date = new Date (System.currentTimeMillis());
        transportation2.setDate(date);
        hoodie.setTransportations(new Transportation[]{transportation2});

        Transportation transportation3 = new Transportation();
        transportation3.setId();
        transportation3.setCargo(apple);
        transportation3.setCarrier(titanicExpress);
        transportation3.setDescription("Big Apple need apples");
        transportation3.setBillTo("New York mayor");
        date = new Date(System.currentTimeMillis() + 72 * 60 * 60 * 1000L);
        transportation3.setDate(date);
        apple.setTransportations(new Transportation[]{transportation1, transportation3});

        Storage.printAllCargos();
    }
}
