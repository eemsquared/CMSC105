package CMSC105LabAns3;

import java.util.Scanner;

/**
 * Created by mmcalvarez on 4/25/2017.
 */
public class Menu {
    private int choice;
    Scanner sc = new Scanner(System.in);

    Menu(){
        do{
            System.out.println("\tDescriptive Statistics\n" +
            "1. Ungrouped Data\n" +
            "2. Grouped Data\n" +
            "3. Quit\n");
            choice = sc.nextInt();

            if (choice == 3){
                System.out.println("TERMINATING PROGRAM...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.exit(0);
            }
            else {

                switch (choice){
                    case 1 :
                        new Ungrouped(1);
                        break;

                    case 2 :
                        break;

                }
            }
        }while (choice != 3);
    }
}
