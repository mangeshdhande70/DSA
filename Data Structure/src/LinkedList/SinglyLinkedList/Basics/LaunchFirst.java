package LinkedList.SinglyLinkedList.Basics;


public class LaunchFirst {
    public static void main(String[] args) {


           ListOperations li = new ListOperations();

           li.addAtFirst(45);

           li.println();

           li.add(47);

           li.println();

           li.addLast(50);

           li.println();

           li.add(48 , 2);

           li.println();

           li.add("Mangesh" , 2);

           li.println();

           li.remove();

           li.println();

           li.remove(2);

           li.println();

           li.remove("Mangesh");

           System.out.print("\nLast");
           li.println();

    }
}
