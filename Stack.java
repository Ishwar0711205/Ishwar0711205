import java.util.*;

public class Stack {
    String[] stack;
    int top;

    public Stack(int size) {
        stack = new String[size];
        top = -1;
    }

    public void push(String str) {
        if (top >= stack.length - 1) {
            System.out.println("Stack is overflow");
            return;
        }
        stack[++top] = str;
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return;
        }
        top--;
    }

    public void show() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        int i = 1;

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");
        Stack stack = new Stack(words.length);

        for (String word : words) {
            stack.push(word);
        }

        while (i != 0) {
            System.out.println("Menu \n1. Push \n2. Pop \n3. Show \n4. Exit:");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter word:");
                    String s = sc.next();
                    stack.push(s);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.show();
                    break;
                case 4:
                    i = 0;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}