import java.util.Scanner;

public class First{

    public static void main(String [] args){
        int a,b,c;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two numbers");

        a=sc.nextInt();

        b=sc.nextInt();

        c=a+b;

        System.out.println("Sum="+(a+b));
    }
}