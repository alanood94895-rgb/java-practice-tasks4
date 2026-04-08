public class has77 {
    public static void main (String[] args){
        int [] array = {7,7};
        int [] array1 = {7,3,7};
        System.out.println(has77(array));
        System.out.println(has77(array1));
    }
    public static boolean has77 (int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == 7 && nums[i + 1] == 7) {
                return true;
            }
            if (i + 2 < nums.length && nums[i] == 7 && nums[i + 2] == 7) {
                return true;
            }
        }
        return false;

    }
}
