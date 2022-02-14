package LinkedList;

import java.util.Scanner;


class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

public class PrintMiddle {

    public static Node takeinput(){
        Scanner s= new Scanner(System.in);
        int data=s.nextInt();
        Node head= null;
        Node tail=null;
        while(data!=-1){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
            data=s.nextInt();
        }
        return head;
    }

    public static int giveLength(Node head){
        int count=0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static int middle(Node head){
        int len = (PrintMiddle.giveLength(head)-1)/2;
        Node temp = head;
        int count = 0;

        while(count<len){
            head = head.next;
            count++;
        }

        return head.data;


    }


    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            Node head=LengthOfLL.takeinput();
            System.out.println(PrintMiddle.middle(head));
        }
    }
}
