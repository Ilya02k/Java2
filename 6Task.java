package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double arr[];
        int N=0;
        int min=0,max=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Input N(int): ");
        N=in.nextInt();
        arr= new double[N];
        System.out.println("Input the elements of array: ");
        for(int i=0;i<N;i++)
        {
            arr[i]=in.nextInt();
        }
        int j,c,count=0,sum=0;
        for(int i=0;i<N;i++) {
            j=i;
            for (int v = 1; v <= i; v++) {
                if (j % (double)v == 0.0) {
                    count++;
                }
            }
            if(count==2)
            {
                sum+=arr[i];
            }
            count=0;
        }
        if(sum==0.0)
        {
            System.out.println(" There are not numbers to satisfy the condition ");
        }
        if(sum!=0) {
            System.out.println("Sum= " + sum);
        }
    }
}
