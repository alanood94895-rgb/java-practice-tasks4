public class tenRun {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 4, 20, 3};
        int[] result = tenRun(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] tenRun(int[] nums) {
        int current = 0;
        boolean hasTen = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                current = nums[i];
                hasTen = true;
            } else if (hasTen) {
                nums[i] = current;
            }
        }

        return nums;
    }
}
