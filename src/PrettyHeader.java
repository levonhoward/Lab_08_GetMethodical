import java.util.Scanner;

public class PrettyHeader
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        SafeInput.prettyHeader(SafeInput.getNonZeroLenString(in, "Enter the header message"));
    }
}
