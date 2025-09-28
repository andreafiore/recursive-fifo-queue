// Online Java - IDE, Code Editor, Compiler

// Online Java is a quick and easy tool that helps you to build, compile, test your programs online.

// Write your Java code here

public class Main {
  public static void main(String[] args) {
    
    FIFOQueue<Integer> queue = new FIFOQueue<Integer>(5);
    
    queue.add(1);
    queue.add(7);
    queue.add(9);
    
    System.out.println(queue.toString());
    
    int peek = queue.peek();
    System.out.println(queue.peek());
    
    queue.poll();
    System.out.println(queue.peek());
    queue.poll();
    System.out.println(queue.peek());
    queue.poll();
    System.out.println(queue.peek());
    queue.poll();
    
    System.out.println(queue.toString());
    
  }
}
