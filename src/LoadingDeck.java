import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadingDeck {

    Map<String,Integer> decksStatus = new HashMap<>();

    HashMap<String, HashMap<String, String>> decksList = new HashMap<String, HashMap<String,String>>();


    public void setInitialDeckList (){
        this.decksStatus.put("A",0);
        this.decksStatus.put("B",0);
        this.decksStatus.put("C",0);
        this.decksStatus.put("D",0);
        this.decksStatus.put("E",0);
    }

    public void referTruckToDeck (int truckType, int truckWeight){

        // Register Van here
        if (truckType == 1){
            if (this.decksStatus.get("A") == 0){
                HashMap<String, String> innerMapA = new HashMap<String, String>();
                innerMapA.put("Skåpbil", Integer.toString(truckWeight));
                this.decksList.put("A", innerMapA);
                this.decksStatus.put("A",1);
                System.out.println("Skåpbil registrerad för kaj A");

            }else if (this.decksStatus.get("B") == 0){
                HashMap<String, String> innerMapB = new HashMap<String, String>();
                innerMapB.put("Skåpbil", Integer.toString(truckWeight));
                this.decksList.put("B", innerMapB);
                this.decksStatus.put("B",1);
                System.out.println("Skåpbil registrerad för kaj B");

            }else{
                System.out.println("Tyvärr är det fullt, hänvisa förare till stationen dumpa mest!");
            }

        // Register Light Truck
        }else if(truckType == 2){

            if ((this.decksStatus.get("A") == 0) && (truckWeight<5000)) {
                HashMap<String, String> innerMapA = new HashMap<String, String>();
                innerMapA.put("Lätt lastbil", Integer.toString(truckWeight));
                this.decksList.put("A", innerMapA);
                this.decksStatus.put("A", 1);
                System.out.println("lastbil registrerad för kaj A");

            }else if (this.decksStatus.get("C") == 0){
                HashMap<String, String> innerMapC = new HashMap<String, String>();
                innerMapC.put("Lätt lastbil", Integer.toString(truckWeight));
                this.decksList.put("C", innerMapC);
                this.decksStatus.put("C",1);
                System.out.println("lastbil registrerad för kaj C");

            }else if (this.decksStatus.get("D") == 0){
                HashMap<String, String> innerMapD = new HashMap<String, String>();
                innerMapD.put("Lätt lastbil", Integer.toString(truckWeight));
                this.decksList.put("D", innerMapD);
                this.decksStatus.put("D",1);
                System.out.println("lastbil registrerad för kaj D");

            }else{
                System.out.println("Tyvärr är det fullt, hänvisa förare till stationen dumpa mest!");
            }

        //Register Heavy Truck
        }else if(truckType == 3){

            if ((this.decksStatus.get("D") == 0) && (truckWeight<9000)) {
                HashMap<String, String> innerMapD = new HashMap<String, String>();
                innerMapD.put("Tung lastbil", Integer.toString(truckWeight));
                this.decksList.put("D", innerMapD);
                this.decksStatus.put("D", 1);
                System.out.println("lastbil registrerad för kaj D");
            }else if (this.decksStatus.get("E") == 0){
            HashMap<String, String> innerMapE = new HashMap<String, String>();
            innerMapE.put("Tung lastbil", Integer.toString(truckWeight));
            this.decksList.put("E", innerMapE);
            this.decksStatus.put("E",1);
            System.out.println("lastbil registrerad för kaj E");


            }else{
                System.out.println("Tyvärr är det fullt, hänvisa förare till stationen dumpa mest!");
            }
        }

    }

    public void printTruckList () {
        for (String key : decksList.keySet()) {
            System.out.println(key + " - " + decksList.get(key));
        }
    }

}
