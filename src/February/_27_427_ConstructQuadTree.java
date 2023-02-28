package February;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 27: Problem 427 - Construct Quad Tree
*/

public class _27_427_ConstructQuadTree {
	class Node {
	    public boolean val;
	    public boolean isLeaf;
	    public Node topLeft;
	    public Node topRight;
	    public Node bottomLeft;
	    public Node bottomRight;
	    
	    public Node(boolean val, boolean isLeaf) {
	        this.val = val;
	        this.isLeaf = isLeaf;
	    }
	    
	    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
	        this.val = val;
	        this.isLeaf = isLeaf;
	        this.topLeft = topLeft;
	        this.topRight = topRight;
	        this.bottomLeft = bottomLeft;
	        this.bottomRight = bottomRight;
	    }
	}
	
	
	public Node construct(int[][] grid) {
        return dfs(grid.length, 0, 0, grid);
    }

    Node dfs(int n, int row, int column, int[][] grid) {
        boolean same = true;

        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++) {
                if (grid[row][column] != grid[row+i][column+j]) {
                    same = false;
                    break;
                }                    
            }
        if (same) {
            boolean val = grid[row][column] == 1? true : false;
            return new Node(val, true);
        }
           
        n = n/2;

        Node topLeft = dfs (n, row, column, grid);
        Node topRight = dfs (n, row, column+n, grid);
        Node bottomLeft  = dfs (n, row+n, column, grid);
        Node bottomRight = dfs (n, row+n, column+n, grid);
        
        return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
    }
}
