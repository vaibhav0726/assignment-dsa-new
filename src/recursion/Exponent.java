package recursion;

import java.util.Scanner;

public class Exponent {
    public static int give_exponent(int m, int n){
        if(n==0){
            return 1;
        }
        return m*give_exponent(m,n-1);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        System.out.println("Answer = "+give_exponent(m,n));
    }
}
