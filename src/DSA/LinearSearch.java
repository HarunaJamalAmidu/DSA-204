package DSA;
import java.util.Scanner;

public class LinearSearch
{
    public static void linearSearch()
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
        int temp = 0;


        for (int i=0; i<array.length;i++)
        {
            if(array[i] == key)
            {
                System.out.println("Key can be located at array index " + i);
                temp++;
            }
        }

        if(temp == 0)
        {
            System.out.println("Key cannot be located");
        }


    }


}
