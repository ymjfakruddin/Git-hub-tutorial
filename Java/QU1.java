public class QU1 {
   static  int [] arr;
    static int size;
    static int rear = -1;
    static int element_No = -1;
    QU1(int d)
    {
        size = d;
        arr = new int[size];
    }
    public void add(int in)
    {
       // arr = new int[size];
        rear++;
        arr[rear] = in; 

    }
    public void isEmpty()
    {
        if(rear == -1)
        {
            System.out.println("Queue is an empty ");
        }
        else
        {
            System.out.println("Queue is not an empty");
        }
    }
    public void peek()
    {
        int peek = arr[0];
        System.out.println(peek);
    }
public void remove()
{
    int front = arr[0];
    //System.out.println(front);
    for(int i = 0;i<size-1;i++)
    {
        arr[i] = arr[i+1];
    }
    rear--;
    //int element_no = -1;
    // element_no;
    ++element_No;
    System.out.println("Removing the  "+ element_No +" th element in an array "+front);

}
    public static void main(String[] args) {
        QU1 newObject = new QU1(5);
        newObject.add(1);
        newObject.add(4);
        newObject.isEmpty();
        newObject.peek();
        newObject.remove();
        newObject.remove();



    }

}
