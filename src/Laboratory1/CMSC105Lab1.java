package Laboratory1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mmcalvarez on 2/17/2017.
 */
public class CMSC105Lab1 {

    private int choice;
    private GatherInput input = new GatherInput();
    private List<Object> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public static void main (String[]args){
        CMSC105Lab1 lab = new CMSC105Lab1();
        lab.run();
    }

    private void run(){

        do {
            System.out.println("\tBasic Sampling Methods\n" +
                    "1. Simple Random Sampling\n" +
                    "2. Systematic Sampling\n" +
                    "3. Stratified Sampling\n" +
                    "4. Quit\n" +
                    "Enter choice: ");
            choice = sc.nextInt();
            if(choice == 4) {
                System.out.println("TERMINATING PROGRAM...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.exit(0);

            }else if (choice >= 1 && choice < 4){
                input.sampleFrame();
            }

        switch (choice){

            case 1 :
                SimpleRandomSampling simpleRandomSampling = new SimpleRandomSampling();
                list = simpleRandomSampling.randomSamples(input.getList());
                simpleRandomSampling.print(list);
                break;

            case 2 :
                SystematicSampling systematicSampling = new SystematicSampling();
                list = systematicSampling.randomSamples(input.getList());
                systematicSampling.print(list);
                break;

            case 3 :
                StratifiedSampling stratifiedSampling = new StratifiedSampling();
                list = stratifiedSampling.randomSamples(input.getList());
                stratifiedSampling.print(list);
                break;

        }
        }while (choice != 4);
    }

}
