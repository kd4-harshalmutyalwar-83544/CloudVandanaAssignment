// Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet
//from a-z) 

public class Q3 
{
    static boolean isPangram(String s) 
    {
        for(char ch = 'a'; ch <= 'z'; ch++) 
        {
            boolean found = false;

            for(int i = 0; i < s.length(); i++) 
            {
                if(ch == Character.toLowerCase(s.charAt(i))) 
                {
                    found = true;
                    break;
                }
            }

            if(found == false)
                return false;
        }
        return true;
    }

    public static void main(String[] args) 
    {

        String str = "The quick brown fox jumps over the lazy dog";
        if (isPangram(str) == true)
        {
            System.out.println("Pangram");
        }  
        else
        {
            System.out.println("Not Pangram");  
        }
    }
}

