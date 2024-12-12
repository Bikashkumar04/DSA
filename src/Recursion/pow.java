package Recursion;

public class pow {

    static int pow_pq(int p,int q){
        if (q ==0){
            return 1;
        }
        return pow_pq(p,q-1)*p;
    }

    static int alt(int p,int q){
        if(q ==0) return 1;

        if(q%2 ==0){
            int smallpow = alt(p,q/2);
            return smallpow*smallpow;
        }
        else {
            int smallPow = alt(p,q/2);
            return p*smallPow*smallPow;

        }
    }
    public static void main(String[] args) {
        System.out.println(alt(2,3));

    }
}
