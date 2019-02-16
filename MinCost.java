import java.util.*;

class MinCost
{
 
    private static int minCost(int cost[][], int m, int n)
    {
        int minCost[][]=new int[m+1][n+1];
        /* Initialise the first column of the minimum cost (table) array */
        /* Initialise the first row of the table array */
        /* Construct the rest of the table array from the recursion relation */
        minCost[0][0] = cost[0][0];
        
        for(int j = 1; j <= n; j++) {
            minCost[0][j] = minCost[0][j - 1] + cost[0][j];
        }
        
        for(int i = 1; i <= m; i++) {
            minCost[i][0] = minCost[i - 1][0] + cost[i][0];
        }
        
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                minCost[i][j] = Math.min(Math.min(minCost[i - 1][j - 1], minCost[i - 1][j]), minCost[i][j - 1]) + cost[i][j];
            }
        }
        
        return minCost[m][n];
    }
 
    public static void main(String args[])
    {
        int cost[][]= {{1, 2, 3},
                       {4, 8, 2},
                       {1, 5, 3}};
        Scanner scan = new Scanner(System.in);
        int xCoordinate = scan.nextInt();
        int yCoordinate = scan.nextInt();
        System.out.println(minCost(cost,xCoordinate,yCoordinate));
    }
}
