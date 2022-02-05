package array;

import java.util.Scanner;

class Company{
    int products[];
    int sum;
    public Company(int pro1, int pro2, int pro3) {
        products = new int[3];
        products[0] = pro1;
        products[1] = pro2;
        products[2] = pro3;
        sum=pro1+pro2+pro3;
    }

    public int getSum() {
        return sum;
    }
}

public class SalesMan {
    public static void main(String[] args) {
        Company salesman[]  = new Company[5];
        Scanner s= new Scanner(System.in);
        for (int i = 1; i <= salesman.length; i++) {
            System.out.print("Enter the sales of 3 items sold by salesman "+i+":-");
            salesman[i-1] = new Company(s.nextInt(),s.nextInt(),s.nextInt());
        }
        for (int i = 1; i <= salesman.length; i++) {
            System.out.print("Total sales by Salesman "+i+" = ");
            System.out.println(salesman[i-1].getSum());
        }
    }
}
