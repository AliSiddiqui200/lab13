package lab10tasks;

import java.util.LinkedList;
import java.util.Queue;

public class QueueADT {

	public static void main(String[] args) {
		
		Queue<Integer> Q = new LinkedList<Integer>();
		
		for(int i=0;i<=5;i++) {
			Q.add(i);
		}
		System.out.println(Q);
		
		Q.remove(5);
		System.out.println(Q);
		
		System.out.println("Element On Queue Top:"+Q.peek());
		System.out.println("Size OF Queue: "+Q.size());
	}

}
