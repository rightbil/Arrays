package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
//1. Practice With Arrays tested
               /* int[] myArray = new  int[]{1,2,3,4,5,6,7,8,9,10};
                int sumOfValues=0;
                for(int i=0; i<myArray.length; i++)
                {
                    sumOfValues+= myArray[i];
                }
                System.out.println("Sum of the 10 numbers in array is :" + sumOfValues);
        */

// 2 ArrayExercises X2
        //2.1. string reverse
  /*      System.out.println("Enter your word to be be reversed? ");
        String str = keyboard.nextLine();
        for(int i=str.length()-1; i>=0; i-- )
        {
            System.out.print(str.charAt(i));
        }*/
        //2.2.length of input
/*        System.out.println("Enter your word");
        String knowMyLength = keyboard.nextLine();
        int yourLength=0;

        char[] charArray =knowMyLength.toCharArray();
        for(char c: charArray)
        {
           yourLength++;

        }
        System.out.println("Length of " + knowMyLength +" is " + yourLength);*/

        //2.3. Accept and remove duplicates
        //System.out.println("Enter 10 Numbers");
/*        int[] tenNumbers = new int[10];
        int inputNubmer = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter 10 Numbers");
            tenNumbers[i] = keyboard.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(tenNumbers[i] + " ");
        }
        boolean isDuplicate;
        for (int i = 0; i < 10; i++) {
            isDuplicate = false;
            if (i == 0) {
            }
            // for index starting from 1 on wards we need to lookback
            else {
                for (int j = i - 1; j >= 0; j--) {

                    if (tenNumbers[i] == tenNumbers[j]) {
                        isDuplicate = true;
                        break;
                    }// inner loop
                }
            } // end of else
            if (isDuplicate == false)
                System.out.print(tenNumbers[i] + " ");
        }//outer loop*/

//2. 4 Two Arrays
       /* int[] arrayOne = new int[]{1, 7, 6, 5, 9};
        int[] arrayTwo = new int[]{2, 7, 6, 3, 4};
        int flag=-1;
        for (int i = 0; i < arrayOne.length; i++) {
            if (flag != arrayOne[i]) {
                for (int j = 0; j < arrayTwo.length; j++) {
                    if (arrayOne[i] + arrayTwo[j] == 13) {
                        System.out.println("(" + arrayOne[i] + "," + arrayTwo[j] + ")");
                        flag = arrayTwo[j];
                    }
                }

            }
        }*/

//2.5 display Even and Odd Counts
    /*            int[] userArray = new  int[10];
                int userLength= userArray.length;
                int countEven=0;
                int countOdd=0;
                while (userLength > 0) {
                    System.out.println("Enter Your Number:");
                    userArray[userArray.length - userLength] = keyboard.nextInt();
                    if(userArray[userArray.length - userLength]%2==0) {
                        countEven++;
                    }
                    else {
                        countOdd++;
                    }
                    userLength--;

                }
                System.out.println(String.format("Count of Even= %d and Odd %d in the array" , countEven ,countOdd));
*/
        // 3 multidimensional array
        //3.1 Print rows and columns
    /*    int[][] multiArray = new int[10][5];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                multiArray[i][j] = j;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("row " + i + " col " + multiArray[i][j] + " ");
            }
            System.out.println();
        }*/
        //3.2 multiplication tables
   /*     int[][] multiArray = new int[12][12];
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                multiArray[i - 1][j - 1] = j;
            }
        }
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                System.out.print(i * multiArray[i - 1][j - 1] + "\t");
            }
            System.out.println();
        }*/
