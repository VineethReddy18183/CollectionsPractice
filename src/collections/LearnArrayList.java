package collections;
import java.util.*;

public class LearnArrayList {
    public static void main(String args[]) {
        ArrayList<String> stringList = new ArrayList<>();
        System.out.println(stringList.size());
        stringList.add("Vineeth");
        stringList.add("Virat");
        stringList.add("Dhoni");
        
        System.out.println(stringList.size());
        System.out.println("stringList elements are: " + stringList);
        
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        
        list.add(2,80);
        System.out.println(list);
        
        System.out.println(list.get(4));
        list.remove(0);
        Integer.valueOf(30);
        
        System.out.println(list);
        list.set(3,0);
        System.out.println(list.contains(30));
        
        
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
        	System.out.println("The elemenet is " + it.next());
        }
        
        for(int i = 0;i<list.size();i++)
        {
        	System.out.println("The element is " + list.get(i));
        }
        
        for(Integer element : list)
        {
        	System.out.println("The element is " + element);
        }
        list.clear();
        System.out.println(list);
        
        
        
    }
}

