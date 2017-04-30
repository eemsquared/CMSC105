package CMSCConsoleLabAns3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Mode {

	Mode(){

    }

    public void getMode(List<Object> list, int choice){
        Double sum = 0.0;
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
    	        }
    }
}
