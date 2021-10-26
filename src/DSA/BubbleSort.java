package DSA;

import java.util.Scanner;

public class BubbleSort
{
    public static void bubbleSort()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to work with: ");
        int length = input.nextInt();
        int[] array = new int[length];
        int index;

        //Allowing the user to input the array size and populating the array with integer values;
        System.out.println("Please input your numbers");
        for (index = 0; index < length; index++)
        {
            array[index] = input.nextInt();
        }

        //Printing out the user's values
        System.out.println("These are your numbers");
        for (index = 0; index < length; index++)
        {
            System.out.print(array[index] + "\t");
        }

        System.out.println("\n");


        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    // Swapping array[j+1] and array[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int j : array) System.out.print(j + " ");
        System.out.println();
    }
}

