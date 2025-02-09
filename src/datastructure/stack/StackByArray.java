package datastructure.stack;

public class StackByArray {
    static final int MAX = 100;
    int[] stack = new int[MAX];
    int top;
    public StackByArray() {
        top = -1;
    }
    public void push(int data) {
        if(top>=MAX-1) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = data;
            System.out.println(data + " has been inserted!");
        }
    }
    public void pop(){
        if(top<0) {
            System.out.println("Stack Underflow!");
        } else {
            int x = stack[top--];
            System.out.println(x + " has been removed!");
        }
    }
    public boolean isEmpty() {
        return top < 0;
    }
    public int top() {
        if(top<0) {
            System.out.println("Stack Underflow!");
            return -1;
        } else {
            return stack[top];
        }
    }
    public void display() {
        if(top<0) {
            System.out.println("Stack Underflow!");
        }
        int current = top;
        while(current!=-1) {
            System.out.print(stack[current--] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("----- STACK 2 ------");
        StackByArray stk1 = new StackByArray();
        System.out.println("Is stack empty? - " + stk1.isEmpty());
        stk1.push(20);
        stk1.push(30);
        stk1.push(40);
        stk1.pop();
        System.out.println("Is stack empty? - " + stk1.isEmpty());
        System.out.println("Top item of this Stack - " + stk1.top());
        stk1.display();

        System.out.println("----- STACK 2 ------");
        StackByArray stk2 = new StackByArray();
        System.out.println("Is stack empty? - " + stk2.isEmpty());
        System.out.println("Top item of this Stack - " + stk2.top());
        stk2.push(2);
        stk2.push(10);
        stk2.display();

        System.out.println("----- STACK 1 ------");
        stk1.display();
    }
}
