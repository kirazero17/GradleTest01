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
    
    public int addNode(int d)
    {
        if (head == null)
        {
            this.head = new Node(d);
            this.tail = this.head;
        }
        else
        {
            Node n = this.head;
            //let n go to the furthest node from head
            while (n.next != null)
                n = n.next;
            //assign a new node to the 'next' address and set it as the 'tail'
            n.next = new Node(d);
            this.tail = n.next;
            //link the next/newly created node (n.next) with the last node (n)
            n.next.prev = n;
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
    }
    
    public void prtnumback()
    {
        Node n = this.tail;
        while (n != null)
        {
            System.out.print(n.num + "  ");
            n = n.prev;
        }
    }
}