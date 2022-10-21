import java.util.Scanner;
public class UserInput {
    private int userChoice;

    public int getUserInput (){
        Scanner userSelection = new Scanner(System.in);

        System.out.println("");
        System.out.println("************************************************************");
        System.out.println("- Avlastningsstationen dumpa mera  -");
        System.out.println("1. Se parkerade lastbilar");
        System.out.println("2. Registrera ny avlastande lastbil");
        System.out.println("3. Avsluta");
        System.out.print("Välj från listan: ");

        return this.userChoice = userSelection.nextInt();
    }
}
