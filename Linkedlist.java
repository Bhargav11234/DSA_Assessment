import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Section 2
// Reverse a Linked List in Groups of K 

public class Linkedlist {
    public static Node reverseInGroups(Node head, int k) {
        if (head == null || k <= 1) 
        return head;  // No need to reverse if the list is empty or k is 1

        Node current = head;
        Node prevTail = null;
        Node newHead = null;

        while (current != null) {
            Node groupHead = current;
            Node prev = null;
            Node next = null;
            int count = 0;

            // Reverse the group of k nodes
            while (current != null && count < k) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }

            // Connect the reversed group with the previous part
            if (newHead == null) {
                newHead =prev;  
            }
            if (prevTail != null) {
                prevTail.next = prev;  
            }

            prevTail = groupHead;  
        }

        return newHead;
    }

    
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(80);

        System.out.print("Linked List Before Reverse: ");
        int k = sc.nextInt();
        printList(head);

    
        Node newHead = reverseInGroups(head, k);

        System.out.println("\nLinked List after Reverse in groups of " + k + ":");
        printList(newHead);
    }
}
