 class Queue{


         int a[]=new int[9];
         int front=-1;
         int rear=-1;

         public void enqueque(int data){
             if(front==a.length-1&&rear==a.length-1){
                 System.out.println("the queue is full");

             }
             else{
                 rear++;
                 a[rear]=data;
             }
         }
         public void Dequeue(){
             if(front==-1&&rear==-1){
                 System.out.println("the queue is empty");

             }
             else{
                 front--;

             }
         }

         public void peek(){


                 System.out.println("the top element "+a[rear]);


         }
         public void display(){
             System.out.println("the elements");


             for(int i=0;i<rear;i++){

                 System.out.println(a[i]);
             }
         }
     }

     public class Queueimpl  {
         public static void main(String [] args){
            Queue  s =new Queue();
             s.enqueque(30);
             s.enqueque(60);
             s.enqueque(50);
             s.enqueque(40);
             s.enqueque(300);
             s.enqueque(600);
             s.enqueque(500);
             s.enqueque(400);
             s.Dequeue();
             s.peek();
             s.display();

         }
     }




