package recursion;

import java.util.Scanner;

public class find_all_occurence {
    public static int[] res(int arr[],int currentIndex,int search_value,int count){
        if(currentIndex== arr.length){
            int []new_arr=new int[count];
            return new_arr;
        }
        if(arr[currentIndex]==search_value){
            int []new_arr=res(arr,currentIndex+1,search_value,count+1);
            new_arr[count]=currentIndex;
            return new_arr;
        }
        else{
            int new_arr[]=res(arr,currentIndex+1,search_value,count);
            return new_arr;
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the search value");
        int search_value=s.nextInt();
        int []result=res(arr,0,search_value,0);
//        try{
//            result=res(arr,0,search_value,0);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Element not found");
//        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }

    }
}
