
import java.util.Scanner;
public class Logical{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the marks:");
        int marks=sc.nextInt();
        if((marks>90)&&(marks<=100)){
            System.out.println(" your pass!");
            System.out.println("Grade:A");
        }
        else if((marks<50)&&(marks>35)){
            System.out.println(" your pass!");
            System.out.println("Grade:c");
        }
        else if((marks<75)&&(marks>50)){
            System.out.println("pass");
            System.out.println("Grade:B");
        }
        else if((marks<50)||(marks==35)){
            System.out.println(" your pass!");
            System.out.println(" Grade:E");
        }
        else{
            System.out.println("Fail");
        }


    }
}