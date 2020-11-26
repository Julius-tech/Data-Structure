public class SLL{
    
    private class Node{
        // A node class is nested within the SLL class//
        // This hold data and reference to the 'next' Node//
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
        // A parameterless constructor//
      this.head = new Node(0, null);
      this.size = 0;
    }

    public SLL(int value){
        // A constructo with only one value //
        this.head = new Node(0, null);
        this.head.next = new Node(value, null); 
        this.size = 1;
    }

    public SLL(int[] arrValue){
        // A constructor that converts array to linkedList//
        this.head = new Node(0, null);
        Node temp = head;
        this.size = 0;
        for(int val : arrValue){
            temp.next = new Node(val, null);
            temp = temp.next;
            this.size++;
        }
    }

    public int getSize(){
        // This returns the number of elements in the list//
        return this.size;
    }

    public void reverseList(){
    	// This reverses the list//
        Node prev = null;
        Node curr = head.next;
        Node next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = new Node(0,prev);
    }

    public String toString(){
        // The String representation of the List//
        String rep = "";
        Node temp = head.next;
        while(temp != null){
            rep = rep + temp.data + " ";
            temp = temp.next;
        }
        return rep;
    }
public class SLL{
    
    private class Node{
        // A node class is nested within the SLL class//
        // This hold data and reference to the 'next' Node//
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
        // A parameterless constructor//
      this.head = new Node(0, null);
      this.size = 0;
    }

    public SLL(int value){
        // A constructo with only one value //
        this.head = new Node(0, null);
        this.head.next = new Node(value, null); 
        this.size = 1;
    }

    public SLL(int[] arrValue){
        // A constructor that converts array to linkedList//
        this.head = new Node(0, null);
        Node temp = head;
        this.size = 0;
        for(int val : arrValue){
            temp.next = new Node(val, null);
            temp = temp.next;
            this.size++;
        }
    }

    public int getSize(){
        // This returns the number of elements in the list//
        return this.size;
    }

    public void reverseList(){
        Node prev = null;
        Node curr = head.next;
        Node next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = new Node(0,prev);
    }

    public String toString(){
        // The String representation of the List//
        String rep = "";
        Node temp = head.next;
        while(temp != null){
            rep = rep + temp.data + " ";
            temp = temp.next;
        }
        return rep;
    }

    public static void main(String[] args) {
      
      SLL list = new SLL();
      SLL list2 = new SLL(1);
      SLL list3 = new SLL(new int[]{1,2});
      System.out.println(list3);
      list3.reverseList();
      System.out.println(list3);
      SLL list4 = new SLL(new int[]{1,0,1});
      System.out.println(list4.binaryToDecimal());
    }

}