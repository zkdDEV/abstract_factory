package zkd.codes.abstractFactory;

import zkd.codes.abstractFactory.domains.Customer;
import zkd.codes.abstractFactory.domains.Vehicle;
import zkd.codes.abstractFactory.factory.IFactory;
import zkd.codes.abstractFactory.factory.Tesla;
import zkd.codes.abstractFactory.factory.Toyota;

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Você tem contrato? (sim/não)");
        String contractAnswer = s.nextLine();
        boolean hasContract = itHasContract(contractAnswer);
        String model = whichModel(hasContract);
        Boolean isModelValid = checkModelAnswer(model);
        if(isModelValid){
            Customer customer = new Customer(model, hasContract);
            IFactory factory = whichFactory(customer);
            Vehicle car = factory.create(customer.getModel());
        } else{
            error();
        }

    }
    public static void error(){
        System.out.println("Você digitou um valor inválido! Reinicie o programa.");
        System.exit(0);
    }
    public static boolean itHasContract(String contractAnswer){
        if("sim".equalsIgnoreCase(contractAnswer) || "s".equalsIgnoreCase(contractAnswer)){
            return true;
        } else if("não".equalsIgnoreCase(contractAnswer) || "nao".equalsIgnoreCase(contractAnswer) || "n".equalsIgnoreCase(contractAnswer)){
            return false;
        }else{
            error();
            return false;
        }
    }
    public static String whichModel(Boolean isContractTrue){
        Scanner s = new Scanner(System.in);
        String model;
        if(isContractTrue){
            System.out.println("Digite qual modelo da Tesla você deseja - A(Model Y) e B(Model X)");
            model = s.nextLine();
        } else{
            System.out.println("Digite qual modelo da Toyota você deseja - A(Prius) e B(GT86)");
            model = s.nextLine();
        }
        return model;
    }
    public static boolean checkModelAnswer(String modelAnswer){
        if("A".equalsIgnoreCase(modelAnswer) || "B".equalsIgnoreCase(modelAnswer)){
            return true;
        }
        return false;
    }
    public static IFactory whichFactory(Customer customer){
        if(customer.hasContract()){
            return new Tesla();
        } else {
            return new Toyota();
        }

    }


}
