import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class MegaSena {
    public static void main(String[] args) {

        Random generate = new Random();
        int x;
        boolean lNumber = false;
        
        ArrayList<Integer> valores = new ArrayList<Integer>();

        //comando for incremento e expressao
        for (int i = 0; i < 6;){
            int number = generate.nextInt(60);
            
            //verifica se numero do array ja existe, se existe pula...
            lNumber = contains(valores, number);
                        
            if (number > 0 && lNumber == false ) {                
                valores.add(number);
                System.out.println(number);
                i++;
            }
        }


    }

    public static boolean contains(final ArrayList<Integer> valores, final int number) {
        boolean found = false;

        for(int i = 0; i < valores.size(); i++) {
            if(valores.get(i) == number) {
                found=true;
            }
        }
        return found;  
   }

}



