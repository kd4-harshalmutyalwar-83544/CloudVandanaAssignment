// Enter a Roman Number as input and convert it to an integer. (ex IX = 9)

import java.util.Scanner;
public class Q2 
{
    static int value(char r) 
    {
        switch (r) 
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; 
        }
    }


    static int romanToDecimal(String s)
     {
        int result = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            int current = value(s.charAt(i));

            int next = (i + 1 < s.length()) ? value(s.charAt(i + 1)) : 0;

            result += (current < next) ? -current : current;
        }

        return result;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roman Number:");
        String str = sc.next();

        System.out.println("The integer value of " + str + " is: " + romanToDecimal(str));
    }
}


