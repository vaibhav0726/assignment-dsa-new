package LinkedList;

import java.util.Scanner;

public class PrintIthNodeData {

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

    public static int giveThePosData(Node head, int index){
        for (int i = 0; i < index; i++) {
            head= head.next;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        Node head=null;
        while(true){
            n-=1;

            head = PrintIthNodeData.takeinput();
            int index=s.nextInt();

            int pos = giveThePosData(head , index);
            System.out.println(pos);

            if(n==0){
                break;
            }
        }

    }
}
