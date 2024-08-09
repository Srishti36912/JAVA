package stack_queue;
import java.util.*;

import java.util.ArrayList;

public class stack {
    // static class Node {
    // int data;
    // Node next;

    // public Node(int data) {
    //     this.data = data;
    //     next = null;
    // }
    // }

    // static class Stack {
    //     public static Node head;
    //     public static boolean isEmpty() {
    //         return head == null;
    //     }

    //     public static void push(int data) {
    //         Node newNode = new Node(data);
    //         if(isEmpty()) {
    //             head = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head = newNode;
    //     }

    //     public static int pop() {
    //         if(isEmpty()) {
    //             return -1;
    //         }

    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }

    //     public static int peek() {
    //         if(isEmpty()) {
    //             return -1;
    //         }

    //         return head.data;
    //     }
    // }

    // static class Stack {
    //     static ArrayList<Integer> list = new ArrayList<>();

    //     public static boolean isEmpty() {
    //         return list.size() == 0;
    //     }

    //     public static void push(int data) {
    //         list.add(data);
    //     }

    //     public static int pop() {
    //         if(isEmpty()) {
    //             return -1;
    //         }
    //         int top = list.get(list.size()-1);
    //         list.remove(list.get(list.size()-1));
    //         return top;
    //     }

    //     public static int peek() {
    //         if(isEmpty()) {
    //             return -1;
    //         }
    //         return list.get(list.size()-1);
    //     }
    // }

    public static void pushAtBottom(int data, Stack<Integer> s) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        // Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // pushAtBottom(5,s);

        reverse(s);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
