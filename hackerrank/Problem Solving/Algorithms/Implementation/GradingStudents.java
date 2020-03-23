/*
* https://www.hackerrank.com/challenges/grading/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class GradingStudents
{
	public static List<Integer> gradingStudents(List<Integer> grades)
	{
		List<Integer> list = new ArrayList<Integer>();
		
        for(int a : grades)
        {
            int count = 0;
            if(a<38)
            {
                list.add(a);
                continue;
            }

            while(a % 5 !=0)
            {
                a++;
                count++;
            }
            
            if(count<3)
                list.add(a);
            else
                list.add(a-count);
        }
        
        return list;
	}

    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}