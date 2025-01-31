class stack {
    int n = 100;
    int c[] = new int[n];
    int a[] = new int[n / 2];
    int b[] = new int[n / 2];
    int topA = -1;
    int topB = -1;

    public void push(int data) {
        if (topA  == a.length && topB  == b.length) {
            System.out.println("The stack is full");
        } else {
            if (topA < a.length - 1) {
                topA++;
                a[topA] = data;
            } else {
                topB++;
                b[topB] = data;
            }
        }
    }

    public void display() {
        System.out.println("The elements in stack A and B summed:");
        for (int i = 0; i <= topB; i++) {
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }
    }
}

public class TwoStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(30);
        s.push(60);
        s.push(90);
        s.push(404);
        s.push(304);
        s.push(604);
        s.push(903);
        s.push(400);
        s.display();
    }
}
