public class ReverseWords {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string in quotes.");
            return;
        }

        // Combining args if not quoted, then splitting by space
        String input = String.join(" ", args);
        String[] words = input.split("\\s+");
        
        System.out.print("Reversed: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
