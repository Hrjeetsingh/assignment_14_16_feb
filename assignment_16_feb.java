

/*1.) Find the frequency of odd and even in given matrix

Input : 
[1  3  5]
[2  4  1]
[7  8  9]

Output :
Even = 3
Odd = 6

2.) Find the sum of anti diagonal elements in given matrix

Input :

[1 5 7]
[2 6 8]
[5 8 2]

Anti diagonal elements are = a[0][2] + a[1][1] + a[2][0]

Output : 18

3.) Display the string represented by each row of given matrix.

Input:

["Hello"  "Geekster"]
["Good"  "Day"]

Output:
Row 0 : HelloGeekster  a[0][0]+a[0][1]
Row 1 : GoodDay        a[0][0]+a[0][1]

*/
class oddevenmatrix {
    public static void main(String[] args) {  
        int rows, cols, countOdd = 0, countEven = 0;  
          
        int a[][] = {{1,3,5},{2,4,1},{7,8,9}};  
        rows = a.length;  
        cols = a[0].length;  
          
        
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
              if(a[i][j] % 2 == 0)  
                countEven++;  
              else  
                countOdd++;  
            }  
        }  
          
        System.out.println("odd " + countOdd);  
        System.out.println("even " + countEven);  
    }  
    
}

// 2 Find the sum of anti diagonal elements in given matrix

class sumantidiagonal{
    public static void main(String[] args) {
        int matrix[][]={{1,5,7},{2,6,8},{5,8,2}};
        int sum=0;
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if ((i + j) == col - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}

//3.) Display the string represented by each row of given matrix.

class stingeachmatrix{
    public static void main(String[] args) {
        String mat[][]={{"Hello","Geekster"},{"Good","Day"}};
        int row=mat.length;
        int col=mat[0].length;
        
        for(int i=0;i<col;i++){
            String r1="";
            for(int j=0;j<row;j++){
                if(i==j){
                    r1=r1+mat[j][i];
                }
                if(i!=j){
                    r1=r1+mat[i][j];
                }
            
            }
            System.out.println(r1);        
        }
    }   
}