/*
 1. Write a JAVA program to find the value of largest element in list of n 
numbers and perform mathematical analysis of the algorithm */
import java.util.Scanner;
/*
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
        

/*
 Write a JAVA program to check whether all the elements in a given 
array is distinct and perform mathematical analysis of the algorithm

import java.util.Scanner;
public class lab1_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int key,i,j,max=0;
        System.out.println("Enter the number of elements");
        int n =sc.nextInt();
        int a[]=new int[n];
        for ( i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for ( i = 0; i < n; i++) 
            {
                key=a[i];
        for ( j = i+1; j < n; j++) 
            {
                if(key==a[j])
                 max++;
            }
            }
        if(max==0)
        {
            System.out.println("array is distinct");
        }
        else
            System.out.println("array is not distinct");
    }
}



import java.util.Scanner;

/*
 Write a JAVA program to do matrix multiplication and perform 
mathematical analysis of the algorithm
 */

/*
public class lab1_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of rows");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns");
        int n=sc.nextInt();
        int a[][]=new int[100][100];     
        int b[][]=new int[100][100];
        int c[][]=new int[100][100];
        System.out.println("Enter the elements of the matrix A");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=n; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the matrix B");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                b[i][j]=sc.nextInt();
            }
        }
         for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum=0;
                for (int k = 1; k <=n ; k++) {
                    sum=sum+a[i][k]*b[k][j];
                }
                    c[i][j]=sum;
                }
            }
                
            for (int i = 1; i <= m; i++)
            {
                for (int j = 1; j <= n; j++) {
                    System.out.println(c[i][j]+" ");
                }
                System.out.println("\n");
            }
         }
    }
        
                    


import java.util.Scanner;

/*
Write a JAVA program to compute factorial function F(n) = n! for an 
arbitrary non negative integer n and perform mathematical analysis of 
the algorithm
 */
/*
public class lab1_4 {
    public static int fact(int n)
    {
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int s;
        System.out.println("Enter the number");
        s=sc.nextInt();
        System.out.println("The factorial of "+s+" is "+fact(s));
    }
}
                
                
                
                
           
                
                
                
                
    }
   
}
*/
                    
                
         
        
        
        
        
        
        
  
