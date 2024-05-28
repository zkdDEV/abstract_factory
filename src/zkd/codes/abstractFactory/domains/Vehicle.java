package zkd.codes.abstractFactory.domains;

public class Vehicle {
    private Integer horsePower;
    private Boolean hasTurbo;
    private String color;
    private Integer seatsNumber;

    public Vehicle(Integer horsePower, Boolean hasTurbo, String color, Integer seatsNumber){
        this.horsePower = horsePower;
        this.hasTurbo = hasTurbo;
        this.color = color;
        this.seatsNumber = seatsNumber;
    }

    public void dataVehicle(){
        System.out.println("Modelo: " + getClass().getSimpleName());
        System.out.println("Cavalos: " + horsePower);
        if(hasTurbo.equals(true)){
            System.out.println("Turbo: Sim");
        } else{
            System.out.println("Turbo: Não");
        }
        System.out.println("Cor: " + color);
        System.out.println("N° Assentos: " + seatsNumber);
    }
    public void checkVehicle(){
        System.out.println(getClass().getSimpleName() + " fez check-in e está tudo ok.");
    }
    public void startVehicle(){
        System.out.println(getClass().getSimpleName() + " acabou de ligar e está pronto para partir!");
    }
    public void stopVehicle(){
        System.out.println(getClass().getSimpleName() + " acabou de desligar e está parado!");
    }
}
