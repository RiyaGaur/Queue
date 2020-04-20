import java.util.Scanner;

public class Queue {
    int arr[];
    int top;
    int beg;

    public Queue(int size) {
        arr = new int[size];
        top = -1;
        beg = -1;
    }

    public boolean isqueuefull() {
        if (top == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isqueueempty() {
        if (beg == -1 || beg == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int data) {
        if (isqueuefull()) {
            System.out.println("queue overflow");
        } else if (isqueueempty()) {
            beg++;
            top++;
            arr[top] = data;
        } else {
            top++;
            arr[top] = data;
        }
    }

    public void dequeue() {
        if (isqueueempty()) {
            System.out.println("queue underflow");
        }
        else {
            for (int i = 0; i < beg - 1; i++) {
                arr[i] = arr[i + 1];
            }
            beg--;
        }
    }

    public void peekinqueue() {
        if (isqueueempty()) {
            System.out.println("queue is empty");
        } else {
            System.out.println(arr[beg]);
        }
    }

    public void deletequeue() {
        arr = null;
        System.out.println("queue deleted");
    }

    public void displayqueue() {
        if (isqueueempty()) {
            System.out.println("no element found");
        } else {
            for (int i = beg; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
class Queuemain{
    public static void main(String args[]) {
        Queue obj = new Queue(5);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.displayqueue();
        obj.peekinqueue();
        obj.dequeue();
        obj.displayqueue();
    }
}