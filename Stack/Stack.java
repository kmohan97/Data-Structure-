
/**
 * Created by mohan on 8/28/2017.
 * @Time:5:30pm
 * Operations of this Stack
 * Stack s=new Stack();
 * s.push()-to insert data
 * s.pop()-to remove top one
 * s.traverse()-to print all elements
 * s.count()-to find length of Stack
 */




import java.util.*;
class Node
{
    int data;
    Node next;
}
public class Stack
{
    static Node starter;
    static Node top;
    static int i;

    public static int get()
    {
        Scanner ss=new Scanner(System.in);
        return ss.nextInt();
    }


    public static int count()
    {
        Node temp;
        temp=starter;
        int c=1;
        if(starter==null)
            return 0;
        else
        {
            while(temp.next!=null)
            {
                c++;
                temp=temp.next;
            }
            return c;
        }
    }


    public void push()
    {
        Node temp1=new Node();

        if(i==0)
        {
            i++;
            System.out.println("Enter the data");
            temp1.data=get();
            top=temp1;
            starter=temp1;
        }
        else{
            Node temp=top;
            System.out.println("Enter the data");
            temp1.data=get();
            temp.next=temp1;
            top=temp1;
        }
    }


    public void traverse()
    {
        Node temp=starter;
        int cd[]=new int[count()];
        int j=0;
        while(true)
        {
            cd[j]=temp.data;
            j++;
//System.out.println(temp.data);

            if(temp.next==null)
                break;
            temp=temp.next;
        }
        System.out.println("\n");
        for(int i=count()-1;i>=0;i--)
        {
            System.out.println(cd[i]);
        }
    }

    public void pop()
    {
        Node temp=starter;
        Node temp2=starter.next;
        while(temp2.next!=null)
        {
            temp=temp.next;
            temp2=temp2.next;
        }


        top=temp;

        temp.next=null;
        System.gc();

    }

}
