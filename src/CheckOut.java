import java.util.Scanner;

public class CheckOut
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.00;
        boolean hasMoreItems = true;

        System.out.println("Welcome to the $10 store! All our items are between $0.50 and $10.00.");

        do
        {
            totalCost += SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);

            if (!SafeInput.getYNConfirm(in, "Do you have another item"))
            {
                hasMoreItems = false;
            }
        } while (hasMoreItems);

        System.out.printf("The total cost of your items is $%.2f.", totalCost);
    }
}
