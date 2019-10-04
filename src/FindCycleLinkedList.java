public class FindCycleLinkedList {


    static FindCycleLinkedList head;



    int data;
    boolean visited;
    FindCycleLinkedList next;

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);

        FindCycleLinkedList.head.next.next.next = head;

        System.out.println(detectCycle(head));
    }

    static void push(int data) {
        FindCycleLinkedList node = new FindCycleLinkedList();
        node.data = data;
        node.visited = false;
        node.next = head;

    }

    static boolean detectCycle(FindCycleLinkedList head) {
        while (head.next != null) {
            if(head.visited) {
                return true;
            }
            head.visited = true;
            head = head.next;
        }

        return false;
    }


}
