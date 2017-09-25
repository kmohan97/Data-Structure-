import java.util.Scanner;

/**
 * U can use it by creating object of the Class.  
 * Created by mohan on 9/10/2017.
 * DoubliLinklist dll=new DoubliLinklist();
 dll.insert();-inserting of ele

 System.out.print(dll.count());
 dll.traverse();
 dll.traverserev();-print in reverse order
 dll.loc();-give the location of inssertion
 dll.traverse();
*/

class Node
{
    Node prev;
    int data;
    Node next;

}

public class DoubliLinklist {
    static Node starter;
    static Node last;

    Scanner ss=new Scanner(System.in);
    public static int get()
    {
        Scanner ss=new Scanner(System.in);
        return ss.nextInt();
    }

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
    public void insert()
    {
        System.out.println("Enter the no. of nodes to be created:-");
        int nn=get();
        Node temp=new Node();

        starter=temp;
        temp.prev=null;
        System.out.println("Enetr the data:-");
        temp.data=get();
        for(int i=2;i<=nn;i++)
        {
            temp.next=new Node();
            Node temp1=temp;

            temp=temp.next;
            System.out.println("Enetr the data:-");
            temp.data=get();
            temp.prev=temp1;
            temp.next=null;
            last=temp;
        }
    }
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
    public void traverserev()
    {
        Node temp;
        temp=last;
       while(true)
       {

           System.out.println(temp.data);
           if(temp.prev==null)
               break;
           temp=temp.prev;
       }
    }
    public void loc()
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



//    public static void main(String args[])
//    {
//        DoubliLinklist dll=new DoubliLinklist();
//        dll.insert();
//
//        System.out.print(dll.count());
//        dll.traverse();
//        dll.traverserev();
//        dll.loc();
//        dll.traverse();
//
//
//    }





}
