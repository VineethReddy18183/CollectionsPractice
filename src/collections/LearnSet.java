package collections;
import java.util.*;

public class LearnSet {
	public static void main(String args[])
	{
	Set<Student> set = new HashSet<>();
	
	set.add(new Student("Vineeth",60));
	set.add(new Student("Lalith",61));
	set.add(new Student("Ravi Teja",62));
	set.add(new Student("Rahul",62));
	System.out.println(set);
	
	Student s1 = new Student("Rohan",100);
	Student s2 = new Student("Vikram",100);
	System.out.println(s1.equals(s2));
	}
	

}
