package Laboratory1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mmcalvarez on 2/17/2017.
 */
public class CMSC105Lab1 {

    int choice;
    GatherInput input = new GatherInput();
    List<Object> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static void main (String[]args){
        CMSC105Lab1 lab = new CMSC105Lab1();
        lab.run();
    }

    public void run(){

        do {
            System.out.println("\tBasic Sampling Methods\n" +
                    "1. Simple Random Sampling\n" +
                    "2. Sytematic Sampling\n" +
                    "3. Stratified Sampling\n" +
                    "4. Quit\n" +
                    "Enter choice: ");
            choice = sc.nextInt();
        }while (choice < 1 || choice > 4);

        switch (choice){
            case 1 :
                SimpleRandomSampling simpleRandomSampling = new SimpleRandomSampling();
                input.sampleFrame();
                list = simpleRandomSampling.randomSamples(input.getList());
                simpleRandomSampling.print(list);
                break;

            case 4 :
                System.exit(0);
        }
    }



        // System.out.println("\tBasic Sampling Methods\n1. Simple Random Sampling\n2. Sytematic Sampling\n3. Stratified Sampling\n4. Quit");

}
