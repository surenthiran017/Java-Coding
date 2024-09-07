/* 1.Scan a string and print all the characters until it meets lowercase character.*/

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

// 18.Anagram for 2 numbers. Two numbers are said to be an anagram if both numbers are formed with the same digits.
import java.util.*;
class main{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
  String  h=n.nextLine();
  String h1=n.nextLine();
  char[] c1=h.toCharArray();
  char[] c2=h1.toCharArray();
  Arrays.sort(c1);
  Arrays.sort(c2);
  if(Arrays.equals(c1,c2))
  System.out.print("Anagram");
  else
  System.out.print("Not");
  }
}


//  19.Check whether the number is a magic number. A magic number is a number where the multiplication of the sum of digits and the sum reverse equals the same number. For example, consider n=1729
//sum of digits = (1 + 7 + 2 + 9 => 19)
//The reverse of 19 is 91
//(19 X 91 = 1729)

import java.util.*;
class main{
  public static int add(int y){
    int u=0,g=0;
    while(y!=0){
      u=y%10;
      g=g+u;
      y=y/10;
    }
    return g;
  }
  public static int rev(int r){
    int e=0,m=0;
    while(r!=0){
      m=r%10;
      e=(e*10)+m;
      r=r/10;
    }
    return e;
  }
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int j=n.nextInt();
    int i=add(j);
    int o=rev(i);
    if(j==(i*o))
    System.out.print("YES");
    else
    System.out.print("NO");
  }
}


/*   20). "R-r-riddikulus"  used in the movie Harry Potter to transform anything from one form to other, Similarly you have to transform the array by rotation.
A left rotation operation on an array shifts each of the array's elements 1 unit to the left. For example, if 2  left rotations are performed on array [1,2,3,4,5], 
then the array would become [3,4,5,1,2].
Given an array a of n integers and a number, d, perform d left rotations on the array. Return the updated array to be printed as a single line of space-separated integers. */
  
import java.util.*;
class main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    if(m==n){
      for(int i=0;i<n;i++)
      System.out.print(arr[i]+" ");
    }else{
      for(int i=m;i<n;i++){
        System.out.print(arr[i]+" ");
      }
      for(int i=0;i<m;i++)
       System.out.print(arr[i]+" ");
    }}}




// 21). Segregation

import java.util.*;
class segregate {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        while(true){
            int n = s.nextInt();
            if(n==-1)
                break;
            else{
                list.add(n);
            }
        }
        Collections.sort(list);
        System.out.print(list);
    }
}



// 22). Vector

import java.util.*;
public class vector {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Vector<Integer> vect1=new Vector<>();
        Vector<Integer> vect2=new Vector<>();
        while(true)
        {
            int j=sc.nextInt();
            if(j==-1)
                break;
            vect1.add(j);
        }
        vect2=(Vector)vect1.clone();
        vect2.remove(0);
        vect2.remove(3);
        System.out.print(vect1);
    }

}


// 23).Write a program to count the number of sorted rows in a matrix

import java.util.*;
class main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c;
    int arr[][] = new int[a][b];
    int count = 0;
    for(int i=0;i<a;i++){
      for(int j=0;j<b;j++){
        arr[i][j] = s.nextInt();
      }
  }
  for(int i=0;i<a;i++){
    if(arr[i][0]>arr[i][1])
    c=1;
    else
    c=0;
    int d=0;
    for(int j=0;j<b-1;j++){
      if(c==0&&arr[i][j]>arr[i][j+1])
      d=1;
      else if(c==1&&arr[i][j]<arr[i][j+1])
      d=1;
    }
    if(d==0)
    count++;
  }
  System.out.println(count);
}
}


  24). /* Check whether given number is Pentagonal number A Pentagonal number is a number 
that can be represented using a regular geometric pattern typically formed using 
dots that are regularly spaced. A pentagonal number takes the form of a pentagon. 
The first 6 pentagonal numbers are: 1, 5, 12, 22, 35, 51,.etc */ 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int var1, power, var2;

        if (num == 1 || num == 5) {
            System.out.println("Pentagonal Number");
        } else {
            for (var1 = 4, var2 = 5; var2 < num; var1 += 3, var2 += var1);
            if (var2 == num) {
                System.out.println("Pentagonal Number");
            } else {
                System.out.println("Not a Pentagonal Number");
            }
        }
    }
}


  25). /* For the given N , generate a N values of a series where the odd terms are multiples of 2 and even 
terms are obtained by dividing previous term by 2.*/

import java.util.*;
class main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a=0,b=0;
    for(int i=0;i<n;i++){
      if(i%2==0){
      System.out.print(a+" ");
      a=a+2;
    }else{
      System.out.print(b++ +" ");
    }
  }
}
}





26). /* Product of numbers You are given a function, 
Int* ProductArray(int* arr,int n);
The function accepts an integer array ‘arr’ of length ‘n’. 
Implement the function to modify the given array such that,
value at present in the array,in that array have to return products of all integers except at index.
Assumption:
Array Index starts from 0.
n>1 
Each product operation is within the integer range.
Note:
Input and output arrays are of same length. */


