package recursion;

import java.util.Scanner;

public class Search_Element {
    public static int search(int arr[],int currentIndex,int search_value){
        if(arr[currentIndex]==search_value){
            return currentIndex;
        }
        return search(arr,currentIndex+1,search_value);
    }

    public static void main(String[] args)  {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int search=s.nextInt();
        try{
            System.out.println("founded at index:- "+search(arr,0,search));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Element not found");
        }

    }
}
