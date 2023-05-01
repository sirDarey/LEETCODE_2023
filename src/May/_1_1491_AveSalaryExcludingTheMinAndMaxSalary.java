package May;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, May 2023
* Day 1: Problem 1491 - Average Salary Excluding the Minimum and Maximum Salary
*/

public class _1_1491_AveSalaryExcludingTheMinAndMaxSalary {
	public double average(int[] salary) {
        double min = 1000000, max = 0, n = salary.length, sum = 0;
        for (int i=0; i<n; i++){
            sum += salary[i];
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
        }
        return (sum-min-max)/(n-2.0);
    }
}
