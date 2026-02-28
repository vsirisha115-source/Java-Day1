import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
public class Dynamic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the size of the array:");
        int size =sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array elements are:");
        for(int i=0;i<size;i++){
            System.out.print("Element " + (i + 1) + ": ");
            arr[i]=sc.nextInt();
        }  
        System.out.println("You entered the following elements:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }  
        
    }
}