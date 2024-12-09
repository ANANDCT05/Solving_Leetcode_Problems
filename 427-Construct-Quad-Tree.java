/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
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
*/

class Solution {
    public Node construct(int[][] grid) {

        Node n = new Node();

        return check(grid, grid.length, 0, 0, n);
    }

    public static Node check(int[][] grid, int l, int i, int j, Node n) {

        int ht[] = new int[2];

        int k1 = 0;
        int e = i + l;
        int v = j + l;
        for (int m = i; m < e; m++) {

            for (int k = j; k < v; k++) {
                if (ht[grid[m][k]] == 0) {
                    k1++;

                }

                if (k1 == 2) {
                    break;
                }

                ht[grid[m][k]]++;

            }
        }

        if (k1 == 1) {

            if (ht[0] > 0) {
                n.val = false;

            } else {
                n.val = true;
            }

            n.isLeaf = true;

        }

        else {
            n.isLeaf = false;

            n.topLeft = check(grid, l / 2, i, j, new Node());
            n.topRight = check(grid, l / 2, i, j + (l / 2), new Node());
            n.bottomLeft = check(grid, l / 2, i + (l / 2), j, new Node());
            n.bottomRight = check(grid, l / 2, i + (l / 2), j + (l / 2), new Node());

        }

        return n;

    }
}