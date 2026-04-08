public class isEverywhere {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 5};
        int[] array1 = {1,3,5,7,8};

        System.out.println(isEverywhere(array, 1));
        System.out.println(isEverywhere(array1, 1));
    }

    public static boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }

}
