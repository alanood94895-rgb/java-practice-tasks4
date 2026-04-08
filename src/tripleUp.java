public class tripleUp {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 6, 2};
        int[] arr2 = {1, 2, 4, 5, 7};

        System.out.println(tripleUp(arr1));
        System.out.println(tripleUp(arr2));
    }

    public static boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 1 &&
                    nums[i + 2] == nums[i] + 2) {
                return true;
            }
        }
        return false;
    }
}
