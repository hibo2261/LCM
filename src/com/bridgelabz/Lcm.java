package com.bridgelabz;
import java.util.Scanner;

public class Lcm
{
    public static void main (String[]args)
    {
        System.out.println("********************************************");
        System.out.println(" Welcome to LCM Program....");   //Printing Welcome Meassage
        System.out.println("********************************************");



        System.out.println("Enter A Number 1 --->"); // taking input from user
        Scanner sc = new Scanner(System.in); // creating a scanner object
        int num1 = sc.nextInt();
        System.out.println("Enter A Number 2 --->"); // taking input from user
        int num2 = sc.nextInt();


        int gcd = 1;

        for(int i = 1; i <= num1 && i <= num2; ++i)
        {

            if(num1 % i == 0 && num2 % i == 0)

                gcd = i;
        }

        int lcm = (num1 * num2) / gcd;

        System.out.println("The LCM Of "+num1+" And "+num2+" Is = "+lcm);
    }
    }

