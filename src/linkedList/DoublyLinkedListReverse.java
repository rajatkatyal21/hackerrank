package linkedList;

public class DoublyLinkedListReverse {

    static DoublyLinkedListNode head;

    static class DoublyLinkedListNode {
        int data;
        DoublyLinkedListNode next;
        DoublyLinkedListNode prev;

        DoublyLinkedListNode(int data) {
            this.data = data;
            next = null;
            prev = null;
        }

    }

    void push(int data) {
        DoublyLinkedListNode doublyLinkedListNode = new DoublyLinkedListNode(data);
        doublyLinkedListNode.next = head;
        if (head != null) {
            head.prev = doublyLinkedListNode;
        }
        head = doublyLinkedListNode;
    }

    public static void main(String[] args) {
        DoublyLinkedListReverse doublyLinkedListReverse = new DoublyLinkedListReverse();

        doublyLinkedListReverse.push(4);
        doublyLinkedListReverse.push(3);
        doublyLinkedListReverse.push(2);
        doublyLinkedListReverse.push(1);

        reverse(DoublyLinkedListReverse.head);

    }

    private static void reverse(DoublyLinkedListNode head) {

        DoublyLinkedListNode temp = null;
        DoublyLinkedListNode currentNode = head;

        while (currentNode != null) {
            temp = currentNode.prev;
            currentNode.prev = currentNode.next;
            currentNode.next = temp;
            currentNode = currentNode.prev;

        }

        if(temp!= null) {
            head = temp.prev;
        }

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }

}
