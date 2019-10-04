package linkedList;

public class DoublyLinkedListNodeList {

    static DoublyLinkedListNode head;

    static class DoublyLinkedListNode {

        int data;
        DoublyLinkedListNode next = null;
        DoublyLinkedListNode prev = null;

        DoublyLinkedListNode(int data) {
            this.data = data;
        }
    }

    private static void push(int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if (head != null) {
            head.prev = newNode;
        }
        newNode.next = head;
        newNode.prev = null;
        head = newNode;
    }

    public static void main(String[] args) {

        DoublyLinkedListNodeList singlyLinkedListNode = new DoublyLinkedListNodeList();

        singlyLinkedListNode.push(3);
        singlyLinkedListNode.push(2);
        singlyLinkedListNode.push(1);

        int data = 4;

        DoublyLinkedListNode head = sortedInsert(DoublyLinkedListNodeList.head, data);

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }

    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode temp = head;

        DoublyLinkedListNode previousNode = null;
        while (head != null) {
            if (head.data >= data) {
                DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
                newNode.next = head;
                newNode.prev = previousNode;

                head.prev = newNode;
                if (previousNode != null) {
                    previousNode.next = newNode;
                } else {
                    temp = newNode;
                }
                break;
            } else if (head.next == null) {
                DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
                newNode.next = null;
                newNode.prev = head;
                head.next = newNode;
                break;
            }

            previousNode = head;
            head = head.next;
        }

        head = temp;
        return head;
    }

}
