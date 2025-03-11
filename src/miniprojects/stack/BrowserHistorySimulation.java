package miniprojects.stack;
import java.util.Scanner;

public class BrowserHistorySimulation {
    int cap;
    int top;
    String[] list;
    public BrowserHistorySimulation(int cap) {
        this.cap = cap;
        this.top = -1;
        this.list = new String[cap];
    }

    public void push(String address) {
        if(top>=cap-1) {
            System.out.println("StackOverflow!");
            return;
        }
        this.list[++top] = address;
        System.out.println("Visited: " + address);
    }

    public void pop() {
        if(top<0) {
            System.out.println("StackUnderflow!");
            return;
        }
        top--;
        System.out.println("Returned to: " + list[top]);
    }

    public void display() {
        int temp = top;
        System.out.println("Browsing History:");
        while(temp>=0) {
            System.out.println( temp+1 + ". " + list[temp--]);
        }
    }

    public void peek() {
        if(top==-1) {
            System.out.println("StackIsEmpty!");
            return;
        }
        System.out.println(list[top]);
    }

    public static void main(String[] args) {
        BrowserHistorySimulation BS1 = new BrowserHistorySimulation(5);
        while(true) {
            System.out.println("\n== Main Menu ==");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Peek");
            System.out.print("Enter choice: ");
            Scanner input = new Scanner(System.in);
            int choice = 0;
            try {
                choice = input.nextInt();
                input.nextLine();
            } catch (Exception e){
                System.out.println("Invalid option!");
            }

            switch(choice) {
                case 1:
                    String visit = null;
                    try {
                        System.out.print("Enter address: ");
                        visit = input.nextLine();
                    } catch (Exception e){
                        System.out.println("Invalid option!");
                    }
                    BS1.push(visit);
                    break;
                case 2:
                    BS1.pop();
                    break;
                case 3:
                    BS1.display();
                    break;
                case 4:
                    BS1.peek();
                    break;
                default:
                    break;
            }
        }
    }
}
