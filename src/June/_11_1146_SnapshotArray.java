package June;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, June 2023
 * Day 11: Problem 1146 - Snapshot Array
 * 
 */

public class _11_1146_SnapshotArray {
	
	Map <Integer, List<int []>> map;
    int snapId;
    
    public _11_1146_SnapshotArray (int length) {
        map = new HashMap<>();
        for (int i=0; i<length; i++){
        	List<int []> temp = new ArrayList<>();
            temp.add(new int [] {0, 0});
            map.put(i, temp);
        }  
        snapId = 0;      
    }
    
    public void set(int index, int val) {
    	if (map.get(index).size()-1 >= snapId)
    		map.get(index).get(snapId)[1] = val;
    	else
    		map.get(index).add(new int [] {snapId, val});
    }
    
    public int snap() {
        return snapId++;
    }
    
    public int get(int index, int snap_id) {
    	int size = map.get(index).size()-1;
        for (int i = size; i>=0; i--) {
            if (map.get(index).get(i)[0] <= snap_id)
                return map.get(index).get(i)[1];
        }            
        
        return 0;
    }
}
