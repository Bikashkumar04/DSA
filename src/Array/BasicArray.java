package Array;
import java.util.*;

public class BasicArray {

    static void printArray(int[] arr) {
        for (int num :arr) {
            System.out.print(arr[num] + " ");
        }
        System.out.println();
    }

    static int countOccurrences(int[] arr , int x) {

        int count =0;
        for (int j : arr) {
            if (j == x) {
                count++;
            }

        }
        return count;
    }

    static int lastOccurrence(int[] arr , int x) {
        int lastIndex = -1;
        for (int j : arr) {
            if (j == x) {
                lastIndex = j;
                lastIndex++;
            }

        }
        return lastIndex;
    }

    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                return false;
            }

    }
    return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] =sc.nextInt();
        }

        int x = sc.nextInt();

//        System.out.println(countOccurrences(arr,x));
        System.out.println(lastOccurrence(arr,x));
//        System.out.println(isSorted(arr));

        printArray(arr);

    }

    }
