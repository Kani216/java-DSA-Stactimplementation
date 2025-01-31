class Stack{

int a[]=new int[9];
int top=-1;

public void push(int data){
    if(top==a.length-1){
        System.out.println("the stack is full");

    }
    else{
        top++;
        a[top]=data;
    }
}
    public void pop(){
        if(top==-1){
            System.out.println("the stack is empty");

        }
        else{
            top--;

        }
    }

    public void peek(){
        if(top==-1){
            System.out.println("the stack is empty");

        }
        else{
            System.out.println("the top element "+a[top]);

        }
    }
public void display(){
    System.out.println("the elements");


    for(int i=top;i>=0;i--){

        System.out.println(a[i]);
    }
}
        }

public class Stackimpl {
    public static void main(String [] args){
        Stack s =new Stack();
        s.push(30);
        s.push(60);
        s.push(90);
        s.push(404);
        s.push(304);
        s.push(604);
        s.push(903);
        s.push(400);
        s.pop();
        s.peek();
        s.display();

    }
}
