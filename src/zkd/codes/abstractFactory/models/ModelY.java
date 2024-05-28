package zkd.codes.abstractFactory.models;

import zkd.codes.abstractFactory.domains.Vehicle;

public class ModelY extends Vehicle {
    public ModelY(Integer horsePower, Boolean hasTurbo, String color, Integer seatsNumber) {
        super(horsePower, hasTurbo, color, seatsNumber);
    }
}
