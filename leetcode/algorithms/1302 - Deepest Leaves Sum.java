/*
 * https://leetcode.com/problems/deepest-leaves-sum/
 */


public class Solution {
	
	public static int deepestLeavesSum(TreeNode root) {
		int[] array = new int[2];
		deepestLeavesSumHelper(root,0,array);
		return array[1];
	}
	
	public static void deepestLeavesSumHelper(TreeNode node, int level, int[] array) {
		
		if(node == null)
			return;
		
		if(node.right == null && node.left == null) {
			
			if(level > array[0]) {
				array[0] = level;
				array[1] = node.val;
			}
			else if(level == array[0]) {
				array[1] += node.val;
			}
			
		}
		
		deepestLeavesSumHelper(node.left,level+1,array);
		deepestLeavesSumHelper(node.right,level+1,array);
	}
}