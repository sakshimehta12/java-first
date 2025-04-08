public class OccurrenceCounter {
    public static void main(String[] args) {
        String[] items = {"apple", "banana", "apple", "orange", "banana", "apple"};
        String target = "apple";

        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(target)) {
                count++;
            }
        }

        System.out.println("Occurrences of '" + target + "': " + count);
    }
}
