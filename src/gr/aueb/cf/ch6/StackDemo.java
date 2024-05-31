package gr.aueb.cf.ch6;

public class StackDemo {

    static int[] stack = new int[50];
    static int top = -1;


    public static void main(String[] args) {
        int num;

        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);


        printStack();
        num = pop();
        System.out.printf("Num %d was poped\n" , num);
        System.out.println("Contents of the stack");
        printStack();

    }

    public static void push(int num) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");

        }
        stack[++top] = num;
    }

    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        return stack[top--];
    }

    public static boolean isFull() {
        return (top == stack.length - 1);

    }

    public static boolean isEmpty() {
        return (top == -1);
    }


    public static void printStack() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack");
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
        System.out.println();
    }





























}
