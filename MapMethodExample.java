package com.codegnan.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodExample {

	public static void main(String[] args) {
		//put(key,value)--add entries to the map.
		Map<String,Integer> studentMarks=new HashMap<>();
		studentMarks.put("Arjun", 88);
		studentMarks.put("Ravi", 92);
		studentMarks.put("Sita", 79);
		studentMarks.put("Priya", 85);
		studentMarks.put("Rahul", 91);
		System.out.println(studentMarks);
		//putAll
		Map<String,Integer> newStudents=new HashMap<>();
		newStudents.put("Annanya",95);
		newStudents.put("Vikram",92);
		newStudents.put("Meera",87);
		studentMarks.putAll(newStudents);
		System.out.println(studentMarks);
		//get(key)
		System.out.println("Marks of Arjun"+studentMarks.get("Arjun"));
		//remove(key)
		System.out.println("Removed priya's marks:"+studentMarks.remove("Priya"));
		//contains(key)
		System.out.println("Is sita present? :"+studentMarks.containsKey("Sita"));
		//containsValue
		System.out.println("Any Student scored 100 marks?"+studentMarks.containsValue(100));
		//isEmpty();
		System.out.println("is MAp Empty?"+studentMarks.isEmpty());
		//size
		System.out.println("Total Students:"+studentMarks.size());
		//keySet();
		Set<String>studentNames=studentMarks.keySet();
		System.out.println("Student Names:"+studentNames);
		//values()
		Collection<Integer>marks=studentMarks.values();
		System.out.println("Marks:"+marks);
		//entrySet: return all entities as a set of map.entry
		Set<Map.Entry<String,Integer>> entries=studentMarks.entrySet();
		System.out.println("All Entries");
		for(Map.Entry<String,Integer>entry:entries) {
			System.out.println(entry.getKey()+"------>"+entry.getValue());
		}
		//Clear
		studentMarks.clear();
		System.out.println("Map Cleared. is Empty?"+studentMarks.isEmpty());
	}
	

}
