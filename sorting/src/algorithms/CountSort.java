package algorithms;

public class CountSort{

    CountSort(){}
    
    public void sort(int[] arr) {
        sort(arr, 10, 0);
    }
    
    public void sort(long[] arr) {

        sort(arr, 10, 0);
    }

    public void sort(int[] arr, int base) {

        sort(arr, base, 0);
    }

    public void sort(long[] arr, int base) {

        sort(arr, base, 0);
    }

    public void sort(int[] arr, int base, int pass) {
        int arrayLength = arr.length;
        int[] counters = new int[base];
        int[] output = new int[arrayLength];

        //Do counters
        for (int i : arr) {
            counters[getNthDigit(i, base, pass)]++;
        }

        //Prefix sum
        for (int i = 1; i < 10; i++)
            counters[i] += counters[i - 1];

        //Put back to output array
        for (int i = arrayLength - 1; i >= 0; i--) {
            output[counters[getNthDigit(arr[i], base, pass)] - 1] = arr[i];
            counters[getNthDigit(arr[i], base, pass)]--;
        }
        System.arraycopy(output, 0, arr, 0, arrayLength);
    }

    public void sort(long[] arr, int base, int pass) {
        int arrayLength = arr.length;
        int[] counters = new int[base];
        long[] output = new long[arrayLength];

        //Do counters
        for (long i : arr) {
            counters[getNthDigit(i, base, pass)]++;
        }

        //Prefix sum
        for (int i = 1; i < 10; i++)
            counters[i] += counters[i - 1];

        //Put back to output array
        for (int i = arrayLength - 1; i >= 0; i--) {
            output[counters[getNthDigit(arr[i], base, pass)] - 1] = arr[i];
            counters[getNthDigit(arr[i], base, pass)]--;
        }
        System.arraycopy(output, 0, arr, 0, arrayLength);
    }

    private int getNthDigit(int number, int base, int n) {
        return (int) ((number / Math.pow(base, n)) % base);
    }

    private int getNthDigit(long number, int base, int n) {
        return (int) ((number / Math.pow(base, n)) % base);
    }

}
