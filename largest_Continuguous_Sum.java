
public class largest_Continuguous_Sum {
    public  static void  main(String args[]) {
        int nums [] = {-4,2,-6,8,7,-5};
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}