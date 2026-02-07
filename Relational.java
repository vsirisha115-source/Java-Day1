import java.util.Scanner;
public class Relational{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value:");
        float a= sc.nextFloat();
        System.out.println(" Enter b value:");
        float b=sc.nextFloat();
        System.out.println("==:"+(a==b));
        System.out.println("!= "+(a!=b));
        System.out.println("> "+(a>b));
        System.out.println(">= "+(a>=b));
        System.out.println("< "+(a<b));
        System.out.println("<="+(a<=b));
    }
}