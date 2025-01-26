// Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. 

import java.util.Random;

public class Q1 
{
    public static void shuffle(int arr[]) 
    {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) 
        {
            int randomIndex = random.nextInt(i + 1);
            
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }

    public static void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(+ arr[i]+ " ");
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        
        shuffle(arr);
         
        printArray(arr);
        }
    }
    