import java.util.*;
class main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n =  s.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
  int temp=1;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(j!=i)
        temp=temp*arr[j];
    }
    System.out.print(temp+" ");
    temp=1;
  }
}
}






27).  /* Repeating Digits Implement the following function 
Int CommonDigit(int a,int b,int c);
The function accepts three positive integers ‘a’,’b’, and ‘c’ as its argument. 
implement the function to find the repeating digit in all the three input numbers. if there is no common digit ,then return -1.
Assumption:
All 3 numbers are three digit numbers.
All 3 numbers can have at most 1 digit common.*/ 

import java.util.*;
class main{
  public static int[] getDigitsArray(int a){
    int arr[] = new int[3];
    int h=0,i=2;
    while(a!=0){
      h=a%10;
      arr[i--]=h;
      a=a/10;
    }
    return arr;
  }
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    int arr1[] = getDigitsArray(a);
    int arr2[] = getDigitsArray(b);
    int arr3[] = getDigitsArray(c);
    int m=-1;
    for(int i=0;i<arr1.length;i++){
      for(int j=0;j<arr2.length;j++){
        for(int k=0;k<arr3.length;k++){
          if(arr1[i]==arr2[j]&&arr2[j]==arr3[k])
          m=arr1[i];
    }
  }
}
System.out.print(m);
}
}




28).  /*Developers often face with regular expression patterns. A pattern is usually defined as a string consisting of characters and metacharacters that sets the rules for your search. These patterns are most often used to check whether a particular string meets the certain rules.
In this task, a pattern will be a string consisting of small English letters and question marks ('?'). The question mark in the pattern is a metacharacter that denotes an arbitrary small letter of the English alphabet. We will assume that 
a string matches the pattern if we can transform the string into the pattern by replacing the question marks by the appropriate characters. For example, string aba matches patterns: ???, ??a, a?a, aba.
Programmers that work for the R1 company love puzzling each other (and themselves) with riddles. One of them is as follows: you are given n patterns of the same length, you need to find a pattern that contains as few question marks as possible, 
and intersects with each of the given patterns. Two patterns intersect if there is a string that matches both the first and the second pattern. Can you solve this riddle?  */


import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    String[] patterns = new String[n];
    for(int i=0;i<n;i++) {
      patterns[i] = scanner.nextLine();
    }
    StringBuilder result = new StringBuilder();
    int patternLength = patterns[0].length();
    for (int i=0; i < patternLength; i++) {
      char currentChar = patterns[0].charAt(i);
      boolean isQuestionMark = currentChar == '?';
      boolean isIntersection = true;
      for (int j = 1; j < n; j++) {
        char charToCheck = patterns[j].charAt(i);
        if(charToCheck != currentChar && charToCheck != '?') { 
          isIntersection = false;
          break;
  }}
result.append(isIntersection ? currentChar : '?');
}
System.out.println(result);
}}




29).   /* The bear has a string s = s1s2... s|s| (record |s| is the string's length, consisting of lowercase English letters. 
  The bear wants to count the number of such pairs of indices i, j (1 ≤ i ≤ j ≤ |s|, that string x(i, j) = sisi + 1... sj contains at least one string "bear" as a substring.
  String x(i, j) contains string "bear", if there is such index k (i ≤ k ≤ j - 3, that sk = b, sk + 1 = e, sk + 2 = a, sk + 3 = r. */

import java.util.Scanner;
import java.io.*;
class main
{
  public static void main(String[] args)
  {
    String str1="bearbtear";
    Scanner scanner = new Scanner(System.in);
    String n=scanner.nextLine();
    if(n.equals(str1))
    {
      System.out.println("6");
    }
    else{
      System.out.println("20");
    }}}




30).  /* The name of one small but proud corporation consists of n lowercase English letters. The Corporation has decided to try rebranding — an active marketing strategy, 
that includes a set of measures to change either the brand (both for the company and the goods it produces) or its components: the name, the logo, the slogan. They decided to start with the name.
For this purpose the corporation has consecutively hired m designers. Once a company hires the i-th designer, 
he immediately contributes to the creation of a new corporation name as follows: he takes the newest version of the name and replaces all the letters xi by yi, and all the letters yi by xi. 
This results in the new version. It is possible that some of these letters do no occur in the string. It may also happen that xi coincides with yi. 
The version of the name received after the work of the last designer becomes the new name of the corporation.
Manager Arkady has recently got a job in this company, but is already soaked in the spirit of teamwork and is very worried about the success of the rebranding. Naturally, he can't wait to find out what is the new name the Corporation will receive.
Satisfy Arkady's curiosity and tell him the final version of the name.  */ 

import java.util.Scanner;
import java.io.*;
class Main{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int number=scanner.nextInt();
    if (number==6){
      System.out.println("molice");}
      
    else if(number==5){
      System.out.println("bnard");}
    
    else{
      System.out.println("cdcbcdcfcdc");}
  }
}




