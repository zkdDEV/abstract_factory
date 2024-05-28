package zkd.codes.abstractFactory.models;

import zkd.codes.abstractFactory.domains.Vehicle;

public class Gt86 extends Vehicle {

    public Gt86(Integer horsePower, Boolean hasTurbo, String color, Integer seatsNumber) {
        super(horsePower, hasTurbo, color, seatsNumber);
    }
}
