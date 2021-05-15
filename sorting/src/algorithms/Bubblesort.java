package algorithms;

public class Bubblesort implements SortingAlgorithm {

    Bubblesort(){}

    @Override
    public void sort(int[] arr) {
        boolean hadToSwitch;
        do{
            hadToSwitch = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    hadToSwitch = true;
                }
            }
        }while (hadToSwitch);
    }

    @Override
    public void sort(long[] arr) {
        boolean hadToSwitch;
        do{
            hadToSwitch = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    long temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    hadToSwitch = true;
                }
            }
        }while (hadToSwitch);
    }

    @Override
    public void sort(double[] arr) {
        boolean hadToSwitch;
        do{
            hadToSwitch = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    double temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    hadToSwitch = true;
                }
            }
        }while (hadToSwitch);
    }

    @Override
    public void sort(float[] arr) {
        boolean hadToSwitch;
        do{
            hadToSwitch = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    float temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    hadToSwitch = true;
                }
            }
        }while (hadToSwitch);
    }

}
