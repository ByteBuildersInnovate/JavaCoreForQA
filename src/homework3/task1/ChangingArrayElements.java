package homework3.task1;

import java.util.Arrays;

public class ChangingArrayElements {
    public static void main(String[] args) {

        Integer arr1[] = {1,2,3,4,5,6,7};
        String arr2[] = {"A", "B", "C", "D"};
        swap(arr1,1,5);
        swap(arr2,0,2);

    }
    public static void swap(Object[] arr, int n1, int n2) {
        System.out.println("Массив до изменений: " + Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = sw;

        System.out.println("Массив после изменений: " + Arrays.toString(arr));
    }
}


