package com.anil.exercise;

class Element implements Comparable<Element>{
	Integer data;
	Integer freq;
	
	public Element(int data, int freq) {
		this.data = data;
		this.freq = freq;
	}
	
	@Override
	public int compareTo(Element o) {
		if(o.freq == this.freq) {
			return this.data.compareTo(o.data);
		}
		return this.freq.compareTo(o.freq);
	}
	
}

public class TopKElementsInStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
