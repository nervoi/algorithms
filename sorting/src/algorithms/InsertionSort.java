package algorithms;

public class InsertionSort implements SortingAlgorithm{

    InsertionSort(){}

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while ( (j > -1) && ( arr [j] > key ) ) {
                arr [j+1] = arr [j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    @Override
    public void sort(long[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            long key = arr[i];
            int j = i-1;
            while ( (j > -1) && ( arr [j] > key ) ) {
                arr [j+1] = arr [j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    @Override
    public void sort(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double key = arr[i];
            int j = i-1;
            while ( (j > -1) && ( arr [j] > key ) ) {
                arr [j+1] = arr [j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    @Override
    public void sort(float[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            float key = arr[i];
            int j = i-1;
            while ( (j > -1) && ( arr [j] > key ) ) {
                arr [j+1] = arr [j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
