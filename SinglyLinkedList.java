package com.howtodoinjava.demo.core;
 
public class SinglyLinkedList {
 
    private Node start;
 
    public void add(Integer i)
    {
        Node node = new Node(i);
        if(start == null)
            start = node;
        else
        {
            Node temp = start;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
 
    public Node getStart()
    {
        return start;
    }
 
    static class Node
    {
        Node(Integer i)
        {
            this.value = i;
        }
 
        private Integer value;
        private Node next;
        public Integer getValue() {
            return value;
        }
        public void setValue(Integer value) {
            this.value = value;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }
}