public class P2_20BRS1193 {
    
    public static int[][]  matrixMultiplication(int[][] a, int[][] b){
        
        int r1 = a.length;
        int c1 = a[0].length;
        int r2 = b.length;
        int c2 = b[0].length;

        int [][] c = new int[r1][c2];
        
        if(c1 != r2)
        {
            System.out.println("Invalid matrices.");
            return c;
        }

        for(int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < r2; k++) 
                    c[i][j] += a[i][k] * b[k][j];
            
        return c;
    }

    public static void printMatrix(int [][] a){
        int r = a.length;
        int c = a[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int [][] x = {{1, 3, 6}, {0, 5, 7}, {9, 8, 2}};    
        int [][] y = {{8, 4, 6}, {3, 5, 2}, {7, 9, 1}};

        int [][] z = matrixMultiplication(x, y);

        System.out.println("Matrix 1:");
        printMatrix(x);
        System.out.println("Matrix 2: ");
        printMatrix(y);
        System.out.println("Sum of Matrix 1 and Matrix 2: ");
        printMatrix(z);

        System.out.println();

        int [][] q = {{1, 3, 6}, {0, 5, 7}};    
        int [][] w = {{8, 4, 6, 5}, {3, 5, 2, 1}, {7, 9, 1, 0}};

        int [][] v = matrixMultiplication(q, w);

        System.out.println("Matrix 1:");
        printMatrix(q);
        System.out.println("Matrix 2: ");
        printMatrix(w);
        System.out.println("Sum of Matrix 1 and Matrix 2: ");
        printMatrix(v);
    }
}
