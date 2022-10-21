import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        /* START - ALL variables and declarations */
        UserInput userChoice = new UserInput();
        Trucks newTruckRegistration = new Trucks();
        LoadingDeck loadingDeck = new LoadingDeck();

        int userTruckType;
        int userTruckWeight;

        int userSelection=0;

        Map<Integer,Integer> truckList = new HashMap<>();
        loadingDeck.setInitialDeckList();
        /* END - ALL variables and declarations */




        /* START - Loop to check user choice every time */
        while (userSelection != 3){                     //Repeat reading new user selection until the user choose to exit the program
            userSelection = userChoice.getUserInput();  // Get the user selection ---- every time


            // Check what the user choose and act accordingly
            if(userSelection==1){                 // if the user choose to see the parked trucks
                loadingDeck.printTruckList();


            }else if(userSelection==2){          // if the user choose to register new truck
                userTruckType =  newTruckRegistration.addNewTruck();
                userTruckWeight = newTruckRegistration.addNewTruckWeight();

                truckList.put(userTruckType,userTruckWeight);

                loadingDeck.referTruckToDeck(userTruckType,userTruckWeight);

            }else if(userSelection==3) {        // if the user choose to exit the program
                System.out.println("Tack ... Vi ses senare!");


            }else{                              // the user entered wrong choice, so the program will ask for new choice
                System.out.println("Fel val! vänligen välj från listan");
            }

        }
        /* END - Loop to check user choice every time */


    }
}