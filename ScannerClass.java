import java.util.Scanner;
public class ScannerClass{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        double in=n.nextDouble();
        Float is=n.nextFloat();
        String str1=n.next();
        Scanner str=new Scanner(System.in);
        String str2=str.nextLine();
        System.out.println("double:"+in);
        System.out.println("Float:"+is);
        System.out.println(" char in string:"+str1);
        System.out.println(" String : "+str2);
    }
}