package Laboratory1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by mmcalvarez on 2/18/2017.
 */
public class SimpleRandomSampling extends GatherInput{
    private int sampleSize;
    private int randomIndex;
    Random random = new Random();
    List<Object> sampleList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public SimpleRandomSampling(){
        title = "RANDOM SAMPLING";
    }

    public List<Object> randomSamples(List<Object> list){
        System.out.println("Please indicate the sample size: ");
        sampleSize = sc.nextInt();
        //System.out.println(list);
        for(int i = 0; i < sampleSize; i++){
            do{
                randomIndex = random.nextInt(list.size() - 1); //0 - size of the list minus 1
            }while(sampleList.contains(list.get(randomIndex)));

            sampleList.add(list.get(randomIndex));
        }
        return sampleList;
    }
}
