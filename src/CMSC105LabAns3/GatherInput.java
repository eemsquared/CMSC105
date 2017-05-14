package CMSC105LabAns3;

import CMSC105LabAns3.Mean;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GatherInput {
    private String title;
    private int populationSize;
    private int choiceOfFrame;
    private int sampleInt;
    private int choiceOfMeasure;
    private int classInterval;
    private double sampleFloat;
    Scanner sc = new Scanner(System.in);
    List<Object> list = new ArrayList<>();
    List<Double> lowerCL = new ArrayList<>();
    List<Double> upperCL = new ArrayList<>();
    ArrayList<Double> freq = new ArrayList<>();


    public void sampleFrame(int choice){

        do {
            System.out.println("\nPlease enter data size.");
            while (!sc.hasNextInt()) {
                System.out.println("Size is invalid. Enter again.");
                sc.next();
            }
            populationSize = sc.nextInt();
        } while (populationSize <= 0);

        System.out.println("\nPlease enter a brief description about your data.");
        sc.nextLine();
        title = sc.nextLine();

        switch (choice){
            case 1 :
                do {
                    System.out.println("\nEnter type of numerical data:\n1. Integer Data\n2. Floating Point Data");
                    choiceOfFrame = sc.nextInt();

                    if(choiceOfFrame == 1){
                        System.out.println("\nEnter your samples.\n");
                        for(int i = 0; i < populationSize; i++ ){
                            while (!sc.hasNextInt()) {
                                System.out.println("Sample is invalid. Enter again:");
                                sc.next();
                            }
                            sampleInt = sc.nextInt();
                            list.add(sampleInt);
                        }
                    }

                    if(choiceOfFrame == 2){
                        System.out.println("\nEnter your samples.");
                        for(int i = 0; i < populationSize; i++ ){
                            while (!sc.hasNextFloat()) {
                                System.out.println("Sample is invalid. Enter again:");
                                sc.next();
                            }
                            sampleFloat = sc.nextDouble();
                            list.add(sampleFloat);
                        }
                    }

                } while (choiceOfFrame < 1 || choiceOfFrame > 2);

                continueOrEdit();
                getMeasure();

                break;

            case 2 :
                do {
                    try {
                        System.out.println("Input number of class intervals: \n");
                        classInterval = sc.nextInt();
                        break;
                    }
                    catch (Exception e) {
                        System.out.println("Input is invalid");
                        sc.next();
                    }
                } while (true);

                System.out.println("Input Lower Class Limit: \n");
                for (int i = 0; i < classInterval; i++) {
                    while (!sc.hasNextFloat()) {
                        System.out.println("Sample is invalid. Enter again:");
                        sc.next();
                    }
                    lowerCL.add(sc.nextDouble());
                }

                System.out.println("Input Upper Class Limit: \n");
                for (int i = 0; i < classInterval; i++) {
                    while (!sc.hasNextFloat()) {
                        System.out.println("Sample is invalid. Enter again:");
                        sc.next();
                    }
                    upperCL.add(sc.nextDouble());
                }

                System.out.println("Input Frequency column: \n");
                for (int i = 0; i < classInterval; i++) {
                    while (!sc.hasNextFloat()) {
                        System.out.println("Sample is invalid. Enter again:");
                        sc.next();
                    }
                    freq.add(sc.nextDouble());
                }

                double midpoint;
                ArrayList<Double> mid = new ArrayList<>();
                for (int i = 0; i < classInterval; i++) {
                    midpoint = (upperCL.get(i) + lowerCL.get(i))/2;
                    mid.add(midpoint);
                }

                double product; //midpoint x freq
                ArrayList<Double> columnD = new ArrayList<>();
                for (int i = 0; i < classInterval; i++) {
                    product = (mid.get(i) * freq.get(i));
                    columnD.add(product);
                }

                double product2;
                ArrayList<Double> arrayList = new ArrayList<>();
                for (int i = 0; i < classInterval; i++) {
                    product2 = (mid.get(i) * mid.get(i) * freq.get(i));
                    arrayList.add(product2);
                }

                /*for (int i = 0; i < classInterval; i++){
                    System.out.println(lowerCL.get(i) + "-" + upperCL.get(i) +  "\t"+ freq.get(i) + "\t"+
                            mid.get(i) +"\t" + columnD.get(i) + "\t" + arrayList.get(i));
                }*/
                int menu;
            do {
                 menu = 1;

                do {
                    System.out.println("\n1. Mean\n2. Median\n3. Mode\n4. All measures\n5. Back to Menu");
                    while (!sc.hasNextInt()) {
                        System.out.println("Invalid input.");
                        sc.next();
                    }
                    choiceOfMeasure = sc.nextInt();
                } while (choiceOfMeasure < 1 || choiceOfMeasure > 5);

                switch (choiceOfMeasure) {
                    case 1:
                        new Mean().getMean(columnD, freq, mid);
                        break;

                    case 2:
                        System.out.println("No Median\n");
                        break;

                    case 3:
                        new Mode().getMode(freq, lowerCL, upperCL);
                        break;

                    case 4:
                        new Mean().getMean(columnD, freq, mid);
                        System.out.println("No Median\n");
                        new Mode().getMode(freq, lowerCL, upperCL);
                        break;
                    case 5:
                        menu = 0;
                        new Menu();
                        break;
                }
            }while(menu != 0);

        }


    }

    public void continueOrEdit(){
    	int cont = 1;
        int edit = 0;
        int edit2 = 0;
        do{
            System.out.println("\n1. Continue?\n2. Edit?");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input.");
                sc.next();
            }
            edit = sc.nextInt();
            if (edit == 1) {
            	cont = 0;
                DisplayData display = new DisplayData();
                display.diplayTable(list, title);
            }
            else{
            	System.out.println("1. Add Data\n2. Edit Data on Specific Index\n3. Delete Data");
            	while (!sc.hasNextInt()) {
                    System.out.println("Invalid input.");
                    sc.next();
                }
            	edit2 = sc.nextInt();
            	
            	int addInt = 0;
            	double add = 0;
            	int findIndex;
            	int editdata = 0;
            	double editDataDoub = 0;
            	int delete;
            	
            	switch (edit2){
    
                case 1 :
                	System.out.print("Enter data:");
                	if(choiceOfFrame == 1){
                		addInt = sc.nextInt();
                		list.add(addInt);
                	}
                	else{
                		add = sc.nextDouble();
                		list.add(add);
                	}
                	
                    break;
                case 2 :
                	System.out.print("Enter the index of the data you wished to change.");
                	findIndex = sc.nextInt();
                	System.out.print("Enter the new data.");
                	
                	if(choiceOfFrame == 1){
                		editdata = sc.nextInt();
                		list.set(findIndex, editdata);
                	}
                	else{
                		editDataDoub = sc.nextDouble();
                		list.set(findIndex, editDataDoub);
                	}
                	break;
                case 3 :
                	System.out.print("Enter index of data to be deleted.");
                	delete = sc.nextInt();
                	list.remove(delete);
                    break;
            	}
            	
            }
        } while (edit < 1 || edit > 2 || cont == 1);

    }

    public void getMeasure(){
        do {
            System.out.println("\n1. Mean\n2. Median\n3. Mode\n4. All measures");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input.");
                sc.next();
            }
            choiceOfMeasure = sc.nextInt();
        }while (choiceOfMeasure < 1 || choiceOfMeasure > 4);

        switch (choiceOfMeasure){
            case 1 :
                 new Mean().getMean(list, choiceOfFrame);

                break;

            case 2 :
                new Median().getMedian(list, choiceOfFrame);
                break;

            case 3 :
            	new Mode().getMode(list, choiceOfFrame);
                break;

            case 4 :
            	new Mean().getMean(list, choiceOfFrame);
            	new Median().getMedian(list, choiceOfFrame);
            	new Mode().getMode(list, choiceOfFrame);
                break;
        }
    }

}
