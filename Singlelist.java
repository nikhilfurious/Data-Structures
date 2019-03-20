import java.lang.*;
import java.io.*;

public class node {
int data ;
node next;
}

public class LinkedList
{
node head;

public void insert(int data)
{
Node node=new Node();
node.next=NULL;

if(head==NULL)
{
head = node;
}
else
{
Node n =head;
while(n.next!=null)
{
n=n.next;
}
n.next = node;
}
}

public void display()
{
while(node.next!=null)
{
System.out.println(node.data);
}
}
}

public class Singlelist
{
public static void main(String[] args)
{
Linkedlist ll = new Linkedlist();
ll.insert(10);
ll.insert(20);
ll.insert(70);
ll.disply();
}
}
