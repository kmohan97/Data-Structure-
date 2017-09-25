import java.util.Scanner;

/**
 * PriorityQueue pr=new PriorityQueue();
 * pr.create-creates the Queue
 * pr.traverse-Displays all the elements
 * pr.delete-Deletes the element with most priority
 * Created by mohan on 9/12/2017.
 */

class Node
{
    int prior;
    int data;
    Node next;
}
public class PriorityQueue {
  //  static int i;
    static Node starter;
    //static Node first;
    static Node rear;
    Scanner ss = new Scanner(System.in);
    public int get() {
        Scanner ss = new Scanner(System.in);
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




    public void create()
    {
        System.out.println("Enter the no. of elements to create");
        int n=get();
        Node temp=new Node();

        System.out.println("Enter the priority");
        temp.prior=ss.nextInt();
        System.out.println("Enter the data");
        temp.data=ss.nextInt();
        temp.next=null;
        rear=temp;
        starter=temp;
        for(int i=2;i<=n;i++)
        {
            if(i==2) {
                System.out.println("Enter the priority");
                int p1 = get();
                temp = starter;

                if(temp==starter && (p1<=temp.prior))
                {
                    Node temp2=new Node();
                    temp2.prior=p1;
                    System.out.println("Enter the data");
                    temp2.data=get();
                    temp2.next=temp;
                    starter=temp2;
                }else{

                    Node temp2=new Node();
                    temp2.prior=p1;
                    System.out.println("Enter the data");
                    temp2.data=get();
                    temp.next=temp2;
                    temp2.next=null;
                    rear=temp2;

                }

            }else{


                Node temp1=starter;
                Node temp2=temp1.next;
                System.out.println("Enter the Priority");
                int p1=get();
                if(p1<=temp1.prior)
                {
                    Node temp3=new Node();
                    temp3.prior=p1;
                    System.out.println("Enter the data");
                    temp3.data=get();
                    temp3.next=temp1;
                    starter=temp3;
                }else {
                    if(i!=3)
                    while (!(p1 <= temp2.prior)) {
                        if(temp2==rear) {break;}
                            temp2 = temp2.next;
                            temp1 = temp1.next;

                    }
                    if(temp2==rear && (p1>=temp2.prior))
                    {
                        Node temp3=new Node();
                        temp3.prior=p1;
                        System.out.println("Enter the data");
                        temp3.data=get();
                        temp2.next=temp3;
                        temp3.next=null;
                        rear=temp3;

                    }else{
                        Node temp3=new Node();
                        temp3.prior=p1;
                        System.out.println("Enter the data");
                        temp3.data=get();
                        temp1.next=temp3;
                        temp3.next=temp2;





                    }



                }


            }
        }





    }

    public void traverse()
    {
        Node temp;
        temp=starter;
        if(temp==null)
        {
            System.out.println("NadO object craeted");

        }
        else{
            while(true)
            {
                System.out.println(temp.prior+"-"+temp.data);

                if(temp.next==null)
                {
                    break;
                }
                temp=temp.next;
            }
        }
    }

    public void delete(){
        Node temp=starter;
        Node temp1=temp.next;
        while(temp1!=rear){
            temp=temp.next;
            temp1=temp1.next;
        }

        System.out.println(temp1.data+"-"+temp1.prior);
        temp.next=null;
        rear=temp;
        System.gc();



    }
    public static void main(String ars[])
    {
        PriorityQueue pr=new PriorityQueue();
        pr.create();
        pr.traverse();
        pr.delete();
        pr.delete();
        pr.delete();
        pr.delete();

    }

}
