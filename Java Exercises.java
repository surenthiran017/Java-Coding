// 1.Scan a string and print all the characters until it meets lowercase character.

import java.util.*;
class main{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    String str=n.nextLine();
    StringBuilder d=new StringBuilder();
    for(char ch:str.toCharArray()){
      if(Character.isLowerCase(ch)){
    break;}d.append(ch);
    }
  System.out.print(d.toString());}
}



// 2.Given two strings, write a code to compare two strings to check and say equal or not. 
import java.util.*;
class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    if(str1.equals(str2))
    {
      System.out.print("Equal");
    }
    else
    {
      System.out.print("Not Equal");
    }
  }
}


// 3.Write a program to implement strupr function.
import java.util.*;
class main{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    String d=n.nextLine();
    System.out.print(d.toUpperCase());}}



// 4.Given number of elements , array and K value, Find the minimum number of Swaps required to get elements less then K and  greater elements on the right  side.
import java.util.*;
class main{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
  int h=n.nextInt();
  int arr[]=new int[h];
  for(int i=0;i<h;i++){
    arr[i]=n.nextInt();
  }
  int k=n.nextInt();
  int count=0;
  for(int i=0;i<h;i++){
    if(arr[i]<=k)
    count++;
  }
  int a=0;
  for(int i=0;i<count;i++){
    if(arr[i]>k)
    a++;
  }
    int swap=a;
    for(int i=0;i<h;i++){
      if(arr[i]>k)
      a--;
      if(arr[i]>k)
      a++;
    swap=Math.min(swap,a);}
    System.out.print(swap);
  }
}


// 5.Write a program to check whether the given array of elements are in a Monotonic order or Not.
import java.util.*;
class main{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int h=n.nextInt();
    boolean t=false;
    int arr[]=new int[h];
    for(int i=0;i<h;i++){
      arr[i]=n.nextInt();
    }
    if(arr[0]>arr[1]){
      for(int j=1;j<h;j++){
  if(arr[j-1]>arr[j]){
  t=true;
  }
  else{
  t=false;
    break;
  }
    }}
    else{
      for(int y=1;y<h;y++){
   if(arr[y-1]<arr[y]){
     t=true;
   }else{
     t=false;break;
   }
    }}
    if(t){
      System.out.print("Monotonic");
    }
    else{
      System.out.print("Not Monotonic");
    }
  }
}


// 6.Write a program to check whether the given array of elements are in a Bitonic order or Not.
import java.util.*;
class main{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
   int h=n.nextInt();
   int arr[]=new int[h];
   for(int i=0;i<h;i++){
     arr[i]=n.nextInt();
   }
    boolean is=check(arr,h);
    if(is)
    System.out.print("Bitonic");
    else
    System.out.print("Not Bitonic");
  }public static boolean check(int[] arr,int h){
    int i=1;
    while(i<h&&arr[i]>arr[i-1]){
      i++;
    }if(i==1||i==h){
      return false;
    }
    while(i<h&&arr[i]<arr[i-1]){
      i++;
    }
    return i==h;
  }}


// 7.Write a program to reverse a string except the special characters.
import java.util.*;
class main{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    String s=n.nextLine();
    String str="";
    String str2="";
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      if(Character.isLetter(c))
      str=c+str;
    }int y=0;
    for(int j=0;j<s.length();j++){
      char f=s.charAt(j);
      if(Character.isLetter(f))
      {
      f=str.charAt(y);y++;}
      str2=str2+f;  
    }
    System.out.print(str2);
  }
}


// 8.Write a program to convert the digits in the string into a single number.
import java.util.*;
class main{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    String s=n.nextLine();
    int r=0;
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      if(Character.isDigit(c)){
      r=(r*10)+(c-'0');}
    }System.out.print(r);
  }
}



// 9.Write a program to print the values from 1 to n except multiples of 4. 
Use continue statement to skip 4.
import java.util.*;
class main{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int h=n.nextInt();
    for(int i=1;i<=h;i++){
      if(i%4==0)
      continue;
      else
      System.out.print(i+" ");      
    }
  }}


// 10.Accept an integer N and generate the first N terms of the fibonacci series.
import java.util.*;
class main{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int h=n.nextInt();
    int p=0,pe=0,f=1;
    for(int i=0;i<h;i++){
      System.out.print(f+" ");
      p=f;
      f=f+pe;
      pe=p;     
    }}}


// 11.Check whether the given number is a triangular number.
import java.util.*;
class main{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int h=n.nextInt();
    int  i=0;
   while(h>0){
      h=h-i;
      i++;
    }
    if(h==0)
    System.out.print("Triangular Number");
    else
    System.out.print("Not a Triangular Number");
  }
}


