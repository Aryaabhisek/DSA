public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat == null || mat.length == 0 || mat[0].length == 0)
            return mat;

        int row = mat.length;
        int col = mat[0].length;

        if (row * col != r * c)
            return mat;

        int[][] result = new int[r][c];

        for (int i = 0; i < r * c; i++) {
            result[i / c][i % c] = mat[i / col][i % col];
        }

        return result;
    }
}
