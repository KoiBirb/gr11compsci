import java.util.Arrays;
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] randomInt = new int[100];
        double[] randomDouble = new double[100];
        char[] randomChar = new char[100];

        for (int i = 0; i < randomInt.length; i++){
            randomInt[i] = random.nextInt(100);
            randomDouble[i] = random.nextDouble(100);
            randomChar[i] = (char) (random.nextInt(26) + 'a');
        }

        System.out.println("Unsorted Array: " + Arrays.toString(randomInt));
        System.out.println("Sorted Array: " + Arrays.toString(mergeSort(randomInt)));

        System.out.println("Unsorted Array: " + Arrays.toString(randomDouble));
        System.out.println("Sorted Array: " + Arrays.toString(mergeSort(randomDouble)));

        System.out.println("Unsorted Array: " + Arrays.toString(randomChar));
        System.out.println("Sorted Array: " + Arrays.toString(mergeSort(randomChar)));
    }

    public static double[] mergeSort (double[] arr){
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;
        double[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        double[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left, right);
    }

    public static double[] merge (double[] left, double[] right){
        double[] temp = new double[left.length + right.length];
        int leftCounter = 0, rightCounter = 0, currentValue = 0;

        while (leftCounter < left.length && rightCounter < right.length){
            if (left[leftCounter] < right[rightCounter]){
                temp[currentValue] = left[leftCounter];
                leftCounter++;
            } else {
                temp[currentValue] = right[rightCounter];
                rightCounter++;
            }
            currentValue++;
        }

        while (leftCounter < left.length){
            temp[currentValue] = left[leftCounter];
            leftCounter++;
            currentValue++;
        }

        while (rightCounter < right.length){
            temp[currentValue] = right[rightCounter];
            rightCounter++;
            currentValue++;
        }

        return temp;
    }

    public static int[] mergeSort (int[] arr){
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left, right);
    }

    public static int[] merge (int[] left, int[] right){
        int[] temp = new int[left.length + right.length];
        int leftCounter = 0, rightCounter = 0, currentValue = 0;

        while (leftCounter < left.length && rightCounter < right.length){
            if (left[leftCounter] < right[rightCounter]){
                temp[currentValue] = left[leftCounter];
                leftCounter++;
            } else {
                temp[currentValue] = right[rightCounter];
                rightCounter++;
            }
            currentValue++;
        }

        while (leftCounter < left.length){
            temp[currentValue] = left[leftCounter];
            leftCounter++;
            currentValue++;
        }

        while (rightCounter < right.length){
            temp[currentValue] = right[rightCounter];
            rightCounter++;
            currentValue++;
        }

        return temp;
    }

    public static char[] mergeSort (char[] arr){
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;
        char[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        char[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left, right);
    }

    public static char[] merge (char[] left, char[] right){
        char[] temp = new char[left.length + right.length];
        int leftCounter = 0, rightCounter = 0, currentValue = 0;

        while (leftCounter < left.length && rightCounter < right.length){
            if (left[leftCounter] < right[rightCounter]){
                temp[currentValue] = left[leftCounter];
                leftCounter++;
            } else {
                temp[currentValue] = right[rightCounter];
                rightCounter++;
            }
            currentValue++;
        }

        while (leftCounter < left.length){
            temp[currentValue] = left[leftCounter];
            leftCounter++;
            currentValue++;
        }

        while (rightCounter < right.length){
            temp[currentValue] = right[rightCounter];
            rightCounter++;
            currentValue++;
        }

        return temp;
    }
}