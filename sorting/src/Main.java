import algorithms.Sorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {12,42,12,3,54,2,34,6,21,23,123,21};

        Sorting.SELECTION_SORT.sort(arr);

        System.out.println(Arrays.toString(arr));

    }

}