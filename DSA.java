/* ----->Linked List */

import java.util.*;
public class Linkedlist{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int val){
            data = val;
            next = null;
            prev = null;
        }
    }
    Linkedlist()
    {
        head = null;
        tail = null;

    }

    public void insertbegin(int k){
        Node newnode = new Node(k);
        newnode.next = head;
        if(head == null){
            tail = newnode;
        }
        else{
            tail.prev = newnode;
        }
        head = newnode;
    }
    public void insertposition(int pos,int d){
        Node newnode = new Node(d);
        Node temp = head;
        for(int i =1;i<pos;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next= newnode;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Linkedlist list = new Linkedlist();
        int n = s.nextInt();
        for(int i =0;i<n;i++){
            int val = s.nextInt();
            list.insertbegin(val);
        }
        list.display();
        list.insertposition(3,400);
        list.display();
   }
}




/* ------> Singly LinkedList */

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
// Output  //
/* "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.3\lib\idea_rt.jar=58008:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\suren\IdeaProjects\excep\out\production\excercises sll
10 20 30 40 50 20 30 90 100 -1
10-->20-->30-->40-->50-->20-->30-->90-->100-->Null
10-->20-->30-->14-->40-->50-->20-->30-->90-->100-->Null
10-->20-->30-->14-->40-->50-->20-->30-->90-->100-->100-->Null
20-->30-->14-->40-->50-->20-->30-->90-->100-->100-->Null
20-->30-->40-->50-->20-->30-->90-->100-->100-->Null
20-->30-->40-->50-->20-->30-->90-->100-->Null
100-->90-->30-->20-->50-->40-->30-->20-->Null
Greater node is -->100
Smaller node is -->20
40
element found
20-->20-->30-->30-->40-->50-->90-->100-->Null

Process finished with exit code 0   */







/* -----> Doubly Linked List */

import java.util.*;
class dll{
        Node head;
        Node tail;

        class Node{
            int data;
            Node next;
            Node prev;

            Node(int val){
                data = val;
                next = null;
                prev = null;
            }
        }
        dll(){
            head = null;
            tail =null;
        }

        public void insertbegin(int k) {
            Node newnode=new Node(k);

            if(head==null) {
                tail = newnode;
            }else {
                newnode.next = head;
                head.prev = newnode;
            }
            head = newnode;
        }
        public void insertend(int k){
            Node newnode=new Node(k);
            if(head==null){
                head= newnode;
            }else{
                newnode.prev = tail;
                tail.next = newnode;
            }
            tail = newnode;
        }
        public void insertposition(int pos,int d) {
            Node newnode=new Node(d);
            Node temp=head;
            for(int i=1;i<pos;i++) {
                temp=temp.next;
            }
            newnode.next = temp.next;
            temp.next.prev = newnode;

            temp.next = newnode;
            newnode.prev = temp;
        }
        public void deletebeg(){
            head=head.next;
        }
        public void deleteend(){
            tail=tail.prev;
            tail.next=null;
        }
        public void deletepos(int k){
            Node temp=head;
            Node prev=null;
            for(int i=1;i<k;i++)
            {
                prev = temp;
                temp=temp.next;
            }
            prev.next = temp.next;
        }
    public void sorting() {
        Node crt,in;
        int temp;
        for(crt=head;crt.next!=null;crt=crt.next) {
            for(in=crt.next;in!=null;in=in.next) {
                if(crt.data>in.data) {
                    temp=crt.data;
                    crt.data=in.data;
                    in.data=temp;
                }
            }
        }
    }
    public void duplicate(){
        Node current = head;

        while(current != null && current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current= current.next;
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
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            dll list=new dll();
            while(true){
                int j = s.nextInt();
                if(j==-1){
                    break;
                }else{
                    list.insertend(j);
                }

            }
            list.display();
            list.insertend(100);
            list.display();
            list.insertposition(3,80);
            list.display();
            list.deletebeg();
            list.display();
            list.deleteend();
            list.display();
            list.deletepos(2);
            list.display();
            list.sorting();
            list.display();
            list.duplicate();
            list.display();
        }
    }

-------> /* Output
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.3\lib\idea_rt.jar=58028:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\suren\IdeaProjects\excep\out\production\excercises dll
10 20 30 40 50 60 30 -1
10-->20-->30-->40-->50-->60-->30-->Null
10-->20-->30-->40-->50-->60-->30-->100-->Null
10-->20-->30-->80-->40-->50-->60-->30-->100-->Null
20-->30-->80-->40-->50-->60-->30-->100-->Null
20-->30-->80-->40-->50-->60-->30-->Null
20-->80-->40-->50-->60-->30-->Null
20-->30-->40-->50-->60-->80-->Null
20-->30-->40-->50-->60-->80-->Null

Process finished with exit code 0 */




/* ------>Circular Linked List */

import java.util.*;
class cll {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    cll() {
        head = null;
    }

