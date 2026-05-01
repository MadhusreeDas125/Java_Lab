public class StringUtils {
    public static void main(String[] args) {
        String test = "Data structures and Algorithms";

        // Task: Replace 'd' with 'f'
        String replaced = test.replace('d', 'f').replace('D', 'F');
        System.out.println("Replaced String: " + replaced);

        // Task: Toggle Case
        StringBuilder toggled = new StringBuilder();
        for (char c : test.toCharArray()) {
            if (Character.isUpperCase(c)) toggled.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c)) toggled.append(Character.toUpperCase(c));
            else toggled.append(c);
        }
        System.out.println("Toggled Case: " + toggled);
    }
}
