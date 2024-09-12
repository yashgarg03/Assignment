import java.util.Scanner;

public class Assignment {

    //    1st part –

    // Array that contains the LCD representation of digits
    private static final String[][] LCD_DIGITS = {
        {" _ ", "| |", "|_|"}, // 0
        {"   ", "  |", "  |"}, // 1
        {" _ ", " _|", "|_ "}, // 2
        {" _ ", " _|", " _|"}, // 3
        {"   ", "|_|", "  |"}, // 4
        {" _ ", "|_ ", " _|"}, // 5
        {" _ ", "|_ ", "|_|"}, // 6
        {" _ ", "  |", "  |"}, // 7
        {" _ ", "|_|", "|_|"}, // 8
        {" _ ", "|_|", " _|"} // 9
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = scanner.nextLine();
        displayLCDNumber(number);
    }

    // Function to display the LCD number
    private static void displayLCDNumber(String number) {
        for (int row = 0; row < 3; row++) {
            for (int i = 0; i < number.length(); i++) {
                char digit = number.charAt(i);
                if (Character.isDigit(digit)) {
                    System.out.print(LCD_DIGITS[digit - '0'][row]);
                }
                if (i < number.length() - 1) {
                    System.out.print(" "); // space between digits
                }
            }
            System.out.println(); // move to the next row
        }
    }
}
