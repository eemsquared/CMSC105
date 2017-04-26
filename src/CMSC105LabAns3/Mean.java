package CMSC105LabAns3;

import java.util.ArrayList;

/**
 * Created by mmcalvarez on 4/26/2017.
 */
public class Mean {

    Mean(){

    }

    public double getMean(ArrayList<Integer> list){
        Double sum = 0.0;

        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum/list.size();
    }
}
