import java.util.Arrays;

public class TwoSum {

	public static boolean twoSum(int[] arr, int target)
	{
		Arrays.sort(arr);
		int left = 0, right = arr.length -1 ;
		
		while(left < right)
		{
			int sum = arr[left] + arr[right];
			if(sum == target) return true;
			else if (sum < target) left++;
			else right--;
		}
		
		return false;
	}
	
	public static void main(String[] args) throws IOException 
	{
		System.out.println(twoSum(new int[] {1,12,24,38},24)); // return false 
		System.out.println(twoSum(new int[] {1,12,24,38},36)); // return true
	}
}