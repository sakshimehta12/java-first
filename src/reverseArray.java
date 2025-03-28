public class reverseArray {
    static void reverse(int[] arr) {
        int n=arr.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++) {
            temp[i]=arr[n-i-1];
        }
        for(int i=0;i<n;i++) {
            arr[i]=temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr={2,31,45,22,65,14};
        reverse(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
