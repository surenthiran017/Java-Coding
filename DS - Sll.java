/*Singly linkedList */
import java.util.*;
 class sll {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;
        }
    }
    sll(){
        head = null;
    }
    public void insertend(int val){
        Node newnode = new Node(val);

        if (head ==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp= temp.next;
            }
            temp.next = newnode;
        }
    }
    public void insertbegin(int k) {
        Node newnode=new Node(k);
        if(head==null) {
            head=newnode;
        }else {
            newnode.next=head;
            head=newnode;
        }
    }
    public void insertposition(int pos,int d) {
        Node newnode=new Node(d);
        Node temp=head;
        for(int i=0;i<pos;i++) {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public void deletebegin() {
        head=head.next;
    }
    public void deleteposition(int h) {
        Node temp=head;
        Node prev=null;
        for(int i=1;i<h;i++) {
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
    public void deleteend() {
        Node temp=head;
        Node  prev=null;
        while(temp.next!=null) {
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }
    public void rev() {
        Node prev=null;
        Node current=head;
        //Node nex=null;
        while(current!=null) {
            Node nex=current.next;
            current.next=prev;
            prev=current;
            current=nex;
        }
        head=prev;
    }
    public void max() {
        Node temp=head;
        int b=0;
        while(temp!=null) {
            if(b<temp.data)
                b=temp.data;
            temp=temp.next;}System.out.println("Greater node is -->"+b);
    }
    public void min() {
        Node temp=head;
        int m=99;
        while(temp!=null) {
            if(m>temp.data)
                m=temp.data;
            temp=temp.next;}System.out.println("Smaller node is -->"+m);
    }
    public void search(int u) {
        Node temp=head;
        int j=0;
        while(temp!=null) {
            if(temp.data==u) {
                j=1;
                break;}

            temp=temp.next;}
        if(j==0)
            System.out.print("Not found");
        else
            System.out.println("element found");
    }
    public void sort() {
        Node cur,in;
        int temp;
        for(cur=head;cur.next!=null;cur=cur.next) {
            for(in=cur.next;in!=null;in=in.next) {
                if(cur.data>in.data) {
                    temp=cur.data;
                    cur.data=in.data;
                    in.data=temp;
                }

            }
        }
    }

    public void display(){
        Node temp = head;

        while(temp!= null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        sll list = new sll();
        while(true){
            int n = sc.nextInt();
            if(n==-1)
                break;
            else
                list.insertend(n);
        }
        list.display();
        list.insertposition(2, 14);
        list.display();
        list.insertend(100);
        list.display();
        list.deletebegin();
        list.display();
        list.deleteposition(3);
        list.display();
        list.deleteend();
        list.display();
        list.rev();
        list.display();
        list.max();
        list.min();
        int o=sc.nextInt();
        list.search(o);
        list.sort();
        list.display();
	}
 }
