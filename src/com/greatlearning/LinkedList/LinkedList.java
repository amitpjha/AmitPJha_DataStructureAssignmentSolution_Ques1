package com.greatlearning.LinkedList;

public class LinkedList 
{
	public Node head; 
	public void push(int new_data) 
	{
		Node new_node = new Node(new_data);
		new_node.next = head;

		head = new_node;
	}

	public boolean search(Node head, int x) 
	{
		Node current = head; 
		while (current != null) 
		{
			if (current.data == x)
				return true; 
			current = current.next;
		}
		return false; 
	}

}
