public class matrixBinarySearch {
    static int[] matrixSearch(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        int cols = matrix[0].length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target >= matrix[mid][0] && target <= matrix[mid][cols - 1]) {
                int colIndex = binarySearch(matrix[mid], target);
                if (colIndex != -1) {
                    return new int[]{mid, colIndex};
                }
                return new int[]{-1, -1};
            } else if (target < matrix[mid][0]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 6;
        int[] result = matrixSearch(matrix, target);
        if (result[0] != -1) {
            System.out.println("Element found at index [" + result[0] + "," + result[1] + "]");
        } else {
            System.out.println("Element not found.");
        }
    }
}
