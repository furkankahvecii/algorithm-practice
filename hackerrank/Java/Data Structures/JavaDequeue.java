/*
 * https://www.hackerrank.com/challenges/java-dequeue/problem
*/


import java.util.*;


public class JavaDequeue
{
   public static void main(String[] args)
   {
	 	Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		Set<Integer> set = new HashSet();

		int n = in.nextInt();
		int m = in.nextInt();

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) 
		{
			int num = in.nextInt();

			deque.add(num);
			set.add(num);

			if (deque.size() >= m) 
			{
				if (max < set.size())
					max = set.size();

				int first = deque.getFirst();
				deque.pop();

				if (!deque.contains(first))
					set.remove(first);
			}
		}

		System.out.println(max);
   }
}