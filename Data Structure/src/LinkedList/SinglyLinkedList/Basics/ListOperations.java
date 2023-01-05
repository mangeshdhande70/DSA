package LinkedList.SinglyLinkedList.Basics;

public class ListOperations {
     Node head = null;

     public void add(Object data){

         Node newNode = null;

         if (data instanceof Integer)
             newNode = new Node((Integer) data);
         if (data instanceof String)
             newNode = new Node((String) data);

         newNode.nextNode = null;

         if (head == null)
                 head = newNode;

         else {
                 Node head1 = head;
                 while (head1.nextNode != null)
                     head1 = head1.nextNode;

                 head1.nextNode = newNode;
             }
         }


     public void add(Object data , Integer index){

         Node newNode = null;

         if (data instanceof Integer)
             newNode = new Node((Integer) data, index);
         if (data instanceof String)
             newNode = new Node((String) data, index);


         if (head == null)
             addAtFirst(data);

         else{
             Node head1 =head;

             for (int i = 0; i < index-1 ; i++)
                  head1 = head1.nextNode;

             newNode.nextNode = head1.nextNode;
             head1.nextNode = newNode;
         }

     }

    public void addAtFirst(Object data){

         Node newNode = null;
        if (data instanceof Integer)
            newNode = new Node((Integer) data);
        if (data instanceof String)
            newNode = new Node((String) data);

        head = newNode;
        newNode.nextNode = null;

        System.out.println("head.nextNode :: "+head.nextNode);
        System.out.println("head :: "+head);
        System.out.println("newNode :: "+newNode);
        System.out.println();

    }

    public void addLast(Object data){

        Node newNode = null;
        if (data instanceof Integer)
            newNode = new Node((Integer) data);
        if (data instanceof String)
            newNode = new Node((String) data);

        newNode.nextNode = null;

        if (head == null)
                head = newNode;
        else {
                Node head1 = head;

                while (head1.nextNode != null)
                    head1 = head1.nextNode;

                head1.nextNode = newNode;
            }
        }


    public void remove(){
         head = head.nextNode;
    }

    public void remove(Integer index){

         Node head1 = head;
        for (int i = 0; i < index-1 ; i++) {
            head1 = head1.nextNode;
        }
        head1.nextNode = head1.nextNode.nextNode;

    }

    public void remove(Object data){

         Node head1 = head;
         while (head1.nextNode !=null){
             if (data == (head1.nextNode.data)){
                 head1.nextNode= head1.nextNode.nextNode;
                 break;
             }
             head1 = head1.nextNode;
         }


    }


    public  void println() {
        Node head1 = head;
        System.out.print("\n[");
        while (head1.nextNode != null){
            System.out.print(head1.data+",");
            head1 = head1.nextNode;
        }
        System.out.print(head1.data+"]");

    }


}
