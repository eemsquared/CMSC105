package Laboratory2;

import java.util.*;

/**
 * Created by mmcalvarez on 3/23/2017.
 */
public class GetInput {
    String title;
    public String dataSetTitle;
    private int populationSize;
    private int choiceOfFrame;
    private int sampleInt;
    private char sampleChar;
    private String sampleString;
    private int categoricalSampleType;

    Scanner sc = new Scanner(System.in);
    List<Object> list = new ArrayList<>();

    public void sampleFrame(int choiceOfFrame){
        System.out.println("Enter a brief title of your data set.");
        dataSetTitle = sc.next();

        do {
            System.out.println("Please enter population size: ");
            populationSize = sc.nextInt();
        }while (populationSize <= 0);

        do {
            try {
                if (choiceOfFrame == 2) {
                    System.out.println("Enter your samples: ");
                    for (int i = 0; i < populationSize; i++) {
                        sampleInt = sc.nextInt();
                        list.add(sampleInt);
                    }
                }
                if (choiceOfFrame == 1) {
                    do{
                        System.out.println("Choose the sample type:\n1. Numerical\n2. Alphabet Character\n3. String");
                        categoricalSampleType = sc.nextInt();
                        System.out.println("Enter your samples: ");

                        if(categoricalSampleType == 1 ) {
                            for (int i = 0; i < populationSize; i++) {
                                sampleInt = sc.nextInt();
                                if (sampleInt < 0) {
                                    System.out.println("Please enter positive numbers only.");
                                    System.exit(0);
                                } else {
                                    list.add(sampleInt);
                                }
                            }
                        }
                        if(categoricalSampleType == 2){
                            for (int i = 0; i < populationSize; i++) {
                                sampleChar = sc.next().charAt(0);
                                list.add(sampleInt);
                            }
                        }
                        if(categoricalSampleType == 3){
                            for (int i = 0; i < populationSize; i++) {
                                sampleString = sc.next();
                                list.add(sampleInt);
                            }
                        }

                    } while (categoricalSampleType > 3 && categoricalSampleType < 1);
                }
            } catch (Exception e) {
                //throw new RuntimeException("Your samples are invalid.");
                System.out.println("Your samples are invalid.");
                System.exit(0);
            }

        } while (choiceOfFrame < 1 || choiceOfFrame > 2);
    }
    public String getDataSetTitle(){
        return dataSetTitle;
    }

    public List<Object> getList(){
        return list;
    }
}
