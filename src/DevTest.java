import java.util.Scanner;

/**
 * @author Levon Howard howardlv@mail.uc.edu
 */

public class DevTest
{
    static void main()
    {
        Scanner in = new Scanner(System.in);

        // getNonZeroLenString test
        String name = SafeInput.getNonZeroLenString(in, "Please enter your name");
        System.out.println("Nice to meet you " + name + "!");

        // getInt test
        int age = SafeInput.getInt(in, "Please enter your age");
        System.out.println("Wow! You are " + age + " years old!");

        // getDouble test
        double balance = SafeInput.getDouble(in, "Please enter your bank account balance");
        System.out.printf("You have a total of $%.2f in your account!\n", balance);

        // getRangedInt test
        int birthMonth = SafeInput.getRangedInt(in, "Please enter the month you were born in", 1, 12);
        System.out.println("You were born in month " + birthMonth + " of the year. That's a good one!");

        // getRangedDouble test
        double testScore = SafeInput.getRangedDouble(in, "Please enter your last test grade", 0.00, 100.00);
        System.out.printf("You scored a %.2f%% on your test! I hope you tried your best!\n", testScore);

        // getYNConfirm test
        boolean userApproves = SafeInput.getYNConfirm(in, "Please tell me if you like my questions");
        System.out.println("You said it was " + userApproves + " that you like my questions. Thanks for being honest!");

        // getRegExString test
        String phoneNum = SafeInput.getRegExString(in, "Please enter your phone number in the form XXX-XXX-XXXX", "^\\d{3}-\\d{3}-\\d{4}$");
        System.out.println("Your phone number is " + phoneNum + "!");
    }
}
