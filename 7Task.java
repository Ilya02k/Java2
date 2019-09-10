package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double arr[];
        int N;
        Scanner in= new Scanner(System.in);
        System.out.println("Input N: ");
        N=in.nextInt();
        arr=new double [N];
        System.out.println("Input the elements of array: ");
        for(int i=0;i<N;i++)
        {
            arr[i]=in.nextDouble();
        }
        double smax=arr[0]+arr[1];
        double s=0;
        for(int i=0;i<N-1;i++) {
            if(i<N) {
                s = arr[i] + arr[i + 1];
            }
            else if(i==N)
            {
                s=arr[i-1];
            }
           if(s>smax)
           {
               smax=s;
           }
        }
        System.out.println("Max An+An+1 "+smax);
    }
}
