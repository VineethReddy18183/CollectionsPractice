package collections;
import java.util.*;
public class LearnStack {
	public static void main(String args[])
	{
		Stack<String> animals = new Stack<>();
		
		animals.push("Lion");
		animals.push("Tiger");
		animals.push("Cheetah");
		animals.push("cat");
		animals.push("Dinosaur");
		
		System.out.println(animals);
		
		System.out.println(animals.peek());
		
		System.out.println(animals.pop());
		System.out.println(animals);
		
		
		
	}
}
