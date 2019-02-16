import java.util.Scanner;

class MinJump
{
    public static int minJump(int n)
    {
        int f[] = new int[n+1];
        /* Declare an array to store the minimum jumps. */
        /* Initialise the base condition */
        /* Fill in the array to find Minimum Jumps from a certain distance */
        f[1] = 0;
        
        for(int i = 2; i <= n; i++) {
            if(i % 2 == 0) {
                f[i] = 1 + Math.min(f[i / 2], f[i - 1]);
            } else if(i % 3 == 0) {
                f[i] = 1 + Math.min(f[i / 3], f[i - 1]);
            } else {
                f[i] = 1 + f[i - 1];
            }
        }
        return f[n];
    }
      
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        System.out.println(minJump(distance));
    }
}
