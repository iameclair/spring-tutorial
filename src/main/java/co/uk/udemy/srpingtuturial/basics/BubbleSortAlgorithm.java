package co.uk.udemy.srpingtuturial.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {

    public BubbleSortAlgorithm(){
        super();
        System.out.println("Bubble sort algorithm");
    }

    @Override
    public int[] sort(int[] array) {
        return array;
    }
}
