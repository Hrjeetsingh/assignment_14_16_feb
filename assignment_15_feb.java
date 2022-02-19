
import java.util.Arrays;
import java.util.Scanner;

/*"1. add two 2D matrices to get the result matrix (Add the elements at corresponding rows and columns positions)
2. Given an M × N integer matrix, print it in spiral order
   Input:
 
	[  1   2   3   4  5 ]
	[ 16  17  18  19  6 ]
	[ 15  24  25  20  7 ]
	[ 14  23  22  21  8 ]
	[ 13  12  11  10  9 ]
 
	Output:
 
		1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
		
3.  Change all elements of row `i` and column `j` in a matrix to 0 if cell `(i, j)` is 0
	Input :
		[ 1  1  0  1  1 ]
		[ 1  1  1  1  1 ]
		[ 1  1  1  0  1 ]
		[ 1  1  1  1  1 ]
		[ 0  1  1  1  1 ]
 
	Output:
 
		[ 0  0  0  0  0 ]
		[ 0  1  0  0  1 ]
		[ 0  0  0  0  0 ]
		[ 0  1  0  0  1 ]
		[ 0  0  0  0  0 ]"*/

// "1. add two 2D matrices to get the result matrix (Add the elements at corresponding rows and columns positions)

class addTomatrix {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" row and column are same");
		System.out.print("enter size of row :");
		int m=s.nextInt();
		System.out.print("enter size of column :");
		int n=s.nextInt();

		System.out.println("enter value in m1 matrix ");
		int m1[][]=new int[m][n];			
		int m2[][]=new int[m][n];
		for(int i=0;i<m;i++){
			System.out.println(m+" column row "+(i+1)+" ");
			for(int j=0;j<n;j++){
				System.out.print("col "+(j+1)+" ");
				m1[i][j]=s.nextInt();
			}
		}
		System.out.println("enter value in m2 matrix ");

		for(int i=0;i<m;i++){
			System.out.println(n+" column row "+(i+1)+" ");
			for(int j=0;j<n;j++){
				System.out.print("col "+(j+1)+" ");
				m2[i][j]=s.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(m1));
		System.out.println(Arrays.deepToString(m1));
		System.out.println(" ");

		addmatrix(m1, m2,n,m);
		s.close();

	}
	private static void addmatrix(int m1[][], int m2[][], int n,int m){
		int sum[][]=new int[m][n];
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m2.length;j++){
				sum[i][j]=m1[i][j]+m2[i][j];
			}
		}
		System.out.println(Arrays.deepToString(sum));
	}
}

// 2. Given an M × N integer matrix, print it in spiral order

class spiralorder{
	public static void main(String[] args) {
		int matrix[][]={{ 1, 2, 3, 4, 5},
						{16, 17, 18, 19, 6},
						{15, 24, 25, 20, 7},
						{14, 23, 22, 21, 8},
						{13, 12, 11, 10, 9}};

		
		printSpiralOrder(matrix);	
	}
	private static void printSpiralOrder(int[][] mat)
    {
        // base case
        if (mat == null || mat.length == 0) {
            return;
        }
 
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;
 
        while (true)
        {
            if (left > right) {
                break;
            }
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;
 
            if (top > bottom) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;
 
            if (left > right) {
                break;
            }
            for (int i = right; i >= left; i--) {
                System.out.print(mat[bottom][i] + " ");
            }
            bottom--;
            if (top > bottom) {
                break;
            }
            for (int i = bottom; i >= top; i--) {
                System.out.print(mat[i][left] + " ");
            }
            left++;
        }
    }
}


// 3.  Change all elements of row `i` and column `j` in a matrix to 0 if cell `(i, j)` is 0

class zerocell{
	public static void main(String[] args) {
		int[][] matrix =
        {
            { 1, 1, 0, 1, 1 },
            { 1, 1, 1, 1, 1 },
            { 1, 1, 0, 1, 1 },
            { 1, 1, 1, 1, 1 },
            { 0, 1, 1, 1, 1 }
        };
 
        convert(matrix);
 
        for (var r: matrix) {
            System.out.println(Arrays.toString(r));
        }
    }
	public static void changeRowColumn(int[][] mat, int M, int N, int x, int y)
    {
        for (int j = 0; j < N; j++)
        {
            if (mat[x][j] != 0) {
                mat[x][j] = -1;
            }
        }
 
        for (int i = 0; i < M; i++)
        {
            if (mat[i][y] != 0) {
                mat[i][y] = -1;
            }
        }
    }
 
    public static void convert(int[][] mat)
    {
  
        if (mat == null || mat.length == 0) {
            return;
        }
        int M = mat.length;
        int N = mat[0].length;
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (mat[i][j] == 0)           
                {
                    changeRowColumn(mat, M, N, i, j);
                }
            }
        }

        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
            }
        }
    }

}