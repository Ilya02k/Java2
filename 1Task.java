package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int arr[];
	int N,K;
	Scanner in= new Scanner(System.in);
	System.out.println("Input N and K: ");
	N=in.nextInt();
	K=in.nextInt();
	arr=new int [N];
	int sum=0;
	System.out.println("Input the elements of array: ");
	for(int i=0;i<N;i++)
    {
        arr[i]=in.nextInt();
    }
    for(int i=0;i<N;i++)
    {
        if (arr[i]%K==0)
        {
            sum+=arr[i];
        }
    }
    System.out.println("Sum= "+sum);
    }
}
