package recursion;
import java.util.Scanner;

public class ElementPresentOrNot {

    public static boolean isPresent(int arr[], int val, int index){
        if(arr.length==index){
            return false;
        }
        if(arr[index]==val){
            return true;
        }
        else{
            return isPresent(arr, val , index+1);
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int val = s.nextInt();
        if(isPresent(arr, val, 0)) System.out.println("Element is present");
        else System.out.println("Element is not present");
    }
}
