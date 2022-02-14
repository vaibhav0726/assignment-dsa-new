package LinkedList;

import java.util.Scanner;

public class Palindrome {

    public static Node reverseList(Node temp){
        Node current = temp;
        Node prevNode = null, nextNode = null;

        //Swap the previous and next nodes of each node to reverse the direction of the list
        while(current != null){
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        return prevNode;
    }

    public static boolean isPalindrome(Node head){
        Node current = head;
        boolean flag=true;
        int size = (LengthOfLL.giveLength(head))/2;
        int mid = (size%2 == 0)? (size/2) : ((size+1)/2);

        for(int i=1; i<mid; i++){
            current = current.next;
        }

        Node revHead = reverseList(current.next);

        while(head != null && revHead != null){
            if(head.data != revHead.data){
                flag = false;
                break;
            }
            head = head.next;
            revHead = revHead.next;
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t = s.nextInt();
        while(t-- >0){
            Node head = LengthOfLL.takeinput();
            System.out.println(isPalindrome(head));

        }
    }

}
