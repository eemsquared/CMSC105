package CMSC105LabAns3;

import java.util.ArrayList;

/**
 * Created by mmcalvarez on 4/26/2017.
 */
public class Mean {

    Mean(){

    }

    public void getMean(ArrayList<Integer> list, ArrayList<Double> list1, int choice){
        Double sum = 0.0;

        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        System.out.println("[Mean] " + sum/list.size());
    }
}
