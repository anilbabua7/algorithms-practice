package com.anil.exercise;

class ListNode{
	int data;
	ListNode next;
	public ListNode(int data) {
		this.data = data;
	}
}

public class SingleLinkListPalindrom {

	ListNode head;
	
	public boolean isPalin(ListNode last) {
		if(last == null) return true;
		boolean res = isPalin(last.next);
		if(res && head.data == last.data) {
			head = head.next;
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(1);
		
		SingleLinkListPalindrom list = new SingleLinkListPalindrom();
		list.head = head;
		boolean ans = list.isPalin(head);
		if(ans) {
			System.out.println("Yes, Given list is palindrom");
		}
		else {
			System.out.println("No, Given list is not palindrom");
		}
	}

}
