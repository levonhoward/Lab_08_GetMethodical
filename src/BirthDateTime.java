import java.util.Scanner;

public class BirthDateTime
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;

        birthYear = SafeInput.getRangedInt(in, "Enter the year you were born", 1950, 2015);
        birthMonth = SafeInput.getRangedInt(in, "Enter the month you were born", 1, 12);

        switch (birthMonth)
        {
            case 1, 3, 5, 7, 8, 10, 12:
                birthDay = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 31);
                break;
            case 4, 6, 9, 11:
                birthDay = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 30);
                break;
            case 2:
                birthDay = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 29);
                break;
        }

        birthHour = SafeInput.getRangedInt(in, "Enter the hour you were born", 0, 23);
        birthMinute = SafeInput.getRangedInt(in, "Enter the minute you were born", 0, 59);

        System.out.println("You were born at " + birthHour + ":" + birthMinute + " on " + birthMonth + "/" + birthDay + "/" + birthYear);
    }
}
