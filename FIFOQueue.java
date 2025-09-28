public class FIFOQueue<T> {
    
    private T item;
    private FIFOQueue<T> head;
    private FIFOQueue<T> tail;
    
    public FIFOQueue(T item) {
        this.item = item;
        head = this;
        tail = null;
    }
    
    /*
        Adds a new element to the queue;
    */
    public void add(T item) {
        FIFOQueue<T> newItem = new FIFOQueue<T>(item);
        if (this.tail == null) {
            this.tail = newItem;
        }
        else 
            this.tail.add(item);
    }
    
    /*
        Returns but not removes the first element of the queue
    */
    public T peek() {
        return this.item;
    }
    
    /*
        Returns and removes the first element of the queue.
    */
    public T poll() {
        T n = this.item;
        this.head = this.tail;
        this.tail = this.tail != null ? this.tail.tail : null;
        this.item = this.head != null ? (T)this.head.item : null;
        return n;
    }
    
    /*
        Returns a string representation of the queue
    */
    public String toString() {
        return "[" + printItems() + "]";
    }
    
    private String printItems() {
        if (tail == null)
            if (item == null)
                return "";
            else
                return String.valueOf(item);
        else
            return String.valueOf(item) + ", " + this.tail.printItems();
    }
    
    
} 