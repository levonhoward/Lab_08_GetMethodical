import java.util.Scanner;

public class FavNumbers
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        int favInt = SafeInput.getInt(in, "Enter your favorite integer");
        double favDouble = SafeInput.getDouble(in, "Enter your favorite double");

        System.out.println("Your favorite integer is " + favInt + " and your favorite double is " + favDouble + ".");
    }
}
