public class either24 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2};
        int[] arr2 = {4, 4, 1};

        System.out.println(either24(arr1));
        System.out.println(either24(arr2));
    }

    public static boolean either24(int[] nums) {
        boolean has22 = false;
        boolean has44 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                has22 = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                has44 = true;
            }
        }

        return (has22 && !has44) || (!has22 && has44);
    }
}
