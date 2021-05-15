package algorithms;

//TODO implement Objects
public class RadixSort{

    RadixSort(){}

    ///////////////////////////////////////////////////////////////////////////
    // Primitives
    ///////////////////////////////////////////////////////////////////////////
    public void sort(int[] arr) {

        sort(arr, 10, amountDigits(arr,10));
    }

    public void sort(long[] arr) {

        sort(arr, 10, amountDigits(arr, 10));
    }

    public void sort(int[] arr, int base) {

        sort(arr, base, amountDigits(arr, base));
    }

    public void sort(long[] arr, int base) {

        sort(arr, base, amountDigits(arr, base));
    }

    public void sort(int[] arr, int base, int digitSize) {
        for (int i = 0; i < digitSize; i++) {
            Sorting.COUNT_SORT.sort(arr, base, i);
        }
    }

    public void sort(long[] arr, int base, int digitSize) {
        for (int i = 0; i < digitSize; i++) {
            Sorting.COUNT_SORT.sort(arr, base, i);
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // Helper-Methods
    ///////////////////////////////////////////////////////////////////////////
    private int amountDigits(long[] arr, int base){

        return (int) (Math.log(getMax(arr)) / Math.log(base))+1;
    }

    private int amountDigits(int[] arr, int base){

        return (int) (Math.log(getMax(arr)) / Math.log(base))+1;
    }

    private int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    private long getMax(long[] arr){
        long max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

}