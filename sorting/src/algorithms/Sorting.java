package algorithms;

public class Sorting {

    public static final SortingAlgorithm
            SELECTION_SORT              = new SelectionSort(),
            BUBBLE_SORT                 = new Bubblesort(),
            INSERTION_SORT              = new InsertionSort(),
            RECURSIVE_INSERTION_SORT    = new RecursiveInsertionSort();

    public static final CountSort
            COUNT_SORT                  = new CountSort();

    public static final RadixSort
            RADIX_SORT                  = new RadixSort();
}