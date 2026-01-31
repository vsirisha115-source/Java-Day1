import java.util.Scanner;
public class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of r:");
        double r= sc.nextDouble();
        double Area=(3.14*r*r);
        System.out.println("Area of the circle: "+Area);
    }
}