package ru.vsu.cs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("---------- Task 5 ----------");
        int size = readSize();
        printTheHourglass(size);
    }

    private static int readSize()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        return scanner.nextInt();
    }

    private static void printTheHourglass(int size)
    {
        printTheFirstAndTheLastString(size);
        printTheTopPart(size);
        printTheMiddlePart(size);
        printTheBottomPart(size);
        printTheFirstAndTheLastString(size);
    }


    private static void printTheFirstAndTheLastString(int size)
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print('*');
        }
        System.out.println();
    }

    private static void printTheMiddlePart(int size)
    {
        if (size % 2 == 0)
        {
            for (int i = 0; i < size / 2 - 1; i++)
            {
                System.out.print(' ');
            }
            System.out.println("**");
        }
        else
        {
            for (int i = 0; i < size / 2; i++)
            {
                System.out.print(' ');
            }
            System.out.print('*');
        }
        System.out.println();
    }

    private static void printTheTopPart(int size)
    {
        for (int i = 1; i < size / 2; i++)
        {
            for (int j = 1; j <= i && i < size / 2; j++)
            {
                System.out.print(' ');

                if (j == i)
                {
                    System.out.print('*');
                }
            }

            for (int j = 1; ; j++)
            {
                System.out.print(' ');

                if (j == size - 2 * (1 + i))
                {
                    System.out.println('*');
                    break;
                }
            }

            if (size % 2 == 0 && i == (size - 3) / 2)
            {
                break;
            }
        }
    }

    private static void printTheBottomPart(int size)
    {
        int space = 1;

        if (size % 2 == 0)
        {
            space = 0;
        }

        for (int i = size / 2; i > 1; i--)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(' ');

                if (j == i - 2)
                {
                    System.out.print('*');
                    break;
                }
            }

            for (int j = 1; j <= space; j++)
            {
                System.out.print(' ');
            }
            
            System.out.println('*');

            space = space + 2;
        }
    }
}


