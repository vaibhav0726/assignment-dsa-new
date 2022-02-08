package recursion;

import java.util.Scanner;

public class sum_of_elements {
    public static int sum(int arr[],int start_index,int n){
        if(n==1 ){
            return arr[start_index];
        }
        return arr[start_index]+sum(arr,start_index+1,n-1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(sum(arr,0,n));
    }
}
