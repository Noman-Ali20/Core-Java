package List;import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteNodesGreaterThan(int value) {
        Node current = head;
        Node prev = null;

        while (current != null && current.data > value) {
            head = current.next;
            current = head;
        }

        while (current != null) {
            while (current != null && current.data <= value) {
                prev = current;
                current = current.next;
            }

            if (current == null) {
                return;
            }

            prev.next = current.next;
            current = prev.next;
        }
    }

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}

public class LLTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList linkedList = new LinkedList();

        System.out.print("Enter the number of elements you want to input: ");
        int numberOfElements = scanner.nextInt();

        System.out.println("Enter elements in the range of 1-50 for the linked list:");

        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int input = scanner.nextInt();
            if (input >= 1 && input <= 50) {
                linkedList.insert(input);
            } else {
                System.out.println("Input out of range. Please enter a number in the range of 1-50.");
                i--; // Decrement i to repeat the current iteration.
            }
        }

        System.out.println("Linked List before deleting nodes greater than 25:");
        linkedList.display();

        linkedList.deleteNodesGreaterThan(25);

        System.out.println("Linked List after deleting nodes greater than 25:");
        linkedList.display();
    }
}