    public void insertbeg(int a) {
        Node newnode = new Node(a);
        if (head == null) {
            newnode.next = newnode;
            head=newnode;
        } else {
            newnode.next = head.next;
            head.next = newnode;
        }
    }
    public void insertend(int k){
        Node newnode = new Node(k);
            if(head==null){
                newnode.next=newnode;
                head=newnode;
            }else{
                newnode.next=head.next;
                head.next=newnode;
                head=newnode;
            }
        }
   public void position(int pos,int val){
        Node newnode = new Node(val);
        Node temp = head.next;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }newnode.next=temp.next;
        temp.next=newnode;
   }
   public void deletebeg(){
        head.next=head.next.next;
   }
   public void deleteend(){
        Node temp=head.next;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=head.next;
        temp=head;
   }
    public void display() {
        Node temp = head.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head.next);
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        cll list = new cll();
        while (true) {
            int i = s.nextInt();
            if (i == -1) {
                break;
            } else {
                list.insertbeg(i);
            }
        }
        list.display();
        list.insertend(70);
        list.display();
        list.position(3,80);
        list.display();
        list.deletebeg();
        list.display();
        list.deleteend();
        list.display();
    }
}



/* -------> Stack   */

import java.util.*;
class stack {
    Node head;
    Node top;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    stack(){
        head=null;
        top=null;
    }
    public void push(int a){
        Node newnode = new Node(a);
        if(head==null){
            head=newnode;
        }else{
            top.next=newnode;
        }
        top=newnode;
    }
    public void pop(){
        Node temp=head;
        while(temp.next!=top){
            temp=temp.next;
        }
        temp.next=null;
        top=temp;
    }
public void peek() {
        System.out.print(top.data + " ");
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println(top.data+" " );
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        stack list = new stack();
        while(true){
            int i = s.nextInt();
            if(i==-1)
                break;
            else
                list.push(i);
        }
        list.display();
        list.pop();
        list.display();
        list.peek();
    }
}




/* -------> Infix to Postfix   */

import java.util.Stack;
import java.util.Scanner;
class infix{
    public static int precedence(char operator){
        switch(operator){
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static boolean check(char op1, char op2){
        return precedence(op1) >= precedence(op2);
    }

    public static String infixtopost(String n){

        StringBuilder postfix = new StringBuilder();
        Stack <Character> stack = new Stack<>();

        for(int i =0;i<n.length();i++){
            char a = n.charAt(i);

            if (Character.isLetterOrDigit(a)){
                postfix.append(a);
            }
            else if(a == '('){
                stack.push(a);
            }
            else if(a==')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    postfix.append(stack.pop());
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && stack.peek() != '(' && check(stack.peek(),a)){
                    postfix.append(stack.pop());
                }
                stack.push(a);
            }
        }
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        return postfix.toString();

    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        StringBuilder prefix = new StringBuilder();
        String n = s.nextLine();

        String result = infixtopost(n);
        System.out.println(result);
    }
}




/* ------->Infix to prefix   */

import java.util.Stack;
import java.util.*;
class InfixToPre {

    public static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static boolean check(char op1, char op2) {
        return precedence(op1) >= precedence(op2);
    }

    public static String infixToPrefix(String n) {
        StringBuilder rev = new StringBuilder(n).reverse();
        for (int i = 0; i < rev.length(); i++) {
            char c = rev.charAt(i);
            if (c == '(') {
                rev.setCharAt(i, ')');
            } else if (c == ')') {
                rev.setCharAt(i, '(');
            }
        }
        String postfix = infixToPostfix(rev.toString());
        return new StringBuilder(postfix).reverse().toString();
    }

    public static String infixToPostfix(String n) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n.length(); i++) {
            char a = n.charAt(i);

            if (Character.isLetterOrDigit(a)) {
                postfix.append(a);
            } else if (a == '(') {
                stack.push(a);
            } else if (a == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && stack.peek() != '(' && check(stack.peek(), a)) {
                    postfix.append(stack.pop());
                }
                stack.push(a);
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        String result = infixToPrefix(n);
        System.out.println(result);
    }
}






/* ---------> Queue    */

import java.util.Scanner;

