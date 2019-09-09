package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double arr[];
        int N=0;
        int count1=0,count2=0,count3=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Input N(int): ");
        N=in.nextInt();
        arr= new double[N];
        System.out.println("Input the elements of array: ");
        for(int i=0;i<N;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if (arr[i]>0)
            {
                count1++;
            }
            else if(arr[i]<0)
            {
                count2++;
            }
            else if(arr[i]==0.0)
            {
                count3++;
            }
        }
        System.out.println("Counts of elements > 0: "+count1);
        System.out.println("Counts of elements < 0: "+count2);
        System.out.println("Counts of elements = 0: "+count3);
    }
}
