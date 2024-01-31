package collections;
import java.util.*;
public class LearnHashSet {
	public static void main(String args[])
	{
		Set<Integer> set = new HashSet<>();
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(70);
		set.add(60);
		
		System.out.println(set);
		set.remove(20);
		System.out.println(set);
		System.out.println(set.contains(20));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
	}

}
