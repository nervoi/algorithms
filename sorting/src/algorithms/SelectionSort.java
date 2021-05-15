package algorithms;

public class SelectionSort implements SortingAlgorithm {

    SelectionSort(){}

    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            int max = arr[0];
            int maxIndex = 0;

            for (int j = 1; j < arr.length-i; j++) {

                if(arr[j]>max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }

            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = max;
            arr[maxIndex] = temp;
        }
    }

    @Override
    public void sort(long[] arr) {
        for (int i = 0; i < arr.length; i++) {

            long max = arr[0];
            int maxIndex = 0;

            for (int j = 1; j < arr.length-i; j++) {

                if(arr[j]>max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }

            long temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = max;
            arr[maxIndex] = temp;
        }
    }

    @Override
    public void sort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {

            double max = arr[0];
            int maxIndex = 0;

            for (int j = 1; j < arr.length-i; j++) {

                if(arr[j]>max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }

            double temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = max;
            arr[maxIndex] = temp;
        }
    }

    @Override
    public void sort(float[] arr) {
        for (int i = 0; i < arr.length; i++) {

            float max = arr[0];
            int maxIndex = 0;

            for (int j = 1; j < arr.length-i; j++) {

                if(arr[j]>max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }

            float temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = max;
            arr[maxIndex] = temp;
        }
    }
}
