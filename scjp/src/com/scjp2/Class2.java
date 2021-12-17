package com.scjp2;

import java.util.Scanner;
public class Class2{  
public static int getSecondLargest(int[] a, int n1){  
int temp;  
for (int i = 0; i < a.length; i++)   
        {  
            for (int j = i + 1; j < a.length; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[a.length-n1];  
}  
public static void main(String args[]){  
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int n1=sc.nextInt();
    int a[]=new int[n]; 
    for(int i=0;i<a.length;i++)
    {
    	a[i]=sc.nextInt();
    }
    System.out.println(getSecondLargest(a,n1));  
 }}  