//4 Locker Problems
        //  Write a program to simulate the following experiment. You have 100 closed lockers. Start with the first locker and for every locker open it. Now, starting with the second locker, for this locker and every second locker after that, if the locker is open, close it; if it is closed, open it. Then, starting with the third locker, for this locker and every third locker after that, if the locker is open, close it; if it is closed, open it. Continue with the nth locker changing the “position” of every nth locker until n = 100. Print out the locker numbers that remain open. What do you notice about the lockers that remain open?
        int lockerSize = 10;
        char[] lockerProblem = new char[lockerSize];
        for (int i = 0; i < lockerProblem.length; i++) {
            lockerProblem[i] = 'L'; // locked
        }
        System.out.println("Show Locked Rooms");
        for (int i = 0; i < lockerProblem.length; i++) {
            System.out.print("Room " + i + " " + lockerProblem[i] + " ");
        }
        //Open every locker
        for (int i = 0; i < lockerProblem.length; i++) {
            lockerProblem[i] = 'O'; // Open
        }
        System.out.println("Show Opened Lockers");
        for (int i = 0; i < lockerProblem.length; i++) {
            System.out.println("Room " + i + " " + lockerProblem[i] + " ");
        }
        // for 2nd and every 2 after that if open , close the locker
        for (int i = 2; i < lockerProblem.length; i++) {
            for (int j = i; j < lockerProblem.length; j += i) {
                //if open close it and viseversa
                lockerProblem[j] = lockerProblem[j] == 'O' ? 'L' : 'O';
            }
        }
        //
// 5 An Array to Remember

        /*Storing the history of values in a program is a common task. Maintaining an object's history requires the programmer to either write specific code or use a library which supports history logging. Today you're going to write specific code to store the history of a list.

                Type in the names of the last ten presidents in the order they were elected. When you are done, enter the word history. Your program should display their names starting with the most recent.

                For your convenience, the names of the last 10 presidents are:

        Johnson, Nixon, Ford, Carter, Reagan, Bush, Clinton, Bush, Obama, Trump*/
        //String p[] = new String[10];

        /*



// I dont know where the exercises were but i did them.
// 10 number inputs from the user and print that total tested
           /*     int[] userArray = new  int[10];
                int userLength= userArray.length;
                int sumFromUser=0;
                double averageOfNumbers=0;
                while (userLength > 0) {
                    System.out.println("Enter Your Number:");
                    userArray[userArray.length - userLength] = keyboard.nextInt();
                    sumFromUser+= userArray[userArray.length - userLength];
                    userLength-=1;

                }
                averageOfNumbers = sumFromUser / userArray.length;
                System.out.println("The average of your inputs is :" + averageOfNumbers);*/

        //Store 3 names and display
         /*       String[] storeNames = new  String[]{"Victor","Ray","Nora"};
                for(int i=0; i<storeNames.length; i++){
                    System.out.println(storeNames[i] + "");
                }*/
        //Print out index for value 5
               /* int[] arrays = new int[]{2, 5, 9, 0, 2, 1, 8, 5, 4};
                for (int i = 0; i < arrays.length; i++) {
                    if (arrays[i] == 5) {
                        System.out.println(i + " ");
                    }
                }*/
        // Print backwards

           /*     int[] arraysBackward = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                for (int i = arraysBackward.length; i > 0; i--) {

                    System.out.println(arraysBackward[i - 1] + " ");
                }*/

        //char arrays not finished
         /*       char[] charsRepalce = new char[]{'w','t','y','h','k'};
                for(int i=0;i<charsRepalce.length; i++) {
                    if (charsRepalce[i] == 't') {
                        charsRepalce[i]="hello";
                    }
                }*/
        // Two Arrays tested
       /*             int[] arrayOne = new int[]{1, 7, 6, 5, 9};
                    int[] arrayTwo = new int[]{2, 7, 6, 3, 4};
                    for (int j = 0; j < arrayOne.length; j++) {
                        for (int k = 0; k < arrayTwo.length; k++) {
                            if (arrayOne[j] == arrayTwo[k]) {
                                System.out.println("(" + arrayOne[j] + "," + arrayOne[j] + ")");
                            }
                            continue;
                        }

                    }*/
    }
}



