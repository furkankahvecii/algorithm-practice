/*
 * https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 */



class Solution {
    double sum = 0;
		Arrays.sort(salary);
		for(int i=0;i<salary.length;i++) {
			if(i !=0 && i != salary.length-1)
				sum += salary[i];
		}
		return sum / (salary.length-2);
    
    // or
    
    double sum = Arrays.stream(salary).sum();
		sum -= Arrays.stream(salary).max().getAsInt();
		sum -= Arrays.stream(salary).min().getAsInt();
		return sum / (salary.length-2);
    
    
    // or
    
    import java.util.IntSummaryStatistics;
    
    double sum = Arrays.stream(salary).sum();
		IntSummaryStatistics stat = Arrays.stream(salary).summaryStatistics();
		sum -= (stat.getMax() + stat.getMin());
		return sum / (salary.length-2);
}
