package array;

import java.util.Scanner;

public class remove_consecutive_duplicate_elements {

    public static int getDuplicate(int arr[], int n){
        if(n==0 || n==1){
            return n;
        }
        int j=0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[n-1];
        return j;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int new_length=getDuplicate(arr,n);
        for (int i = 0; i < new_length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
