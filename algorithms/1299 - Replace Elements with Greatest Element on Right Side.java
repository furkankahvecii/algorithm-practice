/*
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 */


class MajorityElement {
	
	public  static int[] replaceElements(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			max = arr[i];
			for(int j=i;j<arr.length;j++)
			{
				max = Math.max(max, arr[j]);
			}
			arr[i-1] = max;
			max=0;	
		}
		arr[arr.length-1] = -1;
		
		return arr;
	}
	
	// Another solution
	public  static int[] replaceElements2(int[] arr) {
		int max = -1;
		for(int i = arr.length-1 ; i>=0;i--)
		{
			int val = arr[i];
			arr[i] = max;
			max = Math.max(val, max);
		}
		
		return arr;
	}
}
