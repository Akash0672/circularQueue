class circularQueue
{
    int capacity;
    int front,rear;
    int arr[];

    circularQueue(int size)
    {
        capacity=size;
        front=-1;rear=-1;
        arr=new int[capacity];
    }

    public void enqueue(int x)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
            System.exit(0);
        }
        rear=(rear+1)%capacity;
        arr[rear]=x;

    }

    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            System.exit(0);
        }
        front=(front+1)%capacity;
        return arr[front];
    }

    public boolean isFull()
    {
        if(front==(front+1)%capacity)
        return true;
        else
        return false;

    }

    public boolean isEmpty()
    {
        if(front==rear)
        return true;
        else
        return false;
    }

    public void displayCircularQueue()
    {
        int i;
        for(i=front;i!=rear+1;i=(i+1)%capacity)
        {
            System.out.print(arr[i]);
        }
        System.out.println(arr[i]);
    }

    public static void main(String[] args) 
    {
        circularQueue cq=new circularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.displayCircularQueue();

    }
}