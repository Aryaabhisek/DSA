/* Given a binary matrix maze[][] of size n × n containing values 0 and 1, find all possible paths for a rat to travel from the source cell (0, 0) to the destination cell (n - 1, n - 1). The rat can move in four directions: up(U), down(D), left(L), and right(R).

1 represents an open cell through which the rat can move.
0 represents a blocked cell that cannot be traversed.
The rat can move only through open cells and cannot visit the same cell more than once in a path. Return all valid paths as strings consisting of 'U', 'D', 'L', and 'R', representing the sequence of moves taken by the rat.

Note: Return the paths in lexicographically increasing order. If no valid path exists, return an empty list.

Examples:

Input: maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}}
Output: ["DDRDRR", "DRDDRR"]
Explanation: There are two valid paths from the source cell (0, 0) to the destination cell (3, 3).

Input: maze[][] = [[1, 0], [1, 0]]
Output: []
Explanation: No path exists as the destination cell (1, 1) is blocked. */



import java.util.ArrayList;

class Solution {

    static boolean isSafeToMove(int newX, int newY, int n, int[][] maze, boolean[][] visited) {

        if (newX < 0 || newX >= n || newY < 0 || newY >= n)
            return false;

        if (maze[newX][newY] == 0)
            return false;

        if (visited[newX][newY])
            return false;

        return true;
    }

    static void solve(int[][] maze, int srcX, int srcY,
                      int desX, int desY,
                      boolean[][] visited,
                      ArrayList<String> ans,
                      String path) {

        // Base Case
        if (srcX == desX && srcY == desY) {
            ans.add(path);
            return;
        }

        visited[srcX][srcY] = true;
        int n = maze.length;

        int newX, newY;

        // Down
        newX = srcX + 1;
        newY = srcY;
        if (isSafeToMove(newX, newY, n, maze, visited)) {
            solve(maze, newX, newY, desX, desY, visited, ans, path + "D");
        }

        // Left
        newX = srcX;
        newY = srcY - 1;
        if (isSafeToMove(newX, newY, n, maze, visited)) {
            solve(maze, newX, newY, desX, desY, visited, ans, path + "L");
        }

        // Right
        newX = srcX;
        newY = srcY + 1;
        if (isSafeToMove(newX, newY, n, maze, visited)) {
            solve(maze, newX, newY, desX, desY, visited, ans, path + "R");
        }

        // Up
        newX = srcX - 1;
        newY = srcY;
        if (isSafeToMove(newX, newY, n, maze, visited)) {
            solve(maze, newX, newY, desX, desY, visited, ans, path + "U");
        }

        // Backtracking
        visited[srcX][srcY] = false;
    }

    public ArrayList<String> ratInMaze(int[][] maze) {

        ArrayList<String> ans = new ArrayList<>();

        int n = maze.length;

        // If source or destination is blocked
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0)
            return ans;

        boolean[][] visited = new boolean[n][n];

        solve(maze, 0, 0, n - 1, n - 1, visited, ans, "");

        return ans;
    }
}