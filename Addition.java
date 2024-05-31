package org.example;
import java.util.*;
public class Addition
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            float a = sc.nextFloat();
            float b=sc.nextFloat();
            if(a>=0 && b>=0)
            {
                System.out.println("SUM OF TWO NUMBERS : " + (a + b));
            }
            else
            {
                System.out.println("please provide only positive integer type input");
            }
        }
        catch(Exception e)
        {
            System.out.println("please provide integer type input");
        }
    }
}
