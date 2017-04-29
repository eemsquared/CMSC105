package CMSC105LabAns3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by mmcalvarez on 4/29/2017.
 */
public class Median {
    private int middle = 0;

    Median(){

    }

    public void getMedian(ArrayList<Integer> list, ArrayList<Double> list1, int choice){
        switch (choice){
            case 1 :
                if (list.size() % 2 != 0){
                    middle = (list.size()/2) + 1;
                    System.out.println("[Median] " + list.get(middle - 1));
                }else{
                    middle = list.size()/2;
                    int one = list.get(middle - 1);
                    int two = list.get(middle);
                    double sum = (one + two) / 2.0;
                    System.out.println(sum);
                }
                break;

            case 2 : //pag double ang array
                break;
        }

    }
}
