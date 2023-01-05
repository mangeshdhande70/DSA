package LinkedList.SinglyLinkedList.Basics;

public class Node {

    Object data;
    Node nextNode;

    Integer index;

    public  Node(Object data , Node nextNode){
        this.data = data;
        this.nextNode = nextNode;
    }

    public Node(Object data){
        this.data = data;
    }

    public Node(Object data, Integer index) {
        this.data = data;
        this.index = index;

    }

}
