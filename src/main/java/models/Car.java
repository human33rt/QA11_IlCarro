package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Car {

    private String address;
    String make;
    String model;
    String year;
    String engine;

    String fuel;
    String gear;
    String WD;

    String door;
    String seats;
    String clasS;
    String fuelComposition;
    String carRegNumber;
    String price;
    String distanctIncluded;
    String typeFeature;
    String about;


}
