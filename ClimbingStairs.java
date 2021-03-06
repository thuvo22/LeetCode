package climbing.stairs;

public class ClimbingStairs {
	public static void main(String[] args) {
		int n  = 5;
		System.out.println(climbStairs(n));
	}

	public static int climbStairs(int n) {
		{
			/* Declare an array to store Fibonacci numbers. */
			int f[] = new int[n + 1]; // 1 extra to handle case, n = 0
			int i;

			/* 0th and 1st number of the series are 0 and 1 */
			f[0] = 0;
			f[1] = 1;

			for (i = 2; i <= n; i++) {
				/*
				 * Add the previous 2 numbers in the series and store it
				 */
				f[i] = f[i - 1] + f[i - 2];
			}

			return f[n];
		}
	}
}
