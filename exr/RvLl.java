package exr;

public class RvLl {
    
    
    public static void printList(Node nd) {
        while(nd != null) { // nd2, nd1, nd is not null.
           System.out.println(nd.data); // nd2s data, nd1s data, nds data
           nd = nd.next; // nd = nd2.next = nd1, nd = nd1.next = nd, nd = nd.next = null
        }
    }


    public static void main(String[] args) {
        
        Node nd = new Node(); // you created linkedlist node
        nd.data = 10; // assigned data 10
        nd.next = null; // next of list is null

        Node nd1 = new Node();
        nd1.data = 100;
        nd1.next = nd;

        Node nd2 = new Node();
        nd2.data = 300;
        nd2.next = nd1;

         printList(nd2);
        // Node temp = new Node();
       //  temp = nd2;
       //  while(temp != null){
       //      System.out.println(temp.data);
        //     temp = temp.next;
       //  }

    }
}

