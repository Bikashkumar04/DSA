package Array;

public class SubArray {
    static void loop3(int arr[] ){
        //starting point
        for(int i=0; i<arr.length;i++){
            //ending point
            for(int j=0;j<arr.length;j++){

                for(int k =i;k<=j;k++){
                    System.out.print(arr[k]+"");
                }
                System.out.println();
            }
        }

    }

    static void lood2(int arr[]){
        for(int i=0; i<arr.length;i++){

        }
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        loop3(arr);


    }
}
