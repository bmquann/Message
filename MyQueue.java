

public class MyQueue {
    private Node front, rear; 
    private int size; 
   
    //Zero argument constructor
    public MyQueue()
    {
      front = null;
      rear = null;
      size = 0;
    }
   
    public boolean isEmpty()
    {
      return (size == 0);
    }
   
    //Remove item from the beginning of the list.
    public String dequeue()
    {
      String item = front.data;
      front = front.next;
      if (isEmpty()) 
      {
        rear = null;
      }
      size--;
      return item;
    }
   
    //Add item to the end of the list.
    public void enqueue(String item)
    {
      Node oldRear = rear;
      rear = new Node(item);
      rear.data = item;
      rear.next = null;
      if (isEmpty()) 
      {
        front = rear;
      }
      else 
      {
        oldRear.next = rear;
      }
      size++;
    }
   
    public int size()
    {
      return size;
    }
  }

