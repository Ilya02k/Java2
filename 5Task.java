package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int arr[];
        int N,K;
        Scanner in= new Scanner(System.in);
        System.out.println("Input N: ");
        N=in.nextInt();
        arr=new int [N];
        System.out.println("Input the elements of array: ");
        for(int i=0;i<N;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("The elements which a[i]>i ");
        for(int i=0;i<N;i++) {
            if (arr[i] > i) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
