import java.util.Arrays;

public class lcs_prefix{
    public static void main(String[] args) {
        int nums [] = {-4,2,-6,8,7,-5};
        int n = nums.length;

        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        System.out.println(Arrays.toString(prefix));

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int sum = prefix[j + 1] - prefix[i];

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}