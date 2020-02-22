import java.util.Arrays;
import java.util.Scanner;

public class catchPokemon {

    public static void main(String[] args) {
        String[] caughtPokemon = addPokemon();
        System.out.println(Arrays.toString(caughtPokemon));

    }

    static String[] addPokemon(){
        Scanner getData = new Scanner(System.in);
        String[] caughtPokemon = new String[10];
        String continueCatching = "y";
        int count = 0;
        while (continueCatching.equals("y")){
            System.out.println("Which Pokemon have you caught?");
            String catching = getData.nextLine();
            caughtPokemon[count] = catching;
            System.out.println("Would you still like to continue catching pokemon?");
            continueCatching = getData.nextLine();
            System.out.println("So far you have caught " + caughtPokemon[count]);
            count += 1;
        }

        System.out.println("Time to head to the Pokemon Gym...");

        return caughtPokemon;
    }
}
