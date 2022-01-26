package array;

import java.util.Scanner;

public class product_of_pair_is_odd_or_not {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i <n-1; i++) {
            if((arr[i]*arr[i+1])%2!=0){
                System.out.println(arr[i]+" & "+arr[i+1]);
            }
        }
    }
}
