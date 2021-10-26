package DSA;

import java.util.Scanner;

public class InsertionSort
{
    public static void insertionSort()
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
        for (index = 0; index < array.length; index++)
        {
            System.out.print(array[index] + "\t");
        }

        for (int i = 1; i < array.length; ++i)
        {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp)
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        for (int j : array) System.out.print(j + " ");

    }
}
