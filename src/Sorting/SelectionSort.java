package Sorting;
import java.util.*;
public class SelectionSort {

    static void selectionsort(int[] arr){

        for(int i=0; i<arr.length-1;i++){
            int min =arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp =arr[i];
                    arr[i] =arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr ={1,4,56,67,34,85,5};
        selectionsort(arr);



    }
}
