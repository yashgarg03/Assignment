import java.util.Scanner;

public class Assignment {

    //    2nd part –

    // Base LCD segments for digits
    private static final char[][] BASE_LCD_SEGMENTS = {
        {'-', '|', '|', ' ', '|', '|', '-'}, // 0
        {' ', ' ', '|', ' ', ' ', '|', ' '}, // 1
        {'-', ' ', '|', '-', '|', ' ', '-'}, // 2
        {'-', ' ', '|', '-', ' ', '|', '-'}, // 3
        {' ', '|', '|', '-', ' ', '|', ' '}, // 4
        {'-', '|', ' ', '-', ' ', '|', '-'}, // 5
        {'-', '|', ' ', '-', '|', '|', '-'}, // 6
        {'-', ' ', '|', ' ', ' ', '|', ' '}, // 7
        {'-', '|', '|', '-', '|', '|', '-'}, // 8
        {'-', '|', '|', '-', ' ', '|', '-'} // 9
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String number = scanner.nextLine();

        System.out.println("Enter width (horizontal stretch): ");
        int width = scanner.nextInt();

        System.out.println("Enter height (vertical stretch): ");
        int height = scanner.nextInt();

        displayLCDNumber(number, width, height);
    }

    private static void displayLCDNumber(String number, int width, int height) {
        // Top row (horizontal segment)
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            if (Character.isDigit(digit)) {
                System.out.print(" ");
                System.out.print(repeatChar(BASE_LCD_SEGMENTS[digit - '0'][0], width));
                System.out.print(" ");
            }
            if (i < number.length() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // Upper middle rows (vertical segments)
        for (int h = 0; h < height; h++) {
            for (int i = 0; i < number.length(); i++) {
                char digit = number.charAt(i);
                if (Character.isDigit(digit)) {
                    System.out.print(BASE_LCD_SEGMENTS[digit - '0'][1]);
                    System.out.print(repeatChar(' ', width));
                    System.out.print(BASE_LCD_SEGMENTS[digit - '0'][2]);
                }
                if (i < number.length() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Middle row (horizontal segment)
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            if (Character.isDigit(digit)) {
                System.out.print(" ");
                System.out.print(repeatChar(BASE_LCD_SEGMENTS[digit - '0'][3], width));
                System.out.print(" ");
            }
            if (i < number.length() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // Lower middle rows (vertical segments)
        for (int h = 0; h < height; h++) {
            for (int i = 0; i < number.length(); i++) {
                char digit = number.charAt(i);
                if (Character.isDigit(digit)) {
                    System.out.print(BASE_LCD_SEGMENTS[digit - '0'][4]);
                    System.out.print(repeatChar(' ', width));
                    System.out.print(BASE_LCD_SEGMENTS[digit - '0'][5]);
                }
                if (i < number.length() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Bottom row (horizontal segment)
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            if (Character.isDigit(digit)) {
                System.out.print(" ");
                System.out.print(repeatChar(BASE_LCD_SEGMENTS[digit - '0'][6], width));
                System.out.print(" ");
            }
            if (i < number.length() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    // Helper function to repeat a character
    private static String repeatChar(char ch, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
