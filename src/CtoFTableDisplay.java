public class CtoFTableDisplay
{
    static void main()
    {
        System.out.println("Celsius to Fahrenheit from -100 to 100\n");
        System.out.println("Celsius | Fahrenheit");
        System.out.println("--------|-----------");
        for (int i = -100; i <= 100; i++) {
            double c = i;
            System.out.printf("%.1f \t| %.1f\n", c, CtoF(c));
        }
    }

    /**
     * Takes a double in Celsius and returns it's Fahrenheit equivalent
     *
     * @param celsius - a double temperature in Celsius.
     * @return the equivalent double temperature in Fahrenheit.
     */
    public static double CtoF(double celsius)
    {
        return ((celsius * 1.8) + 32);
    }
}
