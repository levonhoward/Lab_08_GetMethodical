import java.util.Scanner;

public class Reggie
{
    static void main()
    {
        Scanner in = new Scanner(System.in);

        String SSN = SafeInput.getRegExString(in, "Enter your Social Security Number", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Make sure you never share " + SSN + " with anyone.");

        String UCMNumber = SafeInput.getRegExString(in, "Enter your University of Cincinnati M number", "^(M|m)\\d{5}$");
        System.out.println("The number " + UCMNumber + " is unique to you!");

        String menuChoice = SafeInput.getRegExString(in, "Choose one: [O]pen | [S]ave | [V]iew | [Q]uit", "^[OoSsVvQq]$");
        System.out.println("You chose " + menuChoice + "!");
    }
}
