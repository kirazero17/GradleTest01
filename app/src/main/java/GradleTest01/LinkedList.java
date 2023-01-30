/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GradleTest01;

/**
 *
 * @author longkg
 */
public class LinkedList
{
    Node head;
    Node tail;
    short len;
    static class Node
    {
        int num;
        Node next;
        Node prev;
        Node(int d) {
            this.num = d;
            this.next = null;
            this.prev = null;
        }
    }

    public LinkedList() 
    {
        len = 0;
        this.head = null;
        this.tail = null;
    }
    
    public int addTail(int d)
    {
        if (head == null)
        {
            this.head = new Node(d);
            this.tail = this.head;
        }
        else
        {
            //assign a new node to the 'next' pointẻr
            this.tail.next = new Node(d);
            //link the next/newly created node (tail.next) with the tail as its 'prev'
            this.tail.next.prev = this.tail;
            //set the new tail
            this.tail = this.tail.next;
        }
        len++;
        return 0;
    }
    
    public int addHead(int d)
    {
        if (head == null)
        {
            this.head = new Node(d);
            this.tail = this.head;
        }
        else
        {
            //assign a new node to the 'prev' pointẻr
            this.head.prev = new Node(d);
            //link the next/newly created node (head.prev) with the head as its 'next'
            this.head.prev.next = this.head;
            //set the new head
            this.head = this.head.prev;
        }
        len++;
        return 0;
    }
    
    public void printnum()
    {
        Node n = this.head;
        while (n != null)
        {
            System.out.print(n.num + "  ");
            n = n.next;
        }
        System.out.println("");
    }
    
    public void prtnumback()
    {
        Node n = this.tail;
        while (n != null)
        {
            System.out.print(n.num + "  ");
            n = n.prev;
        }
        System.out.println("");
    }
}