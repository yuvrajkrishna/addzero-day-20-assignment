public class lcs_prefixlike {
    public static void main(String[] args) {
        
        int nums [] = {-4,2,-6,8,7,-5};

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            for (int j = i; j < nums.length; j++) {

                sum += nums[j];

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);

    }
}
