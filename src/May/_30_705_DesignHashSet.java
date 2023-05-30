package May;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, May 2023
* Day 30: Problem 705 - Design HashSet
* 
*/

public class _30_705_DesignHashSet {
	
	boolean [] set;
	
    public _30_705_DesignHashSet () {
        set = new boolean[1000001];
    }
    
    public void add(int key) {
        set[key] = true;
    }
    
    public void remove(int key) {
        set[key] = false;
    }
    
    public boolean contains(int key) {
        return set[key];
    }
}
