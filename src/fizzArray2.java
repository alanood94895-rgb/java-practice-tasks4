public class fizzArray2 {
    public static void main(String[] args) {
        String[] result = fizzArray2(5);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static String[] fizzArray2(int n) {
        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.toString(i);
        }

        return array;
    }
}
