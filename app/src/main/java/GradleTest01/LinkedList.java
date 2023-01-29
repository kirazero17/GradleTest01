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
    static class Node
    {
        int data;
        Node next;
        Node() {
            next = null;
        }
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public LinkedList() 
    {
        this.head = null;
    }
    
    public LinkedList(int d) 
    {
        this.head = new Node(d);
    }
    
    public void print()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data + "  ");
            n = n.next;
        }
    }
}