/*
 1. Write a JAVA program to find the value of largest element in list of n 
numbers and perform mathematical analysis of the algorithm */
import java.util.Scanner;

public class lab1_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        System.out.println("Enter the no of terms");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) 
        {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) 
            {
                if(max<a[i])
                
                    max=a[i];
                
            }
        System.out.println("Largest number is "+max);
    }
}
        
