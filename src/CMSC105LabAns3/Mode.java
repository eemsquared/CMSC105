package CMSC105LabAns3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Mode {

	Mode(){

    }

    public void getMode(List<Object> list, int choice) {
        /*Double sum = 0.0;
        int compareValue;
        List list2 = new ArrayList<>();
        List groupList = new LinkedList<>();
        List mode = new ArrayList<>();
        List strata = new ArrayList<>();      
          
            	for(int i = 0; i < list.size(); i++){
            		list2.add(list.get(i));
            	}
            	
            	Collections.sort(list2);
            	
    	        compareValue = 0;
    	        for(int i = 0; i < list2.size(); i++){
    	        	if(!(list2.get(i).equals(list2.get(compareValue)))){
    	        		groupList.add(list2.subList(compareValue, i));
    	        		compareValue = i;
    	        	}
    	        	if( i == list2.size()-1){
    	        		groupList.add(list2.subList(compareValue, i+1));
    	        	}
    	        }
    	        
    	        for(int i = 0; i < groupList.size(); i++){
    	        	strata = (List) groupList.get(i);
    	        	if(strata.size() > 1){
    	        		mode.add(strata.get(0));
    	        	}
    	        }
                
    	        if(mode.size() == 1){
    	        	System.out.println("[Mode]	[" + mode.get(0) + "] - Unimodal");
    	        }
    	        else if(mode.size() == 2){
    	        	System.out.println("[Mode]	[" + mode.get(0) + " " + mode.get(1) + "] - Bimodal");
    	        }
    	        else if(mode.size() == 0){
    	        	System.out.println("No mode.");
    	        }
    	        else if(mode.size() > 2){
    	        	System.out.println("[Mode]	["); 
    	        	for(int i = 0; i < mode.size(); i++){
    	        		System.out.println(" " + mode.get(i));
    	        	}
    	        	System.out.println("] - Multimodal"); 
    	        }
    	        else{
    	        	System.out.println("juju");
    	        }*/

		ArrayList mode = new ArrayList();


		if (choice == 1){
			for (int i = 0; i < list.size(); i++){
				boolean flag = false;
				int value = (int) list.get(i);
				for (int j = i+1; j < list.size(); j++){
					if ((int) list.get(j) == value){
						flag = true;
						break;
					}
				}
				if (flag && !mode.contains(list.get(i))){
					mode.add(list.get(i));
				}
			}

		} else {
			for (int i = 0; i < list.size(); i++){
				boolean flag = false;
				double value = (double) list.get(i);
				for (int j = i+1; j < list.size(); j++){
					if ((double) list.get(j) == value){
						flag = true;
						break;
					}
				}
				if (flag && !mode.contains(list.get(i))){
					mode.add(list.get(i));
				}
			}
		}

		if (mode.size() == 1){
			System.out.println("Mode: " + mode + " --> Unimodal\n");
		}
		if (mode.size() == 2){
			System.out.println("Mode: " + mode + " --> Bimodal\n");
		}
		if (mode.size() > 2){
			System.out.println("Mode: " + mode + " --> Multimodal\n");
		}
		if (mode.isEmpty()){
			System.out.println("Mode: No mode\n");
		}

	}

	public void getMode(ArrayList<Double> freq, List<Double> lower, List<Double> upper) {
		double max = 0;

		for (int i = 0; i < freq.size(); i++) { //get the maximum
			if (freq.get(i) > max) {
				max = freq.get(i);
			}
		}
		for (int i = 0; i < freq.size(); i++){
			if (max == freq.get(i)){

				System.out.println("Modal Class/es: " + lower.get(i) + " - " + upper.get(i));
			}
		}
	}
}
