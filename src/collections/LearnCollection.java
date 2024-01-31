package collections;
import java.util.*;

public class LearnCollection {
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(32);
		list.add(19);
		list.add(213);
		list.add(819);
		list.add(819);
		
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		System.out.println(Collections.frequency(list,819));
	}

}