// 12.Complete the function second_half_reverse(). Function will recieve a starting of address of a linked list . Do reverse the second half of the given singly linked list.
import java.util.*;
class sll{
  Node head;
  class Node{
    int data;
    Node next;
    Node(int val){
      data=val;
      next=null;
    }
  }
  public void end(int k){
    Node newnode=new Node(k);
    if(head==null)
    head=newnode;
    else{
      Node temp=head;
      while(temp.next!=null){
    temp=temp.next;}temp.next=newnode;
  }}
  public int count(){
    Node temp=head;int c=0;
    while(temp!=null){
      c++;
      temp=temp.next;
    }return c;
  }
  public void rev(){
    Node temp=head;
  int g=count()/2;
  int e=count()%2;
    int i=0;
    if(e==0){
    while(i<g){
      System.out.print(temp.data+" ");
      i++;
      temp=temp.next;
    }
    Node cur=temp;
    Node prev=null;
    while(cur!=null){
      Node nex=cur.next;
      cur.next=prev;
      prev=cur;
      cur=nex;
    }
    head=prev;
    Node f=head;
    while(f!=null){
      System.out.print(f.data+" ");
      f=f.next;
    }}else{while(i<=g){
      System.out.print(temp.data+" ");
      i++;
      temp=temp.next;
    }
      Node cur=temp;
      Node prev=null;
      while(cur!=null){
    Node nex=cur.next;cur.next=prev;prev=cur;cur=nex;}head=prev;
      Node f=head;
      while(f!=null){
System.out.print(f.data+" ");
f=f.next;
    }}
  }
  sll(){
    head=null;
  }
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    sll list=new sll();
    int r=0;
    while(true){
      r=n.nextInt();
      if(r==-1)
     { break;}
      list.end(r);
    }
  list.rev(); 
  }
}


// 13.Complete the function find_mid_point(). Function will recieve a starting of address of a linked list. Do find the midpoint of the given singly linked list and return it.
import java.util.*;
class sll{
  Node head;
  class Node{
    int data;
    Node next;
    Node(int val){
      data=val;
      next=null;
    }
    }
    public void end(int k){
      Node newnode=new Node(k);
      if(head==null)
      head=newnode;
      else{
      Node temp=head;
      while(temp.next!=null){
  temp=temp.next;
    }temp.next=newnode;}}
    sll(){
      head=null;
    }
    public int count(){
      Node temp=head;
      int u=0;
      while(temp!=null){
  temp=temp.next;u++;  }
  return u;
      }
  public void find(){
    Node temp=head;
    int i=0;
    int y=count()/2;
    while(i<y-1){
      temp=temp.next;i++;
    }
    System.out.print(temp.data);
  }
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    sll list=new sll();
    int j;
    while(true){
      j=n.nextInt();
      list.end(j);
      if(j==-1)
      break;
    }
    list.find();
  }}


// 14.Complete the function kth_last_node(). Function will recieve a starting of address of a linked list and a k value. Do find the kth value from the last fo the given singly linked list and return it.
import java.util.*;
class sll{
  Node head;
  class Node{
    int data;
    Node next;
    Node(int val){
      data=val;
      next=null;
    }
  }
  public void end(int k){
    Node newnode=new Node(k);
    if(head==null)
    head=newnode;
    else{
      Node temp=head;
      while(temp.next!=null){
    temp=temp.next;}temp.next=newnode;}
  }
  
  public void rev(int p){
    Node cur=head;
    Node prev=null;
    while(cur!=null){
      Node next=cur.next;
      cur.next=prev;
      prev=cur;
      cur=next;
    }
    head=prev;
    int i=0;
     Node temp=head;
    while(i<p){
      temp=temp.next;i++;
    }
    System.out.print(temp.data);
  }
  sll(){
    head=null;
  }
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    sll list=new sll();
    int u;
    while(true){
      u=n.nextInt();
      list.end(u);
      if(u==-1)
      break;
    }
    int p=n.nextInt();
    list.rev(p);
  }
}



// 15.Anagram for 2 numbers. Two numbers are said to be an anagram if both numbers are formed with the same digits.
import java.util.*;
class anagram{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String n1 = s.nextLine();
    String n2 = s.nextLine();
    char[] arr1 = n1.toCharArray();
    char[] arr2 = n2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if(Arrays.equals(arr1,arr2)){
      System.out.println("Anagram");
    }
    else{
      System.out.println("Not");
    }
  }
}



// 16.A magic number is a number where the multiplication of the sum of digits and the sum reverse equals the same number.
import java.util.*;
class main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int sum = 0;
    int temp = n;
    while(temp>0){
      sum += temp%10;
      temp /= 10;
    }
    int rev = 0;
    temp = sum;
    while(temp>0){
      rev = rev * 10 + temp%10;
      temp /= 10;
    }
    if(sum * rev == n){
      System.out.println("YES");
    }else{
      System.out.println("NO"); 
    }
  }
}



// 17.Find the frequency of each digit from the given number.
import java.util.*;
class main{
  public static void  main(String[] args){
    Scanner n=new Scanner(System.in);
    long h=n.nextLong();
    long arr[]=new long[10];
    long u=0;int r=0;
    while(h!=0){
      u=h%10;
      r=(int)u;
    arr[r]++;
      h=h/10;
  }
  for(int j=0;j<10;j++){
    System.out.println(j+" occurs "+arr[j]+" times ");
  }
}
}


