
public class TransactionQueue {
	
	/* Fields */
	private Transaction first;
	
	/* Constructor */
	TransactionQueue(Transaction[] transArray){
		this.first = null;
		for (Transaction t : transArray)
			this.enqueue(t);
	}
	
	
	/* Methods */
	public void enqueue(Transaction t){
		if (this.first == null){
			this.first = t;
		}
		else{
			Transaction currentTransaction = this.first;
			while (currentTransaction.getNext() != null){
				currentTransaction = currentTransaction.getNext();
			}
			currentTransaction.setNext(t);
			t.setNext(null);
			//System.out.println("Adding Transaction " + t.getCounter());
		}
	}
	
	
	public void dequeue() {
		this.first.setNext(first);
	}
	
	
	/* Method that execute pending transactions in queue and return the transaction "t" to library */
	 public Transaction execute(){
	     if (this.first == null) {
		 return null;
	     }     
	     Transaction t = this.first;
	     if (t.getBook().getAvailable_copies() > 0){
		 t.getBook().setAvailable_copies(t.getBook().getAvailable_copies()-1) ;
		 t.getBook().setTimes_rent(t.getBook().getTimes_rent()+1);
		 dequeue();
		 System.out.println(t.toString() + "The transaction executed.\n");
		 return t;
	     } else {
		 enqueue(t);
		 dequeue();
		 System.out.println(t.toString() + "The transaction does not executed.\n");
		 return null;
	     }
	 }
	 
	 public int getQueueSize(){
	     int counter = 0;
	     if (this.first == null) {
		    return 0;
	     }
	     Transaction t = this.first;
	     do {
		    t = t.getNext();
		    counter++;
		} while (t != null);
	     return counter;
	 }
	 
	 public void print() {
		if (this.first == null) {
		    System.out.println("Empty History List");
		    return;
		}
		Transaction t = this.first;
		for (int i=0;i<getQueueSize();i++){
		    System.out.println(t.toString());
		    t = t.getNext();
		}
	 }
	 
	
//	 public void print() {
//		if (this.first == null) {
//		    System.out.println("Empty Pending List");
//		    return;
//		}
//		Transaction t = this.first;
//		do {
//		    System.out.println(t.toString());
//		    t = t.getNext();
//		} while (t != null);
//	 }
	 
	 
}
