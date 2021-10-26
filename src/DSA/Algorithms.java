package DSA;

import java.util.Scanner;

public class Algorithms
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi,Please select one of the searching or sorting algorithms below");
        System.out.println("1. Linear Search \n2. Binary Search \n3. Bubble Sort \n4. Insertion Sort ");
        int key = input.nextInt();

        switch(key)
        {
            case 1:
            {
                LinearSearch.linearSearch();
            }

            case 2:
            {
                BinarySearch.binarySearch();
            }

            case 3:
            {
                BubbleSort.bubbleSort();
            }

            case 4:
            {
                InsertionSort.insertionSort();
            }
        }

        input.close();
    }
}
