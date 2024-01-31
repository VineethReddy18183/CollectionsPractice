package collections;
import java.util.*;

public class LearnQueueLinkedList {
	public static void main(String args[])
	{
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		queue.offer(60);
		
		queue.add(70);
		System.out.println(queue);
		
		
		queue.poll();
		System.out.println(queue);
		
		System.out.println(queue.element());
		System.out.println(queue.peek());
		
		
		System.out.println(queue.remove(30));
		System.out.println(queue);
	}

}
