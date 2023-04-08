package April;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 8: Problem 133 - Clone Graph
*/

public class _8_133_CloneGraph {
	
	class Node {
	    public int val;
	    public List<Node> neighbors;
	    
	    public Node(int _val) {
	        val = _val;
	        neighbors = new ArrayList<Node>();
	    }
	}
	    
	Map<Node, Node> map = new HashMap<>();
    
    public Node cloneGraph(Node node) {
        if (node == null)
            return null;
        return clone (node);
    }    
    
    Node clone(Node node) {
        if (map.containsKey(node))
            return map.get(node);
        
        Node newNode = new Node(node.val);
        map.put(node, newNode);
        
        for (Node neighbor : node.neighbors) 
            newNode.neighbors.add(clone(neighbor));
        
        return newNode;
    }
}
