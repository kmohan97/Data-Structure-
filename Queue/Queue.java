/**
 * Created by mohan on 9/10/2017.
 * Operations performed by Queue
 * Queue q=new Queue();
 q.push();
 q.count()
 q.traverse();
 q.pop();
 */
import java.util.*;

class Node
{
    int data;
    Node next;
}

public class Queue
{
    static int i;
    static Node starter;
    static Node first;
    static Node last;
    public int get()
    {
        Scanner ss=new Scanner(System.in);
        return ss.nextInt();
    }


    public int count()
    {
        Node temp=starter;
        int c=1;
        while(temp.next!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }

    public void push()
    {
        Node temp1=new Node();
        System.out.println("Enetr the value");
        temp1.data=get();
        if(i==0)
        {
            i++;

            starter=temp1;
            first=temp1;
            last=temp1;
        }
        else{
            Node temp=last;
            temp.next=temp1;
            last=temp1;
        }
    }


    public void traverse()
    {
        Node temp=starter;
        while(true)
        {
            System.out.println(temp.data);
            if(temp.next==null)
                break;
            temp=temp.next;
        }
    }

    public void pop()
    {
        Node temp=first;
        first=first.next;
        starter=starter.next;
        temp.next=null;
    }


}
