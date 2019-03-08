package com.anil.exercise;

public class MinHeap {
	
	private int capacity = 7;
	private int size = -1;
	private int[] heap = new int[capacity];
	
	public int parent(int i) {
		return i/2;
	}
	
	public int left(int i) {
		return 2*i+1;
	}
	
	public int right(int i) {
		return 2*i+2;
	}
	
	public void push(int val) {
		if(size == capacity) {
			System.out.println("Heap is full");
			return;
		}
		
		size++;
		heap[size] = val;
		System.out.println("Pushed to min Heap : "+val);
		int pos = size;
		
		
		while(pos != 0 && heap[pos] < heap[parent(pos)]) {
			swap(pos, parent(pos));
			pos = parent(pos);
		}
		
		
	}
	
	public void extract() {
		if(size == 0) {
			System.out.println("No elements to extract");
			return;
		}
		
		System.out.println("Extracted element : "+heap[0]);
		heap[0] = heap[size];
		size--;
		heapify(0);
		
	}
	
	public void heapify(int i) {
		
		int left = left(i);
		int right = right(i);
		int smallest = i;
		
		if(left <= size && heap[smallest] > heap[left] ) {
			smallest = left;
		}
		
		if(right <= size && heap[smallest] > heap[right] ) {
			smallest = right;
		}
		
		if(smallest != i) {
			swap(i, smallest);
			heapify(smallest);
		}
		
		
		
	}
	
	public void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
	

	public static void main(String[] args) {
		MinHeap heap = new MinHeap();
		
		heap.push(23);
		heap.push(12);
		heap.push(9);
		heap.push(1);
		heap.push(30);
		heap.push(2);
		heap.push(50);
		heap.extract();
		heap.extract();
		heap.extract();
	}

}
