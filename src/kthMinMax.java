import java.util.PriorityQueue;
import java.util.Collections;

public class kthMinMax {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int kthMin = findKthMin(arr, k);
        int kthMax = findKthMax(arr, k);
        System.out.println("The " + k + "th minimum element is: " + kthMin);
        System.out.println("The " + k + "th maximum element is: " + kthMax);
    }

    static int findKthMin(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.add(num);
        }
        for (int i = 1; i < k; i++) {
            minHeap.poll();
        }
        return minHeap.poll();
    }

    static int findKthMax(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) {
            maxHeap.add(num);
        }
        for (int i = 1; i < k; i++) {
            maxHeap.poll();
        }
        return maxHeap.poll();
    }
}
