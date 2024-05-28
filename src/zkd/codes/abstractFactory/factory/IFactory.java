package zkd.codes.abstractFactory.factory;

import zkd.codes.abstractFactory.domains.Vehicle;

public interface IFactory {

    default Vehicle create(String model){
        Vehicle car = getCar(model);
        prepare(car);
        return car;
    }

    default void prepare(Vehicle car){
        car.dataVehicle();
        car.checkVehicle();
        car.startVehicle();
        car.stopVehicle();
    }

    public Vehicle getCar(String model);


}
