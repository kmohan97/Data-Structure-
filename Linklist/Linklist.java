/**
 * U Can use it by creating the object in desired class.
 * Created by mohan on 9/10/2017.
 *  Linklist s=new Linklist();
 s.create();
 s.traverse();
 s.count();
 s.delete();
 s.insert();

 */

import java.util.*;
class Node
{
    int data;
    Node next;
}

public class Linklist
{
    static Node starter;
    Scanner ss=new Scanner(System.in);
    public static int get()
    {
        Scanner ss=new Scanner(System.in);
        return ss.nextInt();
    }

    //To count the no.of NODES int the linked List
    public static int count()
    {
        int count=1;
        if(starter==null)
            return 0;
        else
        {
            Node temp;
            temp=starter;
            while(temp.next!=null)
            {
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    //To create the link list
    public void create()
    {
        System.out.println("Enetr the no. of nodes to be created:-");
        int nn=get();
        Node temp=new Node();
        starter=temp;
        System.out.println("Enetr the data:-");
        temp.data=get();
        for(int i=2;i<=nn;i++)
        {
            temp.next=new Node();
            temp=temp.next;
            System.out.println("Enetr the data:-");
            temp.data=get();
        }
    }
    //Printing all the elements of the Linked List
    public void traverse()
    {
        Node temp;
        temp=starter;
        if(temp==null)
        {
            System.out.println("NO object craeted");
        }
        else{
            while(true)
            {
                System.out.println(temp.data);

                if(temp.next==null)
                {
                    break;
                }
                temp=temp.next;
            }
        }
    }
    //Inserting into specific position
    public void insert()
    {
        System.out.println("Enter the position");
        int pos=get();
        Node temp;
        temp=starter;
        if(pos!=1)
        {
            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            Node temp1=temp.next;
            Node val=new Node();
            System.out.println("DAta is:-");
            val.data=get();
            val.next=temp1;
            temp.next=val;
        }
        else{
            Node val=new Node();
            System.out.println("DAta is:-");
            val.data=get();
            val.next=starter;
            starter=val;
        }
    }



//Deleting from specific location

    public void delete()
    {
        System.out.println("Enter the position");
        int pos=get();
        int c=count();
        Node temp;
        temp=starter;
        System.out.println("Position"+pos);


        if(pos>1 && pos<count())
        {
            System.out.println("Position1"+pos);

            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            temp=temp.next;
            Node temp1=temp.next;
            for(int i=pos-1;i<c-1;i++)
            {
                temp.data=temp1.data;
                temp.next=temp1;
                temp1=temp1.next;
            }
            temp.next=null;
            System.gc();
        }else if(pos==1)
        {
            System.out.println("Position2"+pos);

            starter=starter.next;
            temp=null;
        }
        else if(pos==count())
        {
            System.out.println("Position3"+pos);

            System.out.println("Count is"+count());
            Node temp1=temp.next;
            while(temp1.next!=null)
            {
                temp1=temp1.next;
                temp=temp.next;
            }
            temp.next=null;
        }
    }










}


