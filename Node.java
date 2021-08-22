

public class Node {
    String data;
    Node next;

    public Node(String d) {
        next = null;
        data = d;
    }

    public Node(String d, Node n) {
        data = d;
        next = n;
    }

}