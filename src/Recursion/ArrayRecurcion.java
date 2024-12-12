package Recursion;

public class ArrayRecurcion {
    static void print_array(int[] arr, int index){
        if(index ==arr.length){
            return;
        }
        System.out.print(arr[index]+ " ");
        print_array(arr,index+1);
    }

    static int maxArray(int[] arr, int index){
        if(index ==arr.length-1){
            return arr[index];
        }

        int smallCase =maxArray(arr,index+1);

        return Math.max(smallCase,arr[index]);
    }

    static int sumOfArray(int[]arr,int index){
        if(index ==arr.length-1){
            return arr[index];
        }

        int smallCase =sumOfArray(arr, index+1);
        return arr[index]+smallCase;
    }
    public static void main(String[] args) {

        int[] arr ={2,3,4};
        System.out.println(sumOfArray(arr,0));

    }
}
