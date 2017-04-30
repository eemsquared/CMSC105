package CMSCConsoleLabAns3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Median {
    private int middle = 0;

    Median(){

    }

    public void getMedian(List<Object> list, int choice){
    	
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
