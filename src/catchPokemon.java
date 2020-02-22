import java.util.Arrays;
import java.util.Scanner;

public class catchPokemon {


    // Driver Code
    public static void main(String[] args) {


    }

    // Method for catching the Pokemon
    static String[] addPokemon(){
        Scanner getData = new Scanner(System.in);
        String[] caughtPokemon = new String[10];
        String continueCatching = "y";
        int count = 0;
        while (continueCatching.equals("y")){
            System.out.println("Which Pokemon have you caught?");
            String catching = getData.nextLine();
            caughtPokemon[count] = catching;
            System.out.println("Would you still like to continue catching pokemon? (y / n)");
            continueCatching = getData.nextLine();
            System.out.println("So far you have caught " + caughtPokemon[count]);
            count += 1;
        }

        System.out.println("Time to head to the Pokemon Gym...");

        return caughtPokemon;
    }

    // Method for taking the Pokemon to the gym team
    static String[] addGymTeam(){
        Scanner getData = new Scanner(System.in);
        String[] collection = addPokemon();
        String[] gymTeam = new String[6];

        while (gymTeam.length < 6){
            System.out.println("Which Pokemon would you like to add to your F=Gym team?");
            String gymP = getData.nextLine();
        }
    }
}
