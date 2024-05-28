package zkd.codes.abstractFactory.domains;

public class Customer {

    private String model;

    private boolean hasContract;

    public Customer(String model, boolean hasContract){
        this.model = model;
        this.hasContract = hasContract;
    }

    public String getModel() {
        return model;
    }

    public boolean hasContract() {
        return hasContract;
    }
}
