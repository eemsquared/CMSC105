package CMSC105LabAns3;

import java.util.Scanner;

/**
 * Created by mmcalvarez on 4/25/2017.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    int choice;
    private GatherInput input = new GatherInput();
    private Scanner sc = new Scanner(System.in);

   Menu(){
       do {
           do {
               System.out.println("\tDescriptive Statistics\n" +
                       "1. Ungrouped Data\n" +
                       "2. Grouped Data\n" +
                       "3. Quit\n" +
                       "\nEnter choice: ");
               choice = sc.nextInt();
           }while (choice < 1 || choice > 3);

           switch (choice){
               case 1 :
                   input.sampleFrame(choice);
                   break;
               case 2 :
                   input.sampleFrame(choice);
                   break;

               case 3 :
                   System.exit(0);

           }
       }while (choice != 3);
    }
}
