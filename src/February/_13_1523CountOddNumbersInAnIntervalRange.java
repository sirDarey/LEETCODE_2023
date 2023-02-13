package February;

/**
*
* @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 13: Problem 1523 - Count Odd Numbers in an Interval Range
*/

public class _13_1523CountOddNumbersInAnIntervalRange {
	
	public int countOdds(int low, int high) {
        int answer = (high - low) / 2;
        return (low%2==1 || high%2==1)? answer+1 : answer;
    }
}
