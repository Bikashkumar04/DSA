package Recursion;

import java.util.Scanner;

public class basic {

    static void printIncrease(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printIncrease(n-1);
        System.out.println(n);

    }
    static void printDcrease(int n){

    }

    static int sumofDigit( int n){
        if(n >= 0  && n <=9){

            return n;
        }
       return sumofDigit(n/10) + n%10;

    }

    static int pow(int p, int q){
        if( q ==0) return 1;
        return pow(p,q-1) * p;
    }

    static int powalternative(int p,int q){
        if( q ==0) return 1;

        int smallPow =powalternative(p,q/2);

        if(q %2 ==0){
            return smallPow * smallPow;
        }
            return p * smallPow * smallPow;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = powalternative(n,m);

        System.out.println(ans);
    }
}
