
import java.util.Scanner;
public class Student{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String Name=sc.nextLine();
        int Age=sc.nextInt();
        int marks=sc.nextInt();
        if(marks>=35){
            System.out.println(" Status:Pass");
            }
        else{
            System.out.println("Status :fail");
            }
            System.out.println("Name:"+Name);
            System.out.println("Age:"+Age);
            System.out.println("Marks:"+marks);

    }
}
