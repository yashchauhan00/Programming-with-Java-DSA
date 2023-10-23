import java.util.*;

public class LinkedList {

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }



    public static void main(String args[]){
       Node a= new Node(5);
       Node b= new Node(3);
       Node d= new Node(8);
       Node e= new Node(16);

       a.next=b;
       System.out.print(a.data);
  
    }
}
