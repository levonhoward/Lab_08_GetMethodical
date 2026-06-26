import java.util.Scanner;

/**
 * @author Levon Howard howardlv@mail.uc.edu
 */

public class SafeInput
{
    /**
     * Ask the user to enter a String and return after they enter one that is not zero length
     *
     * @param pipe - a Scanner opened to read from System.in
     * @param prompt - prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't

        do
        {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    /**
     * Ask the user to enter any integer and return the first valid integer entered
     *
     * @param pipe - a Scanner opened to read from System.in
     * @param prompt - prompt for user
     * @return a valid integer
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int validInt = 0;
        String invalidInput = "";
        boolean isValidInt = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                validInt = pipe.nextInt();
                pipe.nextLine();    // clear buffer
                isValidInt = true;
            }
            else
            {
                invalidInput = pipe.nextLine();
                System.out.println("Please enter a valid integer, not: " + invalidInput);
            }
        } while (!isValidInt);

        return validInt;
    }

    /**
     * Ask the user to enter any double and return the first valid number entered
     *
     * @param pipe - a Scanner opened to read from System.in
     * @param prompt - prompt for user
     * @return a valid double
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double validDouble = 0.0;
        String invalidInput = "";
        boolean isValidDouble = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                validDouble = pipe.nextDouble();
                pipe.nextLine();    // clear buffer
                isValidDouble = true;
            }
            else
            {
                invalidInput = pipe.nextLine();
                System.out.println("Please enter a valid double, not: " + invalidInput);
            }
        } while (!isValidDouble);

        return validDouble;
    }

    /**
     * Ask the user to enter any integer between low and high (inclusive), and return the first valid integer entered
     *
     * @param pipe - a Scanner opened to read from System.in
     * @param prompt - prompt for user
     * @param low - the minimum acceptable value
     * @param high - the maximum acceptable value
     * @return a valid integer between low and high (inclusive)
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int userInt = 0;

        do
        {
            userInt = getInt(pipe, (prompt + " [" + low + " - " + high + "]"));

            if (userInt < low || userInt > high)
            {
                System.out.println("Please enter an integer between " + low + " and " + high + " (inclusive), not " + userInt);
            }
        } while (userInt < low || userInt > high);

        return userInt;
    }

    /**
     * Ask the user to enter any double between low and high (inclusive), and return the first valid number entered
     *
     * @param pipe - a Scanner opened to read from System.in
     * @param prompt - prompt for user
     * @param low - the minimum acceptable value
     * @param high - the maximum acceptable value
     * @return a valid double between low and high (inclusive)
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double userDouble = 0;

        do
        {
            userDouble = getDouble(pipe, (prompt + " [" + low + " - " + high + "]"));

            if (userDouble < low || userDouble > high)
            {
                System.out.println("Please enter a double between " + low + " and " + high + " (inclusive), not " + userDouble);
            }
        } while (userDouble < low || userDouble > high);

        return userDouble;
    }

    /**
     * Asks the user to respond yes or no to a prompt and returns true if yes and false if no
     *
     * @param pipe - a Scanner opened to read from System.in
     * @param prompt - prompt for user
     * @return true if user enters 'yes' and false if user enters 'no'
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean userAnswer = false;
        String input = "";
        boolean isValidInput = false;

        do
        {
            System.out.print("\n" + prompt + " [Y/N]: ");
            input = pipe.nextLine();
            if (input.equalsIgnoreCase("y"))
            {
                userAnswer = true;
                isValidInput = true;
            }
            else if (input.equalsIgnoreCase("n"))
            {
                userAnswer = false;
                isValidInput = true;
            }
            else
            {
                System.out.println("Please enter [y]es or [n]o, not: " + input);
            }
        } while (!isValidInput);

        return userAnswer;
    }

    /**
     * Prompts the user to enter a string and checks if it matches the regEx pattern
     *
     * @param pipe - a Scanner opened to read from System.in
     * @param prompt - prompt for user
     * @param regEx - a regEx pattern in java String format
     * @return user input which matches the regEx pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String input = "";
        boolean isValidInput = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            input = pipe.nextLine();

            if (input.matches(regEx))
            {
                isValidInput = true;
            }
            else
            {
                System.out.println("Please enter a response that matches " + regEx + " and not " + input);
            }
        } while (!isValidInput);

        return input;
    }
}
