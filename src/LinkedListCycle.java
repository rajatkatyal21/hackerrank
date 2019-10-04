public class LinkedListCycle {

    static Node head;

    static class Node {
        int data;
        Node next = null;
        boolean visited;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        LinkedListCycle linkedList = new LinkedListCycle();
        linkedList.push(20);
        linkedList.push(30);
        linkedList.push(40);
        linkedList.push(50);

        linkedList.head.next.next.next = linkedList.head;

        if(detectCycle(head)) {
            System.out.println("loop found");
        } else {
            System.out.println("loop no found");
        }

    }

    private static boolean detectCycle(Node head) {

        while(head != null) {

            if(head.visited) {
                return true;
            }
            head.visited = true;

            head = head.next;
        }

        return false;
    }

    private static void push(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }
}
