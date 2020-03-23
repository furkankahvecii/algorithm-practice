/*
 * https://www.hackerrank.com/challenges/java-priority-queue/problem
*/


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student implements Comparable<Student>
{
    private int id;
    private String name;
    private double cgpa;
    
    public Student(String name, double cgpa, int id)
    {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getID() { return this.id; }
    public String getName() { return this.name; }
    public double getCGPA() { return this.cgpa; }
    
    public int compareTo(Student s)
    {
        if(cgpa == s.cgpa)
        {
            if(name.compareTo(s.name) == 0)
            {
                if(id == s.id)
                    return 0;
                else if (id > s.id)
                    return 1;
                else
                    return -1;
            }
            else
                return name.compareTo(s.name);
        }
        else if(cgpa > s.cgpa)
            return -1;
        else
            return 1;
    }
}

class Priorities
{
    public ArrayList<Student> getStudents(List<String> events)
    {   
        PriorityQueue<Student> pq = new PriorityQueue<Student>();
        
        for(String piece : events)
        {
            String array[] = piece.split("\\s");
            
            if(array[0].equals("ENTER"))
            {
                pq.add(new Student(array[1],Double.valueOf(array[2]),Integer.valueOf(array[3])));
            }
            else
            {
                pq.poll();
            }
        }
        
        while(pq.size() > 1)
        {
            System.out.println(pq.poll().getName());
        }
        
        return new ArrayList<Student>(pq);
    }
}

public class JavaPriorityQueue 
{
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) 
	{
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) 
		{
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) 
			System.out.println("EMPTY");
		else 
		{
			for (Student st : students) 
			{
				System.out.println(st.getName());
			}
		}
	}
}