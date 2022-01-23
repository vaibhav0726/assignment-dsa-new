package array;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        ArrayList<Integer> Arr_odd=new ArrayList<>();
        ArrayList<Integer> Arr_even = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0){
                Arr_even.add(arr[i]);
            }
            else{
                Arr_odd.add(arr[i]);
            }
        }
        System.out.println(Arr_even);
        System.out.println(Arr_odd);
    }
}
