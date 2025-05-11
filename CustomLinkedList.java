/**
 * A custom implementation of a singly linked list with generic type elements.
 * This class demonstrates fundamental linked list operations and serves as a
 * learning tool for data structures.
 * 
 * @param <T> the type of elements held in this list
 */
public class CustomLinkedList<T> {
    
    /**
     * Node class represents each element in the linked list.
     * Each node contains data and a reference to the next node.
     */
    private class Node {
        T data; // The data stored in this node
        Node next; // Reference to the next node in the list
        
        /**
         * Constructs a new Node with the specified data.
         * 
         * @param data the data to be stored in this node
         */
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head; // Reference to the first node in the list
    private int size; // Tracks the number of elements in the list
    
    /**
     * Constructs an empty linked list.
     */
    public CustomLinkedList() {
        head = null;
        size = 0;
    }
    
    /**
     * Adds a new element to the end of the list.
     * Time Complexity: O(n) where n is the size of the list
     * 
     * @param data the element to add
     */
    public void add(T data) {
        // Create a new node with the given data
        Node newNode = new Node(data);
        
        // If the list is empty, the new node becomes the head
        if (head == null) {
            head = newNode;
        } else {
            // Otherwise, traverse to the end of the list
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            // Link the new node at the end
            current.next = newNode;
        }
        
        // Increment the size
        size++;
    }
    
    /**
     * Adds a new element to the beginning of the list.
     * Time Complexity: O(1)
     * 
     * @param data the element to add
     */
    public void addFirst(T data) {
        // Create a new node with the given data
        Node newNode = new Node(data);
        
        // Set the new node's next to the current head
        newNode.next = head;
        
        // Update the head to be the new node
        head = newNode;
        
        // Increment the size
        size++;
    }
    
    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present.
     * Time Complexity: O(n) where n is the size of the list
     * 
     * @param data the element to be removed
     * @return true if the element was found and removed, false otherwise
     */
    public boolean remove(T data) {
        // If the list is empty, nothing to remove
        if (head == null) {
            return false;
        }
        
        // Special case: removing the head
        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }
        
        // Traverse the list to find the element
        Node current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }
        
        // If we found the element
        if (current.next != null) {
            // Remove the node
            current.next = current.next.next;
            size--;
            return true;
        }
        
        // Element not found
        return false;
    }
    
    /**
     * Returns true if this list contains the specified element.
     * Time Complexity: O(n) where n is the size of the list
     * 
     * @param data element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
    public boolean contains(T data) {
        // Traverse the list to find the element
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        
        // Element not found
        return false;
    }
    
    /**
     * Displays all elements in the list.
     * Time Complexity: O(n) where n is the size of the list
     */
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
    
    /**
     * Returns the number of elements in this list.
     * 
     * @return the number of elements in this list
     */
    public int size() {
        return size;
    }
    
    /**
     * Returns true if this list contains no elements.
     * 
     * @return true if this list contains no elements
     */
    public boolean isEmpty() {
        return head == null;
    }
    
    /**
     * Main method with example usage of the CustomLinkedList.
     */
    public static void main(String[] args) {
        // Create a new linked list of Integers
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        
        // Add elements to the end of the list
        System.out.println("Adding elements to the end of the list...");
        list.add(10);
        list.add(20);
        list.add(30);
        list.display(); // List: 10 -> 20 -> 30
        
        // Add elements to the beginning of the list
        System.out.println("\nAdding elements to the beginning of the list...");
        list.addFirst(5);
        list.display(); // List: 5 -> 10 -> 20 -> 30
        
        // Check if an element exists
        System.out.println("\nChecking if elements exist...");
        System.out.println("Contains 20: " + list.contains(20)); // true
        System.out.println("Contains 100: " + list.contains(100)); // false
        
        // Remove elements
        System.out.println("\nRemoving elements...");
        System.out.println("Remove 20: " + list.remove(20)); // true
        list.display(); // List: 5 -> 10 -> 30
        
        System.out.println("Remove 100: " + list.remove(100)); // false
        list.display(); // List: 5 -> 10 -> 30
        
        // Display size
        System.out.println("\nList size: " + list.size()); // 3
        
        // Create a linked list of Strings
        System.out.println("\nCreating a linked list of Strings...");
        CustomLinkedList<String> stringList = new CustomLinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.addFirst("Java");
        stringList.display(); // List: Java -> Hello -> World
    }
}