class queue{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;
        }
    }
    queue(){
        head = null;
    }
    public void enqueue(int val){
        Node newnode = new Node(val);

        if (head==null){
            head = newnode;
        }
            else{
                Node temp = head;
                while(temp.next != null){
                    temp =  temp.next;
                }
                newnode.next = temp.next;
                temp.next = newnode;
            }
        }

    public void dequeue(){
        head = head.next;
    }
    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null \n");
    }
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        queue q1 = new queue();
        System.out.println("ENQUEUE :");
        while(true) {
            int n = s.nextInt();
            if (n == -1)
                break;
            else {
                q1.enqueue(n);
            }
        }
        q1.dequeue();
        q1.dequeue();
        System.out.println("DEQUEUE :");
        q1.display();
}
}




/* -------> Priority queue  */

import java.util.Scanner;

public class Priorityqueue{
    Node head;

    class Node{
        int data;
        int pri;
        Node next;

        Node(int val, int k){
            data = val;
            pri = k;
            next = null;
        }
    }
    Priorityqueue(){
        head = null;
    }
    public void enqueue(int val, int pri){
        Node newnode = new Node(val,pri);

        if (head==null){
            head = newnode;
        }
        else{
            if (head.pri > pri){
                newnode.next = head;
                head = newnode;
            }
            else{
                Node temp = head;
                while(temp.next != null && temp.next.pri < pri){
                    temp =  temp.next;
                }
                newnode.next = temp.next;
                temp.next = newnode;
            }
        }
    }
    public void dequeue(){
        head = head.next;
    }
    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null \n");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Priorityqueue q1 = new Priorityqueue();
        q1.enqueue(10,2);
        q1.enqueue(20,0);
        q1.enqueue(30,1);
        q1.enqueue(40,3);
        System.out.println("ENQUEUE :");
        q1.display();
        q1.dequeue();
        System.out.println("DEQUEUE :");
        q1.display();
}
}





/* -----> Binary Search Tree */

import java.util.*;
class Node{
    int data;
    Node left,right;

