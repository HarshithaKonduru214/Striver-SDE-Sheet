//Print the below Pattern, for the given value of N
//1 2 3
//1 2
//1
public class Pattern6 {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for(int row = 0; row < n; row++) {
            for(int column = 0; column < n - row; column++) {
                System.out.print(column + 1 + " ");
            }
            System.out.println();
        }
    }
}
