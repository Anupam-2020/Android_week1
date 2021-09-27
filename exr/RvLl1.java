package exr;






public class RvLl1 {
    
    public static void printList(Node nd) {
        
        while(nd != null){
            
        }
    }


    public static void main (String[] args) {
        
        Node nd = new Node();
        nd.data = 16;
        nd.next = null;

        Node nd1 = new Node();
        nd1.data = 32;
        nd.next = nd;

        Node nd2 = new Node();
        nd2.data = 65;
        nd2.next = nd1;

        Node nd3 = new Node();
        nd3.data = 87;
        nd3.next = nd2;


        printList(nd3);

        Node temp = null;
        temp = nd3.next;
        nd3.next = null;
        nd2.next = nd3;
        
    }
}
