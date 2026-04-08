public class centeredAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 99};
        System.out.println(centeredAverage(arr));
    }

    public static int centeredAverage(int[] nums) {
        int sum = 0;
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        sum = sum - min - max;

        return sum / (nums.length - 2);
    }
}
