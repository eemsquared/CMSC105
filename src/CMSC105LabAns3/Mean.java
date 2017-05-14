package CMSC105LabAns3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmcalvarez on 4/26/2017.
 */
public class Mean {
    List<Double> var = new ArrayList<>();
    Double sum2;

    Mean(){

    }

    public void getMean(List<Object> list, int choice){
        float sum = 0.0f;
        float total = 0.0f;
        float mean;
        float s;

        switch (choice){
            case 1 :
                for (int i = 0; i < list.size(); i++){
                    sum += (int) list.get(i);
                    System.out.println();
                }
                mean = sum/list.size();
                System.out.println("[Mean] " + mean + "\n");

                for (int i = 0; i < list.size(); i++){
                    total += Math.pow((int) list.get(i) - mean, 2);
                }
                s = (float) Math.sqrt(total/(list.size()-1));
                System.out.println("[Standard Deviation] " + s + "\n");

                break;

            case 2 :
                for (int i = 0; i < list.size(); i++){
                    sum += (double) list.get(i);
                }
                mean = sum/list.size();
                System.out.println("[Mean] " + mean + "\n");

                for (int i = 0; i < list.size(); i++){
                    total += Math.pow((double) list.get(i) - mean, 2);
                }
                s = (float) Math.sqrt(total/(list.size()-1));
                System.out.println("[Standard Deviation] " + s + "\n");
                break;
        }
    }

    public void getMean(ArrayList<Double> columnD, ArrayList<Double> freq, ArrayList<Double> midpoint){
        double total1 = 0.0;
        double total2 = 0.0;
        double total3 = 0.0;
        double mean;
        double s;


        for (int i = 0; i < columnD.size();i++){
            total1 += columnD.get(i);
        }

        for (int i = 0; i < freq.size();i++){
            total2 += freq.get(i);
        }

        for (int i = 0; i < midpoint.size(); i++){
            total3 += freq.get(i) * (Math.pow(midpoint.get(i), 2));
        }
        mean = total1/total2;
        System.out.println("[Mean] " + mean + "\n");
        double numerator = total2 * (total3 - (Math.pow(total1, 2)));
        double denominator = total2 * (total2 - 1.0);

        s = Math.sqrt(numerator/denominator);
        System.out.println("[Standard Deviation] " + s + "\n");
    }
}
