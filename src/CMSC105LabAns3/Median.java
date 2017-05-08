package CMSC105LabAns3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Median {
    private int middle = 0;

    Median(){

    }

    public void getMedian(List<Object> list, int choice){

        switch (choice){
            case 1 :

                int temp;
                for (int j = 0; j < list.size(); j++){
                    for (int i = 0; i<list.size()-1; i++){
                        if ((int) list.get(i) > (int) list.get(i+1)){
                            temp = (int) list.get(i);
                            list.set(i, list.get(i+1));
                            list.set(i+1, temp);
                        }
                    }
                }
                break;

            case 2 :
                double temporary;
                for (int j = 0; j < list.size(); j++){
                    for (int i = 0; i<list.size()-1; i++){
                        if ((double) list.get(i) > (double) list.get(i+1)){
                            temporary = (double) list.get(i);
                            list.set(i, list.get(i+1));
                            list.set(i+1, temporary);
                        }
                    }
                }
                break;
        }
    	
    	if (list.size() % 2 != 0){
            middle = (list.size()/2) + 1;
            System.out.println("[Median] " + list.get(middle - 1) + "\n");
        }
    	else{
        	middle = list.size()/2;
        	
        	if(choice == 1){
        		int one = (int) list.get(middle - 1);
                int two = (int) list.get(middle);
                double sum = (one + two) / 2.0;
                System.out.println(sum);

        	}
        	else{
        		double one = (double) list.get(middle - 1);
                double two = (double) list.get(middle);
                double sum = (one + two) / 2.0;
                System.out.println(sum);
        	}
            
        }
        
    }
}
