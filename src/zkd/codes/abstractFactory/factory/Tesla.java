package zkd.codes.abstractFactory.factory;

import zkd.codes.abstractFactory.domains.Vehicle;
import zkd.codes.abstractFactory.models.ModelX;
import zkd.codes.abstractFactory.models.ModelY;

public class Tesla implements IFactory {
    @Override
    public Vehicle getCar(String model) {
        if("A".equalsIgnoreCase(model)){
            return new ModelY(670, true, "Branco", 7);
        } else{
            return new ModelX(800, true, "Preto", 7);
        }
    }
}
