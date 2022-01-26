package recursion;

import java.util.Scanner;

public class printing_1_to_n {
    public static void print(int n){
        if(n==0){
            System.out.print(0+" ");
            return;
        }
        else if(n==1){
            System.out.print(1+" ");
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        print(n);
    }
}
