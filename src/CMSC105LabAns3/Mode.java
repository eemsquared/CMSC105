package CMSC105LabAns3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Mode {

	Mode(){

    }

    public void getMode(List<Object> list, int choice) {

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
		int counter = 0;

		for (int i = 0; i < freq.size(); i++) { //get the maximum
			if (freq.get(i) > max) {
				max = freq.get(i);
			}
		}
		for (int i = 0; i < freq.size(); i++){
			if (max == freq.get(i)){
				counter++;
				System.out.println("Modal Class/es: " + lower.get(i) + " - " + upper.get(i));
			}
		}
		if (counter == 1){
			System.out.println("--> Unimodal\n");
		}
		if (counter == 2){
			System.out.println("--> Bimodal\n");
		}
		if (counter > 2){
			System.out.println("--> Multimodal\n");
		}
		if (counter == 0){
			System.out.println("--> No mode\n");
		}
	}
}
