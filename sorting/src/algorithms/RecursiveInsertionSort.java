package algorithms;

public class RecursiveInsertionSort implements SortingAlgorithm{
    
    @Override
    public void sort(int[] arr) {
        sort(arr, arr.length);
    }

    @Override
    public void sort(long[] arr) {
        sort(arr, arr.length);
    }

    @Override
    public void sort(double[] arr) {
        sort(arr, arr.length);
    }

    @Override
    public void sort(float[] arr) {
        sort(arr, arr.length);
    }

    public void sort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }

        sort(arr, n-1);

        int last = arr[n-1];
        int j = n-2;
        while (j >= 0 && arr[j] > last) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

    public void sort(long[] arr, int n) {
        if (n <= 1) {
            return;
        }

        sort(arr, n-1);

        long last = arr[n-1];
        int j = n-2;
        while (j >= 0 && arr[j] > last) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

    public void sort(double[] arr, int n) {
        if (n <= 1) {
            return;
        }

        sort(arr, n-1);

        double last = arr[n-1];
        int j = n-2;
        while (j >= 0 && arr[j] > last) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

    public void sort(float[] arr, int n) {
        if (n <= 1) {
            return;
        }

        sort(arr, n-1);

        float last = arr[n-1];
        int j = n-2;
        while (j >= 0 && arr[j] > last) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

}
