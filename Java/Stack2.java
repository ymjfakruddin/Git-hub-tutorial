public class Stack2 {
    int [] ar = new int[10];
    int top = -1;

    public static void main(String[] args) {
        Stack2 s1 = new Stack2();
        s1.push(10);
        s1.push(11);
        s1.push(44);
        s1.push(56);
        s1.pop();
        s1.peek();
        s1.isEmpty();
        s1.isFull();
    }
    public void push(int d)
    {
        if(ar.length > 10)// can change to the top instead of hardcpding
        {
            System.out.println("Out of memory");
            return;
        }
        ar[++top] =d;

    }
    public void peek()
    {
        if( top == -1)
        {
            System.out.println("Stack is an empty");
            return;
        }
        System.out.print("It is a Peek method  : ");
        System.out.println(ar[top]);

    }
    public void pop()
    {
        System.out.print("It is a Pop method :");
        System.out.println(ar[top]);
        top--;
    }
    public void isFull()
    {
        if(top == ar.length-1)
        {
            System.out.println("IsFull");
            //eturn;
        }
        else {
            System.out.println("Stack is not full");
        }
    }
    public void isEmpty()
    {
        if(top == -1) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack is not empty");
        }
    }
}
