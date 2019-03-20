
import java.io.*; 
   
public class LinkedList { 
  
    Node head; 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    public static LinkedList insert( int data) 
    { 
        Node new_node = new Node(data); 
        new_node next = null; 
  
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            }  
            last.next = new_node; 
        } 
  
        return list; 
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
   	System.out.print("LinkedList: ");  
        while (currNode != null) 
	{ 
        System.out.print(currNode.data + " "); 
	currNode = currNode.next; 
        } 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        
       
  Scanner scan = new Scanner(System.in); 
System.out.println("Enter your choice : ",n);
    int n = Scan.nextInt();
   	switch(n){
                  
             case 1: Insert data;
                    insert(list,data);
             case 2: Delete data;
                     break;
              }
           
        LinkedList list = new LinkedList(); 
  
 
        list = insert(1); 
        list = insert( 2); 
        list = insert(3 ); 
        list = insert( 4); 
        list = insert(5); 
        list = insert( 6); 
        list = insert( 7); 
        list = insert( 8); 
  
        // Print the LinkedList 
        printList(list); 
    } 
} 