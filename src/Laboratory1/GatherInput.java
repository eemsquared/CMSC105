package Laboratory1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mmcalvarez on 2/18/2017.
 */
public class GatherInput {
    String title;
    private int populationSize;
    private int choiceOfFrame;
    private int sampleInt;
    char sampleChar;
    Scanner sc = new Scanner(System.in);
    List<Object> list = new ArrayList<>();

    public void sampleFrame(){
        list.clear();
        do {
            System.out.println("Please enter population size: ");
            populationSize = sc.nextInt();
        }while (populationSize <= 0);

        do {
            System.out.println("Press 1 if your sampling frame is numerical\nPress 2 if your sampling frame is character.");
            choiceOfFrame = sc.nextInt();

            try {
                if (choiceOfFrame == 1) {
                        System.out.println("Enter your samples: ");
                        for (int i = 0; i < populationSize; i++) {
                            sampleInt = sc.nextInt();
                            if (sampleInt < 0){
                                System.out.println("Please enter positive numbers only.");
                                System.exit(0);
                            }else {
                                list.add(sampleInt);
                            }
                        }
                }
                if (choiceOfFrame == 2) {
                    System.out.println("Enter your samples: ");
                    for (int i = 0; i < populationSize; i++) {
                        sampleChar = sc.next().charAt(0);
                        if ((sampleChar - '0') <= 9 && (sampleChar - '0') >= 0) {
                            System.out.println("Your samples are invalid. It must be all characters.");
                            System.exit(0);
                        } else {
                            list.add(sampleChar);
                        }
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException("Your samples are invalid. It must be all numerical.");
            }


            System.out.println("\n" + "SAMPLE FRAME: ");
            for (int i = 1; i <= list.size(); i++) {
                System.out.println("[Index" + i + "] " + "Item: " + list.get(i - 1));
            }

        } while (choiceOfFrame < 1 || choiceOfFrame > 2);
    }

    public List<Object> getList(){
        return list;
    }

    public void print(List<Object> list){
        System.out.println("\n" + title);
        for (int i = 1; i <= list.size(); i++) {
            try {
                Thread.sleep(500);
                System.out.println("[Index " + i + "] " + "Item: " + list.get(i - 1));
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("\n");
    }
}
