package Recursion;
import java.util.*;
import java.lang.String;
public class StringManipulation {

    static String removeOccurence(String s,int idx){

        if(idx ==s.length()){
            return "";
        }

        String smallAns =removeOccurence(s,idx+1);

        char curr =s.charAt(idx);
        if(curr !='a'){
            return curr+smallAns;
        }else{
         return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String s =sc.nextLine();
        System.out.println(removeOccurence(s,0));


    }
}
