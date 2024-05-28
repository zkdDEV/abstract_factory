package zkd.codes.abstractFactory.factory;

import zkd.codes.abstractFactory.domains.Vehicle;
import zkd.codes.abstractFactory.models.Gt86;
import zkd.codes.abstractFactory.models.Prius;

public class Toyota implements IFactory {
    public Vehicle getCar(String model) {
        if("A".equalsIgnoreCase(model)){
            return new Prius(480, false, "Cinza", 4);
        } else{
            return new Gt86(550, true, "Laranja", 2);
        }
    }
}
