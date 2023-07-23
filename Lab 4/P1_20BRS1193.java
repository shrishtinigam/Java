public class P1_20BRS1193 {

    public static int[][]  matrixAddition3x3(int[][] a, int[][] b){
        int [][] c = new int[3][3];
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                c[i][j] = a[i][j] + b[i][j];
            } 
        }
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

        int [][] z = matrixAddition3x3(x, y);

        System.out.println("Matrix 1:");
        printMatrix(x);
        System.out.println("Matrix 2: ");
        printMatrix(y);
        System.out.println("Sum of Matrix 1 and Matrix 2: ");
        printMatrix(z);
    }
}