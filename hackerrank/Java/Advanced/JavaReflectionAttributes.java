/*
 * https://www.hackerrank.com/challenges/java-reflection-attributes/problem
*/


import java.lang.reflect.Method;
import java.util.*;

class Student
{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }

}

public class JavaReflectionAttributes 
{
	public static void main(String[] args)
	{
		Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        /* Get names from Methods */
        ArrayList<String> methodNames = new ArrayList<>();
        for (Method method : methods) {
            methodNames.add(method.getName());
        }
        
        Collections.sort(methodNames);
        for (String name: methodNames) 
            System.out.println(name);   
	}
}