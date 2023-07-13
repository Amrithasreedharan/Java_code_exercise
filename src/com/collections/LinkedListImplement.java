package com.collections;
import java.util.LinkedList;

public class LinkedListImplement {
    Node head;
    private int size;

    public LinkedListImplement() {
        this.size = size;
    }

    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add first
    public void addFirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    //add last
    public void addLast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currentnode = head;
        while (currentnode.next != null) {
            currentnode = currentnode.next;
        }
        currentnode.next = newnode;
    }

    // print list
    public void printlist() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.data + "->");
            currentnode = currentnode.next;
        }
        System.out.println("null");
    }

    //delete first
    public void deletefirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last
    public void deletelast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastnode = head.next;
        while (lastnode.next != null) {
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;

    }//return size

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LinkedListImplement list = new LinkedListImplement();
        list.addFirst("a");
        list.addFirst("b");
        list.addLast("amritha");

        list.deletefirst();
        list.deletelast();
        list.printlist();
        System.out.println(list.getSize());
    }
}