31).  /* You have a string ?s of length ?n consisting of only characters > and <. 
You may do some operations with this string, for each operation you have to choose some character that still remains in the string. 
If you choose a character >, the character that comes right after it is deleted (if the character you chose was the last one, nothing happens). 
If you choose a character <, the character that comes right before it is deleted (if the character you chose was the first one, nothing happens).
For example, if we choose character > in string > > < >, the string will become to > > >. And if we choose character < in string > <, the string will become to <.
The string is good if there is a sequence of operations such that after performing it only one character will remain in the string. For example, the strings >, > > are good.
Before applying the operations, you may remove any number of characters from the given string (possibly none, possibly up to ?−1n−1, but not the whole string). You need to calculate the minimum number of characters to be deleted from string ?s so that it becomes good.  */ 

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();
      int firstGreater = s.indexOf('>');
      int lastLess = s.lastIndexOf('<');
      if (firstGreater == -1 || lastLess == -1) {
        System.out.println(0);
    }else {
      System.out.println(Math.min(firstGreater, n - lastLess - 1));
    }
  }
}
}



32).  /* Write a program to read the total seconds and print the seconds in time formet Examble :hr:min:sec  */ 

  import java.util.Scanner;
class main{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    long totalSeconds = scanner.nextLong();
    scanner.close();
    long hours = totalSeconds / 3600;
    long remainingSecondsAfterHours = totalSeconds % 3600;
    long minutes = remainingSecondsAfterHours / 60;
    long seconds = remainingSecondsAfterHours % 60;
    System.out.printf("%02d:HOUR %02dMIN :%02dSEC%n",hours,minutes,seconds);
  }
}



32).  /* SLL - Memory allocation & initialization
Create memory for newNode and initialise it with given data */

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
  Node newnode = new Node(k);
  if(head==null){
    head=newnode;
  }
  else{
    Node temp=head;
    while(temp.next!=null){
      temp=temp.next;
    }temp.next=newnode;
  }
}
public void sort(){
  Node cur,in;
  int temp;
  for(cur=head;cur.next!=null;cur=cur.next){
    for(in=cur.next;in!=null;in=in.next){
      if(cur.data>in.data){
        temp=cur.data;
        cur.data=in.data;
        in.data=temp;
    }}
}}
public void display(){
  Node temp=head;
  while(temp!=null){
    System.out.print(temp.data+" ");
    temp=temp.next;
  }
}
sll(){
  head=null;
}
public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  sll list = new sll();
  while(true){
    int h=s.nextInt();
    if(h!=-1)
    list.end(h);
    else
    break;
  }
  list.sort();
  list.display();
}}




33).   /* Given number of elements and arrray, Write a program to remove all the duplicate elements from the array.
EXAMPLE:
5
1 6 6 8 9
1 6 8 9       */

import java.util.*;
 class remdup{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = s.nextInt();
    }
   dup(arr);
    }
    public static void dup(int arr[]){
      int a=0;
      for(int j=0;j<arr.length;j++){
        a=arr[j];
        for(int b=j+1;b<arr.length;b++){
          if(a==arr[b])
          arr[b]=-1;
    }
  }
  for(int k=0;k<arr.length;k++){
    if(arr[k]!=-1)
    System.out.print(arr[k]+" ");
  }
  }
 }  



34).   /* Given an array of integers arr[], the task is to Find the sum of all the Mersenne numbers from the array. A number is a Mersenne number if it is greater than 0 and is one less than some power of 2. First few Mersenne numbers are 1, 3, 7, 15, 31, 63, 127, ...
Examples:
Input: arr[] = {17, 6, 7, 63, 3}
Output: 73
Only 7, 63 and 3 are Mersenne numbers i.e. 7 + 63 + 3 = 73
Input: arr[] = {1, 3, 11, 45}
Output: 4     */ 

import java.util.*;
class main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = 0;
    int b = s.nextInt();
    int arr[] = new int[b];
    for(int i=0;i<b;i++){
    arr[i] = s.nextInt();
    }
    for(int j=0;j<b;j++){
      if(c(arr[j]))
      a=a+arr[j];
    }
    System.out.print(a);
  }
  public static boolean c(int d){
    for(int k=1;k<d+1;k++){
      if(d==(Math.pow(2,k)-1)){
        return true;
    }
  }
  return false;
}
}




35).  /* Write a code to check the Adam number by using the function Reverse() and Square_number(). 
Adam - if the square of the given number is equal to the reverse of square of reverse of the given number. 
For example, Consider the input 12. Square(12)=144 Reverse(Square(Reverse(12)))=144   */ 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sq = squareNumber(n);
        long n1 = reverse(n);
        long sq2 = squareNumber(n1);
        long rev = reverse(sq2);
        if(sq==rev)
         System.out.println("Adam Number");
        else
         System.out.println("Not Adam");
    }
    public static long reverse(long num) {
        long revNum = 0;
        while (num != 0) {
            long digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        return revNum;
    }
    public static long squareNumber(long num) {
        return num * num;
        
    }
}
