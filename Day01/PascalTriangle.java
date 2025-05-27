import java.util.*;
class PascalTriangle{
    public static void main(String[] args) {
        int numRows = 5; 
        List<List<Integer>> triangle = generate(numRows);
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        int [][]N = new int[numRows][numRows];
        for(int i=0;i<numRows;i++){
            N[i][0]=1;
            for(int j=1;j<=i;j++){
                N[i][j]=N[i-1][j]+N[i-1][j-1];
            }
        }
        List<List<Integer>>result =new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>l1 =new ArrayList<>();
            for(int j=0;j<=i;j++){
                l1.add(N[i][j]);
            }
            result.add(l1);
        }
        return result;

    }
}