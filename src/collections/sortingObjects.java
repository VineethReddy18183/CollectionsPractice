package collections;
import java.util.*;

public class sortingObjects {
	
	
	public static void main(String args[])
	{
		List<Student> list = new ArrayList<>();
		list.add(new Student("Anuj", 2));
        list.add(new Student("Ramesh", 4));
        list.add(new Student("Shivam", 3));
        list.add(new Student("Rohit", 1));
        System.out.println(list);
        
        Student s1 = new Student("Vineeth",5);
        Student s2 = new Student("Rohan",10);
        
        System.out.println(s1.compareTo(s2));
        
        Collections.sort(list);
        System.out.println(list);        
        
        
        
	}

}
