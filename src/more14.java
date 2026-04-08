public class more14 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 1};
        int[] arr2 = {1, 4, 4, 1};

        System.out.println(more14(arr1));
        System.out.println(more14(arr2));

    }

    public static boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1++;
            }
            if (nums[i] == 4) {
                count4++;
            }
        }

        return count1 > count4;
    }
}
