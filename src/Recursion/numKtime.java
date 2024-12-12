package Recursion;

public class numKtime {
    static void num_K_time(int num,int k){
        if(k ==1){
            System.out.println(num);
            return;
        }
        num_K_time(num,k-1);
        System.out.println(num * k);
    }
    static int seriesOfnum(int num){
        if (num == 0){
            return 0;
        }
        if(num%2 ==0){
            return seriesOfnum(num -1) -num;
        }
        else {
            return seriesOfnum(num -1)+num;
        }

    }
    public static void main(String[] args) {
        System.out.println(seriesOfnum(6));


    }
}
