import java.util.Scanner;

/**
 * ControlDeNoms
 */

import java.util.Scanner;

public class ControlDeNoms {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);


        System.out.println("Introdueixi un nom (EXIT per tancar)");
        String input = scan.nextLine();
        boolean isName = false;

        while(!input.equalsIgnoreCase("EXIT")){

            for (int i = 0; i < input.length(); i++) {
                
                if(input.charAt(i) != input.charAt(0)){

                    isName = true;

                }

            }

            if(isName){

                System.out.println(input + " és un nom");

            }else{

                System.out.println(input + " NO és un nom");
                
            }

            System.out.println("Introdueixi un nom (EXIT per tancar)");
            input = scan.nextLine();
            isName = false;

        }

        System.out.println("Tancant programa...");

    }

}