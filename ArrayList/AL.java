public class AL{

	private int[] data;
	private int size;

	public AL(){
		this.data = new int[2];
		this.size = 0;
	}

	public void add(int val){
	    if(this.size == this.data.length){
	        resize();
	    }
		this.data[size] = val;
		this.size++;
	}

	public void resize(){
		int[] temp = new int[this.size + 1];
		System.arraycopy(this.data,0,temp,0,this.size);
		this.data = temp;
	}
	
	public String toString(){
	    String rep = "";
	    for(int val : this.data){
	        rep = rep + val +" ";  
	    }
	    return rep;
	}

	public static void main(String[] args) {
        AL myList = new AL();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println(myList);
    }
}