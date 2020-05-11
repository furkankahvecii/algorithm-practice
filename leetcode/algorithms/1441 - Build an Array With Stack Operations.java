/*
 * https://leetcode.com/problems/build-an-array-with-stack-operations/
 */



class Solution {
    public List<String> buildArray(int[] target, int n) {
        int count = 0;
        List<String> sonuc = new ArrayList<String>();
        for(int i=1;i<=n && count<target.length;i++) {
        	sonuc.add("Push");
        	if(target[count] != i)
        		sonuc.add("Pop");
        	else
        		count++;
        }
        
        return sonuc;
    }
}
