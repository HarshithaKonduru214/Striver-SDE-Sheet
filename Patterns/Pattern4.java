//Print the below Pattern, for the given value of N
//1
//2 2 
//3 3 3
public class Pattern4 {
    public static void nTriangle(int n) {
        // Write your code here
        for(int row = 0; row < n; row++) {
            for(int column = 0; column < row + 1; column++) {
                System.out.print(row + 1 + " ");
            }
            System.out.println();
        }
    }
}
