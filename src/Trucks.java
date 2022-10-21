import java.util.Scanner;

public class Trucks {

    private int truckType;
    private int truckWeight;

    public int addNewTruck (){ // Get the user truck type
        System.out.println("");
        System.out.println("************************************************************");
        System.out.println("Typ av lastbil: ");
        System.out.println("1. Skåpbil");
        System.out.println("2. Lätt lastbil");
        System.out.println("3. Tung lastbil");
        System.out.print("Välj från listan: ");

        Scanner newTruckType = new Scanner(System.in);
        this.truckType = newTruckType.nextInt();  //let the user enter a new truck type

        return this.truckType = truckType;
    }


    public int addNewTruckWeight (){ // Get the user truck Weight
        System.out.println("");
        Scanner newTruckWeight = new Scanner(System.in);    //let the user enter a new truck weight
        if(this.truckType == 1){
            System.out.print("Vikt på skåpbil: ");
            this.truckWeight =  newTruckWeight.nextInt();
        }else {
            System.out.print("Vikt på lastbil: ");
            this.truckWeight =  newTruckWeight.nextInt();
        }

        return this.truckWeight;
    }


}
