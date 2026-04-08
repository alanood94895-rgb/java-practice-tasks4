public class haveThree {
    public static void main(String[] args) {
        int[] array = {3, 1, 3, 1};
        int[] array1 = {3, 1, 3, 3};

        System.out.println(haveThree(array));
        System.out.println(haveThree(array1));
    }

    public static boolean haveThree(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;

                if (i + 1 < nums.length && nums[i + 1] == 3) {
                    return false;
                }
            }
        }
        return count == 3;
    }

}
