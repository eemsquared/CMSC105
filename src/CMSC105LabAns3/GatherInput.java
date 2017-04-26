package CMSC105LabAns3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by mmcalvarez on 4/25/2017.
 */
public abstract class GatherInput {
    private int size;
    private int sample;
    private int choiceOfmeasure;
    private int choiceb;
    private ArrayList list;
    private String desc;
    Scanner sc = new Scanner(System.in);

    GatherInput(int choice){
        size = 0;
        list = new ArrayList();

        System.out.println("Please enter a brief description about your data: ");
        desc = sc.next();

        switch (choice){
            case 1: //integer --> no error checking yet if double ang gi input.
                do {
                    System.out.println("Enter sample size: \n");
                    size = sc.nextInt();
                }while (size < 1);

                System.out.println("Enter your samples: \n");
                for (int i = 0; i < size; i++){
                    do {
                        sample = sc.nextInt();
                        if (sample < 0){
                            System.out.println("Positive numbers only.\n");
                        }
                    }while (sample < 0);
                    list.add(sample);
                }

                break;

            case 2: //float
                break;
        }

        System.out.println("\t" + desc + "\n");
        for (int i = 1; i <= list.size(); i++) {
            try {
                Thread.sleep(500);
                System.out.println("[Index " + i + "] " + "Item: " + list.get(i - 1));
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("\n");

        //continue or edit
        do {
            System.out.println("Press [1] to continue\n" +
                    "Press [2] to edit your entries\n");
            choiceOfmeasure = sc.nextInt();
        }while (choiceOfmeasure < 1 || choiceOfmeasure > 2);

        if (choiceOfmeasure == 1){
            do {
                System.out.println("\t Measures of Central Tendency \n" +
                        "1. Mean\n" +
                        "2. Median\n" +
                        "3. Mode\n" +
                        "4. All Measures\n");
                choiceb = sc.nextInt();
            }while (choiceb < 1 || choiceb > 4);

           switch (choiceb){
               case 1 :
                   System.out.println("Mean: " + "[" + new Mean().getMean(list) + "]\n");
                   break;
               case 2 :
                   break;
               case 3 :
                   break;
               case 4 :
                   break;
           }
        }

    }
}
