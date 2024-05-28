package zkd.codes.abstractFactory.models;

import zkd.codes.abstractFactory.domains.Vehicle;

public class Prius extends Vehicle {
    public Prius(Integer horsePower, Boolean hasTurbo, String color, Integer seatsNumber) {
        super(horsePower, hasTurbo, color, seatsNumber);
    }
}
