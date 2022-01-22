package array;

import java.util.Arrays;
import java.util.Scanner;

class Find_Duplicate{
    int arr[];
    public Find_Duplicate(){
        arr = new int[10];
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
    }
    public void getDuplicate(){
        boolean already[]=new boolean[arr.length];
        Arrays.fill(already,false);
        for (int i = 0; i < arr.length; i++) {
            if(already[i]==true){
                continue;
            }

            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]==arr[i]){
                    System.out.print(arr[i]+" duplicates occurs at indexes:- "+j+" ");
                    already[j]=true;
                }
            }
            System.out.println("");
        }
    }
}

public class Duplicate {
    public static void main(String[] args) {
        Find_Duplicate dup = new Find_Duplicate();
        dup.getDuplicate();
    }
}
