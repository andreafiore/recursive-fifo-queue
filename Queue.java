public class Queue {
    
    private Integer item;
    private Queue head;
    private Queue tail;
    
    public Queue(int item) {
        this.item = item;
        head = this;
        tail = null;
    }
    
    
    public void add(int item) {
        Queue newItem = new Queue(item);
        if (this.tail == null) {
            this.tail = newItem;
        }
        else 
            this.tail.add(item);
    }
    
    public Integer poll() {
        Integer n = this.item;
        this.head = this.tail;
        this.tail = this.tail != null ? this.tail.tail : null;
        this.item = this.head != null ? this.head.item : null;
        return n;
    }
    
    public String toString() {
        return "[ " + printItems() + " ]";
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