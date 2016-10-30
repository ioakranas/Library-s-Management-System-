
public class TransactionHistory {

    /* Fields */
    private Transaction first;

    /* Constructor */
    TransactionHistory(Transaction[] transArray) {
	this.first = null;
	for (Transaction t : transArray)
	    this.add(t);
    }

    /* Methods */
    public void add(Transaction t) {
	if (this.first == null) {
	    this.first = t;
	} else {
	    Transaction currentTransaction = first;
	    while (currentTransaction.getNext() != null) {
		currentTransaction = currentTransaction.getNext();
	    }
	    currentTransaction.setNext(t);
	    t.setNext(null);
	    // System.out.println("Adding Transaction " + t.getCounter());
	}
    }

    public int getHistorySize() {
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
     for (int i=0;i<getHistorySize();i++){
     System.out.println(t.toString());
     t = t.getNext();
     }
     }

//    public void print() {
//	if (this.first == null) {
//	    System.out.println("Empty History List");
//	    return;
//	}
//	Transaction t = this.first;
//	do {
//	    System.out.println(t.toString());
//	    t = t.getNext();
//	} while (t != null);
//    }

}
