
import java.util.Scanner;

/**
 *  TwoWayHeaderList tw=new TwoWayHeaderList();
 *  Operations------
 tw.create();
 tw.traverse();
 tw.insert();
 tw.traverse();
 tw.delete();
 tw.traverse();
 * Created by mohan on 9/12/2017.
 */

class Node{
    Node prev;
    int data;
    Node next;
}
public class TwoWayHeaderList {
static Node start;
public static int get()
{
    Scanner ss=new Scanner(System.in);
     return ss.nextInt();

}

public void create()
{
    Node temp=new Node();

    System.out.println("Enter no.of Nodes");
    int n=get();
    System.out.println("Enter the data");
    temp.prev=null;
    temp.data=get();
    start=temp;
    temp.next=null;
    for(int i=2;i<=n;i++)
    {
        Node temp1=new Node();
        System.out.println("Enter the data");
        temp1.data=get();
        temp.next=temp1;
        temp1.prev=temp;
        temp1.next=null;
        temp=temp1;
        if(i==n)
        {
            temp.next=start;
            start.prev=temp;
        }


    }



}

    public void traverse()
    {
        Node temp;
        temp=start;
        if(temp==null)
        {
            System.out.println("NO object craeted");
        }
        else{
            while(true)
            {
                System.out.println(temp.data);

                if(temp.next==start)
                {
                    break;
                }
                temp=temp.next;
            }
        }
    }


    public void insert()
    {
        System.out.println("Enter the data of node before which you want a new node to be created:-");
        int nn=get();
        Node temp=start;
        Node temp1=temp.next;
        while(true)
        {
            if(temp1.data==nn)
                break;

            temp1=temp1.next;
            temp=temp.next;
        }
            Node t3=new Node();
            System.out.println("Enter the data to be entered");
            t3.data=get();
            temp.next=t3;
            t3.prev=temp;
            t3.next=temp1;
            temp1.prev=t3;


    }

    public static void delete(){
        System.out.println("Enter the data of node to be deleted:-");
        int nn=get();
        Node temp=start;
        Node temp1=temp.next;
        while(true)
        {
            if(temp1.data==nn)
                break;

            temp1=temp1.next;
            temp=temp.next;
        }
        if(temp1==start)
        {
            Node t3=temp1.next;
            temp.next=t3;
            t3.prev=temp;
            start=t3;
            temp1.next=null;
            temp1.prev=null;

        }else{
            Node t3=temp1.next;
            temp.next=t3;
            t3.prev=temp;
//            start=t3;
            temp1.next=null;
            temp1.prev=null;


        }
        System.gc();

    }



public static void main(String asd[])
{
    TwoWayHeaderList tw=new TwoWayHeaderList();
    tw.create();
       tw.traverse();
       tw.insert();
       tw.traverse();
        tw.delete();
        tw.traverse();
}
}
