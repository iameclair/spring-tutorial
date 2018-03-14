package co.uk.udemy.srpingtuturial.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

    public QuickSortAlgorithm(){
        super();
        System.out.println("Quick sort algorithm");
    }

    @Override
    public int[] sort(int[] array) {
        return array;
    }
}
