package Sorting;

public class Insertionsort {

    static void insertion(int[] arr){

        for(int i =1;i<arr.length;i++){
            int j =i;
            while(j>0 &&arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] =arr[j-1];
                arr[j-1] =temp;
                j--;
            }

        }


    }
    public static void main(String[] args) {
        int[] arr ={1,3,55,76,35,244,765};
        insertion(arr);
        for(int num :arr){
            System.out.print(num+ " ");
        }
    }
}
