public class maxminArray {
        public static void main(String[] args) {
            int[] arr = {12, 5, 8, 25, 3, 18, 30};
            findMinMax(arr);
        }

        public static void findMinMax(int[] arr) {
            int min = arr[0];
            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println("Minimum element: " + min);
            System.out.println("Maximum element: " + max);
        }
}
