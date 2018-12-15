package Laboratory2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CMSC105Lab2 {
    private int choice;
    private GetInput input = new GetInput();
    private List<Object> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public static void main (String[]args){
        CMSC105Lab2 lab = new CMSC105Lab2();
        lab.run();
    }

    private void run(){

        do {
            System.out.println("\tSUMMARIZING AND PRESENTING DATA\n" +
                    "1. Categorical\n" +
                    "2. Numerical\n" +
                    "3. Quit\n" +
                    "Enter choice: ");
            choice = sc.nextInt();
        }while (choice < 1 || choice > 3);

        switch (choice){
            case 1 :
                input.sampleFrame(choice);
                break;
            case 2 :
            case 3 :
                System.exit(0);


        }
    }
}
