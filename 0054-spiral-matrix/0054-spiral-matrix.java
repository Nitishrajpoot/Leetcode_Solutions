class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int srow = 0, scol = 0;
        int erow = m - 1, ecol = n - 1;

        while (srow <= erow && scol <= ecol) {

            // Left -> Right
            for (int j = scol; j <= ecol; j++) {
                ans.add(matrix[srow][j]);
            }
            srow++;

            // Top -> Bottom
            for (int i = srow; i <= erow; i++) {
                ans.add(matrix[i][ecol]);
            }
            ecol--;

            // Right -> Left
            if (srow <= erow) {
                for (int j = ecol; j >= scol; j--) {
                    ans.add(matrix[erow][j]);
                }
                erow--;
            }

            // Bottom -> Top
            if (scol <= ecol) {
                for (int i = erow; i >= srow; i--) {
                    ans.add(matrix[i][scol]);
                }
                scol++;
            }
        }

        return ans;
    }
}