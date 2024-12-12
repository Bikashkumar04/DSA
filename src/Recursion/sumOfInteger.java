package Recursion;

public class sumOfInteger {
    static int sumOfInt(int n){
        if(n >=0 && n <=9 ){
            return n;
        }
        return sumOfInt(n/10) + n%10 ;
    }

    static int countOfDigit(int n){


        if(n <= 9){
            int count =0;
            return 1;
        }

        return 1+ countOfDigit(n/10);
    }
    public static void main(String[] args) {

        System.out.println(countOfDigit(554));

    }
}
