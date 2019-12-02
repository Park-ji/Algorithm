package BOJ;

import java.util.*;//Queue가 들어있음
//push
//pop
//front
//back
//empty
//size

public class Queue {

	int queue[] = new int[10000];
	int begin = 0;
	int end = 0;

	public static void main(String[] args) {
		Queue q = new Queue();
		q.push(1);
		q.push(2);
		q.push(3);
		
		System.out.println(q.front());
		q.pop();
		System.out.println(q.front());
		System.out.println(q.back());

	}

	void push(int data) { //add
		queue[end] = data;
		end++;
	}
	
	int pop() {//
		int front = queue[begin];
		queue[begin] = 0;
		begin++;
		return front;
	}
	
	boolean empty() {
		if(begin==end) return true;
		else return false;
	}
	
	int size() {
		return end-begin;
	}
	
	int front() {
		return queue[begin];
	}
	
	int back() {
		return queue[end-1];
	}
}
