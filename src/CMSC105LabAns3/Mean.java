package CMSC105LabAns3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmcalvarez on 4/26/2017.
 */
public class Mean {

    Mean(){

    }

    public void getMean(List<Object> list, int choice){
        Double sum = 0.0;

        switch (choice){
            case 1 :
                for (int i = 0; i < list.size(); i++){
                    sum += (int) list.get(i);
                }
                System.out.println("[Mean] " + sum/list.size() + "\n");
                break;

            case 2 :
                for (int i = 0; i < list.size(); i++){
                    sum += (double) list.get(i);
                }
                System.out.println("[Mean] " + sum/list.size() + "\n");
                break;
        }
    }

    public void getMean(ArrayList<Double> columnD, ArrayList<Double> freq){
        double total1 = 0;
        double total2 = 0;

        for (int i = 0; i < columnD.size();i++){
            total1 += columnD.get(i);
        }

        for (int i = 0; i < freq.size();i++){
            total2 += freq.get(i);
        }
        System.out.println("[Mean] " + total1/total2 + "\n");
    }
}
