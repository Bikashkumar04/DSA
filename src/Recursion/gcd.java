package Recursion;

public class gcd {
    static  int gcd_Brute(int n,int m){
        int smaller =Math.min(n,m);
        for (int i =smaller; i>0; i--){
            if ( n%i ==0 && m%i ==0){
                return i;
        }
    }
        return 1;
    }

    static int gcd_longdiv(int n ,int m){
        while (n%m !=0){
            int rem =n%m;
            n =m;
            m =rem;

        }
        return m;
    }

    static int gcd(int n,int m){
        if(m ==0) return n;

        return gcd(m,n%m);
    }
        public static void main(String[] args) {

            System.out.println(gcd(7,11));
        }
        }
