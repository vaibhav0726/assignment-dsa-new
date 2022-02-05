package recursion;

import java.util.Scanner;

public class Number_of_digits {

    public static int find(int n){
        if(n/10==0){
            return 1;
            
        }
        return 1+find(n/10);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(find(n));
    }
}
