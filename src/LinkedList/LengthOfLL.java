package LinkedList;

import java.sql.SQLOutput;
import java.util.Scanner;



public class LengthOfLL {

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
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        Node head=null;
        while(true){
            n-=1;
            head = LengthOfLL.takeinput();

            int length = LengthOfLL.giveLength(head);
            System.out.println(length);
            if(n==0){
                break;
            }
        }

    }
}
