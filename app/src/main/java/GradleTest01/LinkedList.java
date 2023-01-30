/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GradleTest01;

/**
 *
 * @author longkg
 */
class LinkedList
{
    private Node head;
    private Node tail;
    private short len;
    public Node Head() {return this.head;}
    public Node Tail() {return this.tail;}
    public short Len() {return this.len;}
    
    static class Node
    {
        private int num;
        public int Num() {return this.num;}
        private Node next;
        private Node prev;
        public Node(int d) {
            this.num = d;
            this.next = null;
            this.prev = null;
        }
    }

    public LinkedList() 
    {
        this.len = 0;
        this.head = null;
        this.tail = null;
    }
    
    public int addTail(int value)
    {
        if (this.head == null)
        {
            this.head = new Node(value);
            this.tail = this.head;
        }
        else
        {
            //assign a new node to the 'next' pointẻr
            this.tail.next = new Node(value);
            //link the next/newly created node (tail.next) with the tail as its 'prev'
            this.tail.next.prev = this.tail;
            //set the new tail
            this.tail = this.tail.next;
        }
        this.len++;
        return 0;
    }
    
    public int addHead(int value)
    {
        if (this.tail == null)
        {
            this.head = new Node(value);
            this.tail = this.head;
        }
        else
        {
            //assign a new node to the 'prev' pointẻr
            this.head.prev = new Node(value);
            //link the next/newly created node (head.prev) with the head as its 'next'
            this.head.prev.next = this.head;
            //set the new head
            this.head = this.head.prev;
        }
        this.len++;
        return 0;
    }
    
    public int delTail()
    {
        if (this.len == 0)
        {
            System.out.println("There's no node to delete !");
            return -1;
        }
        if (this.len == 1)
        {
            this.head = null;
            this.tail = null;
        }
        else
        {
            this.tail.prev.next = null;
            this.tail = this.tail.prev;
        }
        this.len--;
        return 0;
    }
    
    public int delHead()
    {
        if (this.len == 0)
        {
            System.out.println("There's no node to delete !");
            return -1;
        }
        if (this.len == 1)
        {
            this.head = null;
            this.tail = null;
        }
        else
        {
            this.head.next.prev = null;
            this.head = this.head.next;
        }
        this.len--;
        return 0;
    }
    
    public void printnode(int position)
    {
        if (position < 0 || position >= this.len)
        {
            System.out.println("There's no such position.");
            return;
        }
        Node n;
        if (position <= (this.len - 1) / 2)
        {
            n = this.head;
            for(int i=0; i<position; i++)
                n = n.next;
        }
        else
        {
            n = this.tail;
            for(int i=len-1; i>position; i--)
                n = n.prev;
        }
        System.out.println(n.num);
    }
    
    public int editnode(int position, int value)
    {
        if (position < 0 || position >= this.len)
        {
            System.out.println("There's no such position.");
            return -1;
        }
        Node n;
        if (position < this.len / 2)
        {
            n = this.head;
            for(int i=0; i<position; i++)
                n = n.next;
        }
        else
        {
            n = this.tail;
            for(int i=len-1; i>position; i++)
                n = n.prev;
        }
        n.num = value;
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