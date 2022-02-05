package recursion;

import java.util.Scanner;

public class DecimalToBinary {

    public static int  giveBinary( int n){
        if(n==0){
            return 0;
        }
        else{
            int rem = n%2;
            return (rem+10*giveBinary(n/2));
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//      int arr[]= new int[32];
        int binary=DecimalToBinary.giveBinary(n);
        System.out.println(binary);
    }
}
