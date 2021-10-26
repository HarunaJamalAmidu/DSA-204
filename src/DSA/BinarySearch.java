package DSA;

import java.util.Scanner;

public class BinarySearch
{
    public static void binarySearch()
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
        System.out.println("Please input your search key: ");
        int key = input.nextInt();
        int low = 0;
        int high = length - 1;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (array[mid] == key) {
                System.out.println("Key can be located at array index " + mid);
                break;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }

        if (low > high) {
            System.out.println("Key cannot be located in the array ");
        }

    }
}

