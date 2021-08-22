

public class MyStack {
    Node head;
    int size;

    public MyStack() {
        head = null;
        size = 0;
    }

    /* check stack is empty */
    public boolean isEmpty() {
        return head == null;
    }

    /* push an element to the stack */
    public void push(String data) {
        if (isEmpty())
            head = new Node(data);
        else {
            Node currNode = head;
            head = new Node(data);
            head.data = data;
            head.next = currNode;
        }
        size++;
    }

    /* pop an element from the stack */
    public String pop() {
        if (head == null) {
            return null;
        }
        String value = head.data;
        head = head.next;
        size--;
        return value;
    }

    /* check the top element of the stack */
    public String peek() {
        if (isEmpty())
            System.out.println("Underflow Exception");
        return head.data;
    }

    /* display the status of the stack */
    public void display() {
        System.out.print("\nStack = ");
        if (size == 0) {
            System.out.print("Empty\n");
            return;
        }
        Node cur = head;
        while (cur != null) {

            System.out.print("  <--  " + cur.data);
            cur = cur.next;
        }
        System.out.println();
    }

}
