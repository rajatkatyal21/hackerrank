package linkedList;


public class SinglyLinkedListNodeList {

    static SinglyLinkedListNode head;

    static class SinglyLinkedListNode {

        int data;
        SinglyLinkedListNode next = null;

        SinglyLinkedListNode(int data) {
            this.data = data;
        }
    }

    private static void push(int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {

        SinglyLinkedListNodeList singlyLinkedListNode = new SinglyLinkedListNodeList();

        singlyLinkedListNode.push(7);
        singlyLinkedListNode.push(13);
        singlyLinkedListNode.push(16);

        int data = 1;
        int position = 2;

        SinglyLinkedListNode head = insertNodeAtPosition(SinglyLinkedListNodeList.head, data, position);

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode temp = head;

        SinglyLinkedListNode previousNode = null;

        int currentPosition = 0;
        while (head!= null) {

            if(position == currentPosition) {
                SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
                previousNode.next = new_node;
                new_node.next = head;
                head = new_node;
            }
            previousNode = head;
            currentPosition++;
            head  = head.next;
        }

        head = temp;

        return head;
    }


}
