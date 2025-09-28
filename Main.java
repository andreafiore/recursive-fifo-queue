// Online Java - IDE, Code Editor, Compiler

// Online Java is a quick and easy tool that helps you to build, compile, test your programs online.

// Write your Java code here

public class Main {
  public static void main(String[] args) {
    
    Queue queue = new Queue(5);
    
    queue.add(1);
    queue.add(7);
    queue.add(9);
    
    System.out.println(queue);
    
    int poll = queue.poll();
    System.out.println(queue);
    queue.poll();
    System.out.println(queue);
    queue.poll();
    queue.poll();
    System.out.println(queue);
    
  }
}
