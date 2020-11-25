public class SLL{
    public static void main(String[] args) {
      
      SLL list = new SLL();
    }
    
    private class Node{
        private int data;
        private Node next;
        
        private Node(int data, Node next){
            
            this.data = data;
            this.next = next;
        }
    }
    
    private Node head;
    private int size;
    
    public SLL(){
      this.head = new Node(0, null);
      this.size = 0;
    }
}