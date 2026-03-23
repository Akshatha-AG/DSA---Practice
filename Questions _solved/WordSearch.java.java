/*
======================== WORD SEARCH (2D GRID) ========================

Problem:
Given an m x n grid of characters (board) and a string (word),
return true if the word exists in the grid, else return false.

Rules:
- You can move only in 4 directions: up, down, left, right
- No diagonal movement
- You cannot reuse the same cell in a single path

-----------------------------------------------------------------------

Example:
board =
[
 ['A','B','C','E'],
 ['S','F','C','S'],
 ['A','D','E','E']
]

word = "ABCCED"  → Output: true
word = "SEE"     → Output: true
word = "ABCB"    → Output: false

-----------------------------------------------------------------------
Approach (Interview Thinking):
1. Traverse every cell in the grid
2. If first character matches → start DFS
3. Explore 4 directions recursively
4. Mark cell as visited (temporarily change value)
5. Backtrack after exploring
6. If all characters matched → return true

-----------------------------------------------------------------------

Time Complexity:
O(m * n * 4^L)
m = rows, n = columns, L = length of word

-----------------------------------------------------------------------

Java Solution (DFS + Backtracking):
*/

class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(0)){
                    if(dfs(board, word, i, j, 0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int i, int j, int index){
        // if all characters matched
        if(index == word.length()){
            return true;
        }

        // boundary + mismatch check
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length
           || board[i][j] != word.charAt(index)){
            return false;
        }

        // mark visited
        char temp = board[i][j];
        board[i][j] = '#';

        // explore 4 directions
        boolean found = dfs(board, word, i+1, j, index+1) ||
                        dfs(board, word, i-1, j, index+1) ||
                        dfs(board, word, i, j+1, index+1) ||
                        dfs(board, word, i, j-1, index+1);

        // backtrack
        board[i][j] = temp;

        return found;
    }
}

/*
-----------------------------------------------------------------------

🧠 Dry Run (ABCCED):
Start at A → B → C → C → E → D
Follow valid adjacent path without revisiting cells → true

-----------------------------------------------------------------------

🚀 Advanced Version:
Word Search II → Find multiple words
Uses: Trie + DFS (very important for interviews)

-----------------------------------------------------------------------
*/