import java.util.Scanner;

public class ending_zeroes_in_factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        for (int i = 5 ; n/i >=1 ; i*=5) {
            count+=n/i;
        }
        System.out.println(count);

    }
}
