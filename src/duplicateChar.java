public class duplicateChar{
    public static void main(String[] args) {
        String str = "Hello World";
        str = str.toLowerCase();
        int[] count = new int[256];
        for (char ch : str.toCharArray()) {
            count[ch]++;
        }
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1 && i != ' ') {
                System.out.println((char) i + " appears " + count[i] + " times.");
            }
        }
    }
}
