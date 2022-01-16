package demonstrateOfQueue;
class QueueArray {
	private static int front, rear, capacity;   
    private static int queue[];   
     
    void Queue(int size) {   
        front = rear = 0;   
        capacity = size;   
        queue = new int[capacity];   
    }    
    static void queueEnqueue(int item)  {   
        if (capacity == rear) {   
            System.out.printf("\nQueue is full\n");   
            return;   
        }   
        else {   
            queue[rear] = item;   
            rear++;   
        }   
        return;   
    }
    static void queueDequeue()  {   
        if (front == rear) {   
            System.out.printf("\nQueue is empty\n");   
            return;   
        }   
        else {   
            for (int i = 0; i < rear - 1; i++) {   
                queue[i] = queue[i + 1];   
            }   
            if (rear < capacity)   
                queue[rear] = 0;   
            rear--;   
        }   
        return;   
    }   
 
    static void queueDisplay()   
    {   
        int i;   
        if (front == rear) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }   
        for (i = front; i < rear; i++) {   
            System.out.printf(" %d , ", queue[i]);   
        }   
        return;   
    }  
    static void queueFront()   
    {   
        if (front == rear) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }   
        System.out.printf("\nFront Element of the queue: %d", queue[front]);   
        return;   
    }   
   }   
      
 public   class Queue {  
       public static void main(String[] args) {     
    	   QueueArray q = new QueueArray();    
        
           System.out.println("Initial Queue:");  
           QueueArray.queueDisplay();  


             
           QueueArray.queueEnqueue(30);   
           QueueArray.queueEnqueue(50);   
           QueueArray.queueEnqueue(70);   
           System.out.println("Queue after Enqueue Operation:");  
           QueueArray.queueDisplay();   
           QueueArray.queueFront();   
           QueueArray.queueEnqueue(90);   
           QueueArray.queueDisplay();   
        
           QueueArray.queueDequeue();   
           QueueArray.queueDequeue();   
           System.out.printf("\nQueue after two dequeue operations:");   
           QueueArray.queueDisplay();    
           QueueArray.queueFront();   
       }   
   }