package LinkedList;

import java.util.Scanner;

public class ReverseTheList {

    public static void reverse(Node head){
        if(head==null){
            return;
        }
        else{
            reverse(head.next);
            System.out.println(head.data);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            Node head=LengthOfLL.takeinput();
            reverse(head);
        }
    }

}
