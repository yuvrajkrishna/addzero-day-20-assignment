class lcs_kadane {
    public static void main(String args[]) {
        int nums [] = {-4,2,-6,8,7,-5};
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(
                nums[i],
                currentSum + nums[i]
            );

            maxSum = Math.max(maxSum, currentSum);
        }

       System.out.println(maxSum);
    }
}