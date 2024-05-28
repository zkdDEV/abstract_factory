package zkd.codes.abstractFactory.models;

import zkd.codes.abstractFactory.domains.Vehicle;

public class ModelX extends Vehicle {
    public ModelX(Integer horsePower, Boolean hasTurbo, String color, Integer seatsNumber) {
        super(horsePower, hasTurbo, color, seatsNumber);
    }
}