    public Node (int val){
        data = val;
        left = right= null;
    }
}
class bst{
    Node create(int data){
        return new Node(data);
    }
    Node insert(Node root,int val){
        if(root == null){
            return create(val);
        }
        if(val < root.data){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public void preorder(Node root){
        if(root != null){
            System.out.print(root.data+ " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void inorder(Node root){
        if(root != null){
            preorder(root.left);
            System.out.print(root.data+ " ");
            preorder(root.right);
        }
    }
    public void postorder(Node root){
        if(root != null){
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data+ " ");
        }
    }
    public void levelorder(Node root){
        if(root==null){
            System.out.println("Tree is empty");
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            System.out.print(cur.data+" ");
            if(cur.left!=null){
                queue.add(cur.left);
            }
            if(cur.right!=null){
                queue.add(cur.right);
            }
        }
    }
    public  boolean search(Node root,int key) {
        if (root == null) {
            return false;
        }
        if (key == root.data) {
            return true;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        bst t1 = new bst();
        int n = s.nextInt();
        Node root = t1.create(n);
        while (true){
            int val = s.nextInt();
            if(val == -1){
                break;
            }
            t1.insert(root,val);
        }
        System.out.println("prerorder");
        t1.preorder(root);
        System.out.println();
        System.out.println("inorder");
        t1.inorder(root);
        System.out.println();
        System.out.println("postorder");
        t1.postorder(root);
        System.out.println();
        System.out.println("levelorder");
        t1.levelorder(root);
        System.out.println();
        System.out.println("Search element");
        int key = s.nextInt();
        boolean a = t1.search(root,key);
        if(a)
            System.out.println(key+" is found");
        else
            System.out.println("is Not found");
        System.out.print("Height - ");
        int h = t1.height(root);
        System.out.print(h-1);
}
}




/* ------->Breadth first search */

import java.util.ArrayList;
import java.util.*;
class breadth{
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    breadth(int v){
        for(int i =0;i<v;i++){
            list.add(new ArrayList<>());
        }
    }
    public void push(int u , int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public void bfs(int v){
        int n = list.size();
        boolean [] visited = new boolean[n];
        visited[v] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        while(q.size()!=0){
            int m = q.remove();
            System.out.print(m+ " ");
            for(int i =0;i<list.get(m).size();i++){
                int k = list.get(m).get(i);
                if(!visited[k]){
                    q.add(k);
                    visited[k] = true;
                }
            }}}
    public void display(){
        for(int i =0;i<list.size();i++){
            System.out.print("Vertices:"+ i+" ");
            for(int j = 0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        breadth g = new breadth(v+1);
        while(true){
            int a = s.nextInt();
            int b = s.nextInt();
            if(a==-1||b==-1)
                break;
            g.push(a,b);
        }
        g.display();
        System.out.println("BFS");
        g.bfs(0);
    }
}





/* --------> Depth first search  */

import java.util.ArrayList;
import java.util.*;
class depth{
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    depth(int v){
        for(int i =0;i<v;i++){
            list.add(new ArrayList<>());
        }
    }
    public void push(int u , int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public void dfs(int v){
        int l = list.size();
        boolean [] arr = new boolean[l];
        dfs1(v,arr);
    }
    public void dfs1(int v, boolean [] arr){
        System.out.println(v+" ");
        arr[v] = true;

        for(int i=0;i<list.get(v).size();i++){
            int k = list.get(v).get(i);
            if(!arr[k]){
                dfs1(k,arr);
            }
        }
    }
    public void display(){
        for(int i =0;i<list.size();i++){
            System.out.print("Vertices:"+ i+" ");
            for(int j = 0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        depth g = new depth(v+1);
        while(true){
            int a = s.nextInt();
            int b = s.nextInt();
            if(a==-1||b==-1)
                break;
            g.push(a,b);
        }
        g.dfs(3);
        g.display();
    }
}




/* ------>AVL tree    */

import java.util.*;
class TreeNode {
    int data, height;
    TreeNode left, right;

    public TreeNode(int val) {
        data = val;
        left = right = null;
        height = 1;
    }
}
    class avl {
        TreeNode create(int data) {
            return new TreeNode(data);
        }
        int height(TreeNode n) {
            if (n == null)
                return 0;
            return n.height;
        }
        int getBalance(TreeNode n) {
            if (n == null)
                return 0;
            return height(n.left) - height(n.right);
        }
        TreeNode rightRotate(TreeNode y) {
            TreeNode x = y.left;
            TreeNode z = x.right;
            x.right = y;
            y.left = z;
            y.height = Math.max(height(y.left), height(y.right)) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;
            return x;
        }
        TreeNode leftRotate(TreeNode x) {
            TreeNode y = x.right;
            TreeNode z = y.left;
            y.left = x;
            x.right = z;
            x.height = Math.max(height(x.left), height(x.right)) + 1;
            y.height = Math.max(height(y.left), height(y.right)) + 1;
            return y;
        }
        TreeNode insert(TreeNode root, int val) {
            if (root == null) {
                return create(val);
            }
            if (val < root.data) {
                root.left = insert(root.left, val);
            } else if (val > root.data) {
                root.right = insert(root.right, val);
            } else {
                return root;
            }
            root.height = 1 + Math.max(height(root.left), height(root.right));
            int balance = getBalance(root);
            // Left Left
            if (balance > 1 && val < root.left.data)
                return rightRotate(root);

            // Right Right
            if (balance < -1 && val > root.right.data)
                return leftRotate(root);

            // Left Right
            if (balance > 1 && val > root.left.data) {
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }
            // Right Left
            if (balance < -1 && val < root.right.data) {
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }
            return root;
        }
        void preOrder(TreeNode root) {
            if (root != null) {
                System.out.print(root.data + " ");
                preOrder(root.left);
                preOrder(root.right);
            }
        }
        void postOrder(TreeNode root) {
            if (root != null) {
                preOrder(root.left);
                preOrder(root.right);
                System.out.print(root.data + " ");
            }
        }
        public void levelorder(TreeNode root){
            if(root==null){
                System.out.println("Tree is empty");
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                TreeNode cur = queue.poll();
                System.out.print(cur.data+" ");
                if(cur.left!=null){
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    queue.add(cur.right);
                }
            }
        }
        public int leafcount(TreeNode root){
            if(root==null)
                return 0;
            if(root.left==null && root.right==null)
                return 1;
            return leafcount(root.left) + leafcount(root.right);
        }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            avl tree = new avl();
            int n = s.nextInt();
            TreeNode root = tree.create(n);
            while (true) {
                int a = s.nextInt();
                if (a == -1) {
                    break;
                }
                root = tree.insert(root,a);
            }
            tree.preOrder(root);
            System.out.println();
            tree.postOrder(root);
            System.out.println();
            System.out.println("level order ");
            tree.levelorder(root);
            System.out.println();
            int e = tree.leafcount(root);
            System.out.print("leafcount is "+e);
        }
    }





/* ------> Graph  */

import java.util.ArrayList;
import java.util.*;
class Graph{
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    Graph(int v){
        for(int i =0;i<v;i++){
            list.add(new ArrayList<Integer>());
        }
    }
    public void push(int u , int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public void display(){
        for(int i =0;i<list.size();i++){
            System.out.print("Vertices:"+ i+" ");
            for(int j = 0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        Graph g = new Graph(v);
        while(true){
            int a = s.nextInt();
            int b = s.nextInt();
            if(a==-1||b==-1)
                break;
            g.push(a,b);
        }
        g.display();
    }
}
