package co.uk.udemy.srpingtuturial.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**Transform BinarySearchImpl into a bean*/


@Component
public class BinarySearchImpl {



    /** dependency */
    @Autowired
    private SortAlgorithm sortAlgorithm;


    public int binarySearch(int [] numbers, int key){
        int [] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println("Search logic goes here");

        return sortedNumbers[3];

    }

    public SortAlgorithm getSortAlgorithm() {
        return sortAlgorithm;
    }

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
}
