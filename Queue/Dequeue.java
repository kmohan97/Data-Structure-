
import java.util.Scanner;

/**
 * Dequeue dq=new Dequeue();
 * Function Performed-
 * dq.insert()-specify the side and enter data
 * dq.count()-count the no. of data
 * dq.delete()-delete the data on basis of the side
 * dq.traverse()-travel from Left to Right
 * Created by mohan on 9/12/2017.
 */

class Node{
    int data;
    Node next;
}

public class Dequeue {
   static Scanner ss = new Scanner(System.in);
    static Node left;
    static Node right;
    static int i;
    public static int get() {

        return ss.nextInt();
    }

    public static int count()
    {
        Node temp=left;
        int c=1;
        while(temp.next!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
    public static void insert()
    {
        System.out.println("Enter the side L or R");
        char ch=ss.next().charAt(0);
        if(i==0)
        {
            Node temp=new Node();
            System.out.println("Enter the data");
            temp.data=get();
            temp.next=null;
            left=temp;
            right=temp;
            i++;
        }else{
            if(ch=='L' || ch=='l')
            {
                Node temp=left;
                Node temp1=new Node();
                System.out.println("Enter the data");
                temp1.data=get();
                temp1.next=temp;
                left=temp1;
            }else if(ch=='R' || ch=='r'){
                Node temp=right;
                Node temp1=new Node();
                System.out.println("Enter the data");
                temp1.data=get();
                temp.next=temp1;
                temp1.next=null;
                right=temp1;
            }



        }


    }

    public void traverse()
    {
        Node temp;
        temp=left;
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

    public static void delete()
    {
        System.out.println("Enter the side to remove character L or R");
        char ch=ss.next().charAt(0);
        if(ch=='L' || ch=='l')
        {
            Node temp=left;
            Node temp1=new Node();
            System.out.println(temp.data);
            temp1=temp.next;
            left=temp1;
            temp=null;

        }else if(ch=='R' || ch=='r'){
            Node temp1=left;
            Node temp=temp1.next;
            while(true)
            {
                if(temp.next==null)
                {
                    break;
                }
                temp=temp.next;
                temp1=temp1.next;

            }
            System.out.println(temp.data);
            temp1.next=null;
            right=temp1;


        }
        System.gc();


    }


//    public static void main(String sefap[])
//    {
//        Dequeue dq=new Dequeue();
//        dq.insert();
//        dq.insert();
//        dq.insert();
//        dq.insert();
//        dq.insert();
//        System.out.println("sdfcdsc");
//
//        System.out.println(dq.count());
//        dq.traverse();
//
//        dq.delete();
//        dq.delete();
//
//        dq.traverse();
//    }



}

