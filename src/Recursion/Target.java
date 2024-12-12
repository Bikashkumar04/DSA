package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Target {


    static ArrayList<Integer> allidx(int[] arr,int target,int idx){
        ArrayList<Integer> ans =new ArrayList<>();

        if(idx>= arr.length){
            return ans;
        }

        if(arr[idx]==target) {
            ans.add(idx);
        }

        ArrayList<Integer>smallAns =allidx(arr,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }

    static boolean target(int[] arr, int target, int idx){
        if(idx>=arr.length){
            return false;
        }

        if(arr[idx] == target) return true;

        return  target(arr,target,idx+1);


    }

    static int targetIndex(int[] arr, int target, int idx){
        if(idx>=arr.length){
            return -1;
        }

        if(arr[idx] == target) return idx;

        return  targetIndex(arr,target,idx+1);


    }
    public static void main(String[] args) {
        int[] a ={1,3,4,6,6,7};
        int target =6;

        System.out.println(allidx(a,target,0));


    }
}